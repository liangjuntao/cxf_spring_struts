#learening

作为自己学习的一个记录。


#项目介绍：

**学习总结.docx**  
大杂烩，记录知识点。

**web service相关**</br>
ws\_client: 采用cxf框架，实现访问别人发布的web service服务。  
ws\_server: 采用cxf框架，实现web service的发布。  

interceptor\_ws\_server: 基于ws\_server，采用cxf框架自带拦截器，实现对日志的收集。 
interceptor\_ws\_client: 基于ws\_client，采用cxf框架自带拦截器，实现
对日志的收集。

auth\_ws\_server:基于interceptor\_ws\_server，去除cxf框架自带的拦截器，采用自定义拦拦截soap消息，检查账号和密码尽心授权访问。  
auth\_ws\_client:基于interceptor\_ws\_client,去除cxf框架自带的拦截器，采用自定义拦截器拦截将要发出的soap消息，在soap Header头中添加账号和密码，实现客户端使用授权账号和密码访问。  



