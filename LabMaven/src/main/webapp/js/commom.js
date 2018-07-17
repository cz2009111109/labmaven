function getContextPath(){   
    var pathName = document.location.pathname;   
    var index = pathName.substr(1).indexOf("/");   
    var result = pathName.substr(1,index);   
    return result;   
}
function addLinkFavicon(linkUrl){
	var faviconUrl=linkUrl+"favicon.png";
	linkTag=$('<link href="' + faviconUrl + '" rel="shortcut icon" type="image/x-icon" />');
	$($('head')[0]).append(linkTag);
	
}
