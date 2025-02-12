# Java-HW4project
Java購物管理系統
## 專案說明
購物管理系統，基於 MVC（Model-View-Controller） 設計來組織系統架構。系統包含 DAO層和 Service 層，使用後端 MySQL 進行資料庫操作。
<hr>
<ul>
  
```markdown
## 目錄結構  
HW4/src
├─controller
│  ├─member
│      AddMemberErrorUI.java
│      AddMemberSuccessUI.java
│      AddMemberUI.java
│      LoginErrorUI.java
│      LoginSuccessUI.java
│      LoginUI.java
│  ├─mlist
│      AddMlist UI.java
│      ManagerMlistUI.java
│      MlistMainUI.java
├─dao
│  │─MemberDao.java
│  ├─MlistDao.java
│  └─impl
│      MemberDaoImpl.java
│      MlistDaoImpl.java
├─model
│    │─Member.java
│    │─Mlist .java
├─service
│  │─MemberService.java
│  │─MlistService.java
│  └─impl
│      MemberServiceImpl.java
│      MlistService.java
└─util
   │─DbConnection.java
   │─Tool.java

src 目錄檔案說明如下:   
◆controller/member/ 用於 UI 控制。
AddMemberUI.java 新增會員的 UI 介面。
AddMemberSuccessUI.java 顯示會員成功新增的介面。
AddMemberErrorUI.java 顯示會員新增失敗的介面。
LoginUI.java 會員登入的 UI 介面。
LoginSuccessUI.java 顯示會員成功登入的介面。
LoginErrorUI.java 顯示登入失敗的介面


