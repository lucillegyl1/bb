const menu = {
    list() {
        return [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除"],"menu":"文章分类","menuJump":"列表","tableName":"wenzhangfenlei"}],"menu":"文章分类管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"文章标签","menuJump":"列表","tableName":"wenzhangbiaoqian"}],"menu":"文章标签管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","修改","删除","审核","查看评论"],"menu":"文章信息","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"留言板","tableName":"messages"}],"menu":"留言板"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["查看","修改","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"文章信息列表","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","查看评论"],"menu":"文章信息","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"文章信息列表","menuJump":"列表","tableName":"wenzhangxinxi"}],"menu":"文章信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;
