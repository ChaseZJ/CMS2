package com.mashen.slideShowService;

import java.util.List;

import com.mashen.domian.SlideShow;

public interface SlideShowService {
	public int slideShowAdd(SlideShow slideShow);
	public int slideShowDelete(Integer slideShowId);
	public int slideShowUpdate(SlideShow slideShow);
	public List<SlideShow> slideShowSearch(SlideShow slideShow);
	public List<SlideShow> slideShowing();
	public List<SlideShow> slideShouPush(Integer slideShowId);
	public List<SlideShow> slideShouPushOff(Integer slideShowId);
}
