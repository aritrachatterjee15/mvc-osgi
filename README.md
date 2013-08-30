mvc-osgi
========

A project demonstrating a web application in an OSGi environment using Gemini Blueprint, Gemini JPA, Spring-MVC, Equinox.

Running the application:

List of bundles required to run the application:
id	State       Bundle
0	ACTIVE      org.eclipse.osgi_3.9.0.v20130529-1710
1	ACTIVE      org.eclipse.gemini.web.extender_2.1.0.RELEASE
2	ACTIVE      org.eclipse.virgo.util.osgi_3.5.0.RELEASE
3	ACTIVE      org.eclipse.core.expressions_3.4.500.v20130515-1343
4	ACTIVE      ch.qos.logback.core_1.0.7
5	RESOLVED    org.apache.jasper_7.0.26.v201205030742
	            Master=24
6	ACTIVE      jackson-mapper-asl_1.9.8
7	ACTIVE      org.eclipse.persistence.core_2.4.2.v20130514-5956486
8	RESOLVED    org.apache.coyote_7.0.26.v201205030742
	            Master=24
9	ACTIVE      com.springsource.freemarker_2.3.15
11	ACTIVE      osgi.enterprise_4.2.0.v201108120515
12	ACTIVE      org.apache.tomcat.api_7.0.26.v201205020640
13	ACTIVE      org.springframework.core_3.1.4.RELEASE
14	ACTIVE      org.eclipse.jdt.core_3.9.0.xx-20130228-1500-e43
	            Fragments=56
15	ACTIVE      org.springframework.transaction_3.1.4.RELEASE
16	ACTIVE      org.apache.felix.gogo.runtime_0.10.0.v201209301036
17	ACTIVE      javax.xml.stream_1.0.1.v201004272200
18	ACTIVE      org.eclipse.persistence.jpa.jpql_2.0.1.v20130514-5956486
19	ACTIVE      org.eclipse.core.runtime_3.9.0.v20130326-1255
20	ACTIVE      javax.servlet_3.0.0.v201112011016
21	ACTIVE      org.eclipse.core.commands_3.6.100.v20130124-145547
22	ACTIVE      org.apache.geronimo.specs.geronimo-jpa_2.0_spec_1.1.0
23	ACTIVE      org.eclipse.equinox.console_1.0.100.v20130429-0953
24	ACTIVE      org.apache.catalina_7.0.26.v201205021508
	            Fragments=5, 8, 36, 40, 85
25	ACTIVE      org.eclipse.virgo.util.io_3.5.0.RELEASE
26	ACTIVE      com.springsource.org.aopalliance_1.0.0
27	ACTIVE      org.eclipse.gemini.blueprint.extender_1.0.0.RELEASE
28	ACTIVE      org.eclipse.virgo.util.math_3.5.0.RELEASE
29	ACTIVE      com.springsource.javax.mail_1.4.1
30	ACTIVE      javax.xml.soap_1.2.0.v201005080501
31	ACTIVE      org.eclipse.equinox.http.registry_1.1.300.v20130402-1529
32	ACTIVE      org.springframework.jdbc_3.1.4.RELEASE
33	ACTIVE      org.apache.felix.gogo.command_0.10.0.v201209301215
34	ACTIVE      org.aopalliance_1.0.0.v201105210816
35	ACTIVE      org.eclipse.equinox.cm_1.0.400.v20130327-1442
36	RESOLVED    org.apache.tomcat.util_7.0.26.v201205030742
	            Master=24
37	ACTIVE      org.eclipse.core.jobs_3.5.300.v20130429-1813
38	ACTIVE      org.apache.geronimo.specs.geronimo-j2ee-management_1.1_spec_1.0.1
39	ACTIVE      org.apache.felix.gogo.shell_0.10.0.v201212101605
40	RESOLVED    org.apache.catalina.tribes_7.0.26.v201205030742
	            Master=24
41	ACTIVE      org.eclipse.equinox.http.servlet_1.1.400.v20130418-1354
42	ACTIVE      ch.qos.logback.classic_1.0.7
43	ACTIVE      org.slf4j.api_1.7.2.v20121108-1250
44	ACTIVE      org.apache.geronimo.specs.geronimo-annotation_1.1_spec_1.0.1
45	ACTIVE      com.springsource.net.sf.cglib_2.1.3
46	ACTIVE      org.springframework.context.support_3.1.4.RELEASE
47	ACTIVE      javax.xml.rpc_1.1.0.v201209140446
48	ACTIVE      org.eclipse.text_3.5.300.v20121210-150853
49	ACTIVE      org.springframework.orm_3.1.4.RELEASE
50	ACTIVE      org.eclipse.virgo.util.common_3.5.0.RELEASE
51	ACTIVE      org.springframework.asm_3.1.4.RELEASE
52	ACTIVE      org.eclipse.equinox.registry_3.5.300.v20130327-1442
53	ACTIVE      com.mysql.jdbc_5.1.26
54	ACTIVE      jackson-core-asl_1.9.8
55	ACTIVE      org.eclipse.core.filesystem_1.4.0.v20130122-153237
56	RESOLVED    org.eclipse.jdt.compiler.apt_1.0.600.v20130530-1010
	            Master=14
58	ACTIVE      org.eclipse.core.contenttype_3.4.200.v20130326-1255
59	ACTIVE      org.springframework.aop_3.1.4.RELEASE
60	ACTIVE      org.eclipse.virgo.util.parser.manifest_3.5.0.RELEASE
61	ACTIVE      org.eclipse.gemini.jpa_1.1.0.RELEASE
62	ACTIVE      javax.el_2.2.0.v201303151357
63	ACTIVE      javax.inject_1.0.0.v20091030
64	ACTIVE      org.springframework.context_3.1.4.RELEASE
65	ACTIVE      org.eclipse.equinox.app_1.3.100.v20130327-1442
66	ACTIVE      javax.persistence_2.0.5.v201212031355
67	ACTIVE      org.eclipse.gemini.web.core_2.1.0.RELEASE
68	ACTIVE      slf4j.api_1.6.6
70	ACTIVE      org.springframework.data.core_1.3.1.RELEASE
71	ACTIVE      javax.servlet.jsp_2.2.0.v201112011158
72	ACTIVE      org.eclipse.gemini.blueprint.io_1.0.0.RELEASE
73	ACTIVE      org.eclipse.gemini.web.tomcat_2.1.0.RELEASE
74	ACTIVE      org.springframework.web_3.1.4.RELEASE
75	ACTIVE      org.eclipse.equinox.preferences_3.5.100.v20130422-1538
76	ACTIVE      org.springframework.beans_3.1.4.RELEASE
77	ACTIVE      javax.xml_1.3.4.v201005080400
78	ACTIVE      org.eclipse.virgo.util.osgi.manifest_3.5.0.RELEASE
79	ACTIVE      org.eclipse.persistence.asm_3.3.1.v201302191223
80	ACTIVE      javax.annotation_1.1.0.v201209060031
81	ACTIVE      org.springframework.oxm_3.1.4.RELEASE
83	ACTIVE      org.springframework.expression_3.1.4.RELEASE
84	ACTIVE      org.apache.el_7.0.26.v201205020640
85	RESOLVED    org.apache.catalina.ha_7.0.26.v201205030525
	            Master=24
86	ACTIVE      com.ibm.icu_50.1.0.v20121116-2
87	ACTIVE      org.springframework.web.servlet_3.1.4.RELEASE
88	ACTIVE      org.eclipse.equinox.common_3.6.200.v20130402-1505
89	ACTIVE      com.springsource.javax.ejb_3.0.0
90	ACTIVE      org.apache.juli.extras_7.0.26.v201205020640
91	ACTIVE      org.eclipse.persistence.jpa_2.4.2.v20130514-5956486
92	ACTIVE      org.eclipse.osgi.services_3.3.100.v20130513-1956
93	ACTIVE      org.eclipse.gemini.blueprint.core_1.0.0.RELEASE
94	ACTIVE      org.apache.commons.logging_1.1.1.v201101211721
95	ACTIVE      org.eclipse.core.resources_3.8.100.v20121218-144628
96	ACTIVE      org.eclipse.persistence.antlr_3.2.0.v201302191141

Start Level for core bundles:
org.eclipse.osgi - -1 (Framework Bundle)
mysql-jdbc - 2
javax-persistence - 2
osgi.enterprise - 2
org.eclipse.equinox.common - 2
org.eclipse.gemini.blueprint.extender - 3
org.eclipse.gemini.jpa - 3
Default (all other bundles) - 4

There seems to be currently a bug in Spring Web Servlet that causes issues with OSGi deployment. A bug has been raised for it: https://jira.springsource.org/browse/SPR-10879#comment-93203
Follow the solution mentioned in the bug description, as a workaround.

