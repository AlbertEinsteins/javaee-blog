$(function() {

  var beforeHeight = $(window).scrollTop() ;
  var hideHeight = 25;
  var isHide = false ;

  $(window).scroll(function() {
    var afterHeight = $(window).scrollTop(),
        updown = afterHeight - beforeHeight ;
    // if(0 === updown) return false ;
    // beforeHeight = afterHeight ;
    

    //设置顶部栏的动画效果
    //如果向下滚动25px那么将隐藏, isHide用来控制只设置一次属性
    if(afterHeight >= hideHeight && !isHide) {
      console.log($("#nav")) ;
      $("#nav").animate({
        "margin-top": "-25px"
      }) ;
      //搜索框
      $("#page-search").animate({
        'width': '200px'
      }) ;

      $("#nav .right .menu-item").animate({
        "width": '740px',
      }) ;
      isHide = !isHide ;
    }

    //如果向上滚动小于25px那么恢复
    if(afterHeight <= hideHeight && isHide) {
      $("#nav").animate({
        "margin-top": 0
      }) ;

      $("#nav .right .menu-item").animate({
        "width": '760px'
      }) ;
      $("#page-search").animate({
        'width': '1080px'
      }) ;
      isHide = !isHide ;
    }




  }) ;
}) ;