# Java-HW4project
## Java購物管理系統
### 專案說明
購物管理系統，基於 MVC（Model-View-Controller） 設計來組織系統架構。系統包含 DAO層和 Service 層，使用後端 MySQL 進行資料庫操作。 

---

### 目錄結構

```HW4/src
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
│      MlistServiceImpl.java
└─util
   │─DbConnection.java
   │─Tool.java
```
---
### src 目錄檔案說明
#### **controller/member**（UI 控制）
- `AddMemberUI.java` - 新增會員 UI 介面。
- `AddMemberSuccessUI.java` - 會員成功新增介面。
- `AddMemberErrorUI.java` - 會員新增失敗介面。
- `LoginUI.java` - 會員登入 UI 介面。
- `LoginSuccessUI.java` - 會員成功登入介面。
- `LoginErrorUI.java` - 登入失敗介面。

#### **controller/mlis**（UI 控制）
- `AddMlist UI.java`-新增訂單 UI 介面。
- `ManagerMlistUI.java`-管理選項 UI 介面。
- `MlistMainUI.java`-明細表管理 UI 介面。

#### src/dao/ DAO層，負責資料庫的存取操作
- `MemberDao.java`-會員相關資料庫操作接口。
- `MlistDao.java`- 明細表相關資料庫操作接口。

#### dao/impl/ DAO實作類別
- `MemberDaoImpl.java`-MemberDao介面實作，執行資料庫互動。
- `MlistDaoImpl.java`-MlistDao介面實作，執行明細表的資料庫互動。

#### src/model/ Model負責定義應用程式結構
- ` Member.java `-會員屬性。
- ` Mlist .java`-明細表屬性。

#### src/service/ Service層，負責執行邏輯處理，通常調用DAO層來處理資料
- ` MemberService.java `-定義會員相關。
- ` MlistService.java `-定義明細表相關。

#### service/impl/ Service實作類別
- `MemberServiceImpl.java`- MemberService 介面實作，處理會員相關。
- `MlistServiceImpl.java`- MlistService介面實作，明細表業相關。

#### src/util/工具類別與通用功能
- ` DbConnection.java `-管理資料庫的連線。
- ` Tool.java `-通用工具類別輔助函數。
---


