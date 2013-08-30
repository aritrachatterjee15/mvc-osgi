mvc-osgi
========

A project demonstrating a web application in an OSGi environment using Gemini Blueprint, Gemini JPA, Eclipselink, Spring-MVC, Equinox.

Running the application:
==========================

Core OSGi and Eclipse Bundles:
-------------------------------
* org.eclipse.osgi_3.9.0.v20130529-1710
* osgi.enterprise_4.2.0.v201108120515
* org.eclipse.core.expressions_3.4.500.v20130515-1343
* org.eclipse.core.runtime_3.9.0.v20130326-1255
* org.eclipse.equinox.http.registry_1.1.300.v20130402-1529
* org.eclipse.equinox.cm_1.0.400.v20130327-1442
* org.eclipse.jdt.core_3.9.0.xx-20130228-1500-e43
* org.eclipse.core.commands_3.6.100.v20130124-145547
* org.eclipse.equinox.http.servlet_1.1.400.v20130418-1354
* org.eclipse.core.filesystem_1.4.0.v20130122-153237
* org.eclipse.jdt.compiler.apt_1.0.600.v20130530-1010
* org.eclipse.equinox.app_1.3.100.v20130327-1442
* org.eclipse.core.contenttype_3.4.200.v20130326-1255
* org.eclipse.equinox.common_3.6.200.v20130402-1505
* org.eclipse.core.resources_3.8.100.v20121218-144628
* org.eclipse.equinox.console_1.0.100.v20130429-0953
* org.apache.felix.gogo.command_0.10.0.v201209301215
* org.eclipse.core.jobs_3.5.300.v20130429-1813
* org.eclipse.equinox.preferences_3.5.100.v20130422-1538
* org.apache.felix.gogo.runtime_0.10.0.v201209301036
* org.apache.felix.gogo.shell_0.10.0.v201212101605
* org.eclipse.equinox.registry_3.5.300.v20130327-1442
* org.eclipse.osgi.services_3.3.100.v20130513-1956
* org.eclipse.text_3.5.300.v20121210-150853
* com.ibm.icu_50.1.0.v20121116-2
* javax.xml_1.3.4.v201005080400

EclipseLink:
--------------
* org.eclipse.persistence.core_2.4.2.v20130514-5956486
* org.eclipse.persistence.jpa.jpql_2.0.1.v20130514-5956486
* org.eclipse.persistence.antlr_3.2.0.v201302191141
* org.eclipse.persistence.jpa_2.4.2.v20130514-5956486
* org.eclipse.persistence.asm_3.3.1.v201302191223

Gemini Blueprint:
------------------
* org.eclipse.gemini.blueprint.extender_1.0.0.RELEASE
* org.eclipse.gemini.blueprint.io_1.0.0.RELEASE
* org.eclipse.gemini.blueprint.core_1.0.0.RELEASE

Gemini JPA:
------------
* org.eclipse.gemini.jpa_1.1.0.RELEASE
* javax.persistence_2.0.5.v201212031355

Tomcat and it's dependencies:
------------------------------
* org.apache.coyote_7.0.26.v201205030742
* org.apache.tomcat.api_7.0.26.v201205020640
* org.apache.catalina.tribes_7.0.26.v201205030742
* org.apache.catalina_7.0.26.v201205021508
* org.apache.catalina.ha_7.0.26.v201205030525
* org.apache.tomcat.util_7.0.26.v201205030742
* org.eclipse.virgo.util.osgi_3.5.0.RELEASE
* org.apache.jasper_7.0.26.v201205030742
* org.eclipse.virgo.util.io_3.5.0.RELEASE
* javax.servlet_3.0.0.v201112011016
* org.eclipse.virgo.util.math_3.5.0.RELEASE
* javax.xml.soap_1.2.0.v201005080501
* javax.xml.rpc_1.1.0.v201209140446
* org.eclipse.virgo.util.common_3.5.0.RELEASE
* org.eclipse.virgo.util.osgi.manifest_3.5.0.RELEASE
* org.eclipse.virgo.util.parser.manifest_3.5.0.RELEASE
* com.springsource.javax.ejb_3.0.0
* com.springsource.javax.mail_1.4.1
* org.apache.juli.extras_7.0.26.v201205020640
* slf4j.api_1.6.6
* javax.annotation_1.1.0.v201209060031
* javax.el_2.2.0.v201303151357
* org.apache.el_7.0.26.v201205020640
* javax.servlet.jsp_2.2.0.v201112011158

Gemini Web:
------------
* org.eclipse.gemini.web.extender_2.1.0.RELEASE
* org.eclipse.gemini.web.core_2.1.0.RELEASE
* org.eclipse.gemini.web.tomcat_2.1.0.RELEASE
* jackson-mapper-asl_1.9.8
* jackson-core-asl_1.9.8

Springframework:
-----------------
* org.springframework.core_3.1.4.RELEASE
* com.springsource.net.sf.cglib_2.1.3
* org.springframework.context.support_3.1.4.RELEASE
* org.springframework.orm_3.1.4.RELEASE
* com.springsource.org.aopalliance_1.0.0
* org.springframework.transaction_3.1.4.RELEASE
* org.springframework.aop_3.1.4.RELEASE
* org.springframework.jdbc_3.1.4.RELEASE
* org.springframework.beans_3.1.4.RELEASE
* org.springframework.oxm_3.1.4.RELEASE
* org.springframework.expression_3.1.4.RELEASE
* org.springframework.web.servlet_3.1.4.RELEASE
* org.springframework.context_3.1.4.RELEASE
* org.springframework.web_3.1.4.RELEASE
* org.springframework.asm_3.1.4.RELEASE
* org.aopalliance_1.0.0.v201105210816
* org.apache.commons.logging_1.1.1.v201101211721

Logback:
---------
* org.slf4j.api_1.7.2.v20121108-1250
* ch.qos.logback.core_1.0.7
* ch.qos.logback.classic_1.0.7

MySql Driver:
--------------
* com.mysql.jdbc_5.1.26

Start Level for core bundles:
------------------------------
* org.eclipse.osgi: -1 (Framework Bundle)
* mysql-jdbc: 2
* javax-persistence: 2
* osgi.enterprise - 2
* org.eclipse.equinox.common: 2
* org.eclipse.gemini.blueprint.extender: 3
* org.eclipse.gemini.jpa: 3
* Default (all other bundles): 4

There seems to be currently a bug in Spring Web Servlet that causes issues with OSGi deployment. A bug has been raised for it: https://jira.springsource.org/browse/SPR-10879#comment-93203
Follow the solution mentioned in the bug description, as a workaround.


