const base = {
    get() {
        return {
            url : "http://localhost:8080/springboota441k/",
            name: "springboota441k",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboota441k/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于springboot的个人博客网站的设计与实现 "
        } 
    }
}
export default base
