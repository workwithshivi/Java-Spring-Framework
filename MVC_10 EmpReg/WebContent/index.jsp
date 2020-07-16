
<%@taglib uri="http://www.springframework.org/tags/form" prefix="html"%>

<html:form commandName="form">
	<pre>
Name:<html:input path="name" />
Email<html:input path="email" />
Address:<html:input path="address" />
	<html:errors />
	<input type="submit" value="submit">
	</pre>
</html:form>
