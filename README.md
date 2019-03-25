Steps to reproduce:

- unzip liferay-dxp-digital-enterprise-tomcat-7.0.10.10-sp10-20190128202135661.zip
- copy in dev licence
- install liferay-fix-pack-de-71-7010.zip and liferay-hotfix-4157-7010.zip
- start server
- go through the config wizard
- build and deploy ImpersonateIssue portlet on front page
- go to control panel, create and impersonate some user ("Dummy User")
- go to the ImpersonateIssue portlet, you are "Dummy User"
- navigate with the button, you are "Test Test" (?)
