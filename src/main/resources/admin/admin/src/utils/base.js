const base = {
    get() {
        return {
            url : "http://localhost:8080/yinhangsystem/",
            name: "yinhangsystem",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "银行账户管理系统"
        } 
    }
}
export default base
