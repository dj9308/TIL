package my.spring.springedu;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.MeetingDAO;
import vo.MeetingVO;
@Controller
public class MeetingController  {
   @Autowired
   MeetingDAO dao;
   @RequestMapping("/meeting")
   protected ModelAndView select(MeetingVO vo, String action, String keyword) {
      ModelAndView mav = new ModelAndView();
      if (vo.getName() != null && vo.getMeetingDate() != null 
                 && vo.getTitle() != null) {
    	  
    	  if(action!=null  && action.equals("insert")) {
    		  boolean result = dao.insert(vo);
              if(result) {
                 mav.addObject("msg", "성공적으로 저장되었어요.");
              } else{
                 mav.addObject("msg", "작성을 실패했어요.");
              }
    	  }
    	 else if(action!=null && !action.equals("insert")){
        	 vo.setId(Integer.parseInt(action));
            boolean result = dao.update(vo);
            if(result) {
               mav.addObject("msg", "성공적으로 수정되었어요.");
            }else{
               mav.addObject("msg", "수정을 실패했어요.");
            }
         }
    	 else if(action==null) {
             boolean result = dao.insert(vo);
             if(result) {
                mav.addObject("msg", "성공적으로 저장되었어요.");
             } else{
                mav.addObject("msg", "작성을 실패했어요.");
             }
          }
      }else if (vo.getId() != 0){
         boolean result = dao.delete(vo.getId());
         if(result) {
            mav.addObject("msg", vo.getId() + "번 글이 삭제되었습니다.");
         } else {
            mav.addObject("msg", vo.getId() + "번 글이 존재하지 않습니다.");
         }
      }
      
      if(keyword!=null) {
         List<MeetingVO> list = dao.search(keyword);
         if(list.size() != 0) {
            mav.addObject("list", list);
         } else {
            mav.addObject("msg", keyword + "로 검색된 미팅 정보가 없습니다.");
         }
      }else {
    	  List<MeetingVO> list = dao.listAll();
          if(list.size() != 0) {
             mav.addObject("list", list);
          } else {
             mav.addObject("msg", "추출된 미팅 정보가 없습니다.");
          }
      }
      mav.setViewName("meetingView2");
      return mav;    
   }
}