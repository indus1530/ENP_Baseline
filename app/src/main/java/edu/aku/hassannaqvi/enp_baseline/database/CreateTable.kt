package edu.aku.hassannaqvi.enp_baseline.database


import edu.aku.hassannaqvi.enp_baseline.contracts.TableContracts.*


object CreateTable {


    const val SQL_CREATE_FORMS = ("CREATE TABLE "
            + FormsTable.TABLE_NAME + "("
            + FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormsTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormsTable.COLUMN_UID + " TEXT,"
            + FormsTable.COLUMN_PSU_CODE + " TEXT,"
            + FormsTable.COLUMN_HHID + " TEXT,"
            + FormsTable.COLUMN_SNO + " TEXT,"
            + FormsTable.COLUMN_USERNAME + " TEXT,"
            + FormsTable.COLUMN_SYSDATE + " TEXT,"
            + FormsTable.COLUMN_ISTATUS + " TEXT,"
            + FormsTable.COLUMN_DEVICEID + " TEXT,"
            + FormsTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormsTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + FormsTable.COLUMN_SYNCED + " TEXT,"
            + FormsTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormsTable.COLUMN_APPVERSION + " TEXT,"
            + FormsTable.COLUMN_PROVINCE_CODE + " TEXT,"
            + FormsTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + FormsTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + FormsTable.COLUMN_UC_CODE + " TEXT,"
            + FormsTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + FormsTable.COLUMN_A105B + " TEXT,"
            + FormsTable.COLUMN_A106 + " TEXT,"
            + FormsTable.COLUMN_A107 + " TEXT,"
            + FormsTable.COLUMN_SA1 + " TEXT,"
            + FormsTable.COLUMN_SA3A + " TEXT,"
            + FormsTable.COLUMN_SA3B + " TEXT,"
            + FormsTable.COLUMN_SA4 + " TEXT,"
            + FormsTable.COLUMN_SA5 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_FAMILYMEMBERS = ("CREATE TABLE "
            + FamilyMembersTable.TABLE_NAME + "("
            + FamilyMembersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyMembersTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyMembersTable.COLUMN_UID + " TEXT,"
            + FamilyMembersTable.COLUMN_UUID + " TEXT,"
            + FamilyMembersTable.COLUMN_PSU_CODE + " TEXT,"
            + FamilyMembersTable.COLUMN_HHID + " TEXT,"
            + FamilyMembersTable.COLUMN_SNO + " TEXT,"
            + FamilyMembersTable.COLUMN_USERNAME + " TEXT,"
            + FamilyMembersTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyMembersTable.COLUMN_INDEXED + " TEXT,"
            + FamilyMembersTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FamilyMembersTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyMembersTable.COLUMN_SA2 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_RECIPIENT = ("CREATE TABLE "
            + RecipientTable.TABLE_NAME + "("
            + RecipientTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + RecipientTable.COLUMN_PROJECT_NAME + " TEXT,"
            + RecipientTable.COLUMN_UID + " TEXT,"
            + RecipientTable.COLUMN_UUID + " TEXT,"
            + RecipientTable.COLUMN_FMUID + " TEXT,"
            + RecipientTable.COLUMN_PSU_CODE + " TEXT,"
            + RecipientTable.COLUMN_HHID + " TEXT,"
            + RecipientTable.COLUMN_SNO + " TEXT,"
            + RecipientTable.COLUMN_USERNAME + " TEXT,"
            + RecipientTable.COLUMN_SYSDATE + " TEXT,"
            + RecipientTable.COLUMN_INDEXED + " TEXT,"
            + RecipientTable.COLUMN_ISTATUS + " TEXT,"
            + RecipientTable.COLUMN_DEVICEID + " TEXT,"
            + RecipientTable.COLUMN_DEVICETAGID + " TEXT,"
            + RecipientTable.COLUMN_SYNCED + " TEXT,"
            + RecipientTable.COLUMN_SYNCED_DATE + " TEXT,"
            + RecipientTable.COLUMN_APPVERSION + " TEXT,"
            + RecipientTable.COLUMN_SB1 + " TEXT,"
            + RecipientTable.COLUMN_SB2 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MWRA = ("CREATE TABLE "
            + MwraTable.TABLE_NAME + "("
            + MwraTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + MwraTable.COLUMN_PROJECT_NAME + " TEXT,"
            + MwraTable.COLUMN_UID + " TEXT,"
            + MwraTable.COLUMN_UUID + " TEXT,"
            + MwraTable.COLUMN_FMUID + " TEXT,"
            + MwraTable.COLUMN_SNO + " TEXT,"
            + MwraTable.COLUMN_PSU_CODE + " TEXT,"
            + MwraTable.COLUMN_HHID + " TEXT,"
            + MwraTable.COLUMN_USERNAME + " TEXT,"
            + MwraTable.COLUMN_SYSDATE + " TEXT,"
            + MwraTable.COLUMN_INDEXED + " TEXT,"
            + MwraTable.COLUMN_ISTATUS + " TEXT,"
            + MwraTable.COLUMN_DEVICEID + " TEXT,"
            + MwraTable.COLUMN_DEVICETAGID + " TEXT,"
            + MwraTable.COLUMN_SYNCED + " TEXT,"
            + MwraTable.COLUMN_SYNCED_DATE + " TEXT,"
            + MwraTable.COLUMN_APPVERSION + " TEXT,"
            + MwraTable.COLUMN_SC1 + " TEXT,"
            + MwraTable.COLUMN_SC2 + " TEXT,"
            + MwraTable.COLUMN_SC3 + " TEXT,"
            + MwraTable.COLUMN_SC4 + " TEXT,"
            + MwraTable.COLUMN_SC5 + " TEXT,"
            + MwraTable.COLUMN_SC6 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ANTHROWRA = ("CREATE TABLE "
            + AnthroWRATable.TABLE_NAME + "("
            + AnthroWRATable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + AnthroWRATable.COLUMN_PROJECT_NAME + " TEXT,"
            + AnthroWRATable.COLUMN_UID + " TEXT,"
            + AnthroWRATable.COLUMN_UUID + " TEXT,"
            + AnthroWRATable.COLUMN_FMUID + " TEXT,"
            + AnthroWRATable.COLUMN_SNO + " TEXT,"
            + AnthroWRATable.COLUMN_PSU_CODE + " TEXT,"
            + AnthroWRATable.COLUMN_HHID + " TEXT,"
            + AnthroWRATable.COLUMN_USERNAME + " TEXT,"
            + AnthroWRATable.COLUMN_SYSDATE + " TEXT,"
            + AnthroWRATable.COLUMN_ISTATUS + " TEXT,"
            + AnthroWRATable.COLUMN_DEVICEID + " TEXT,"
            + AnthroWRATable.COLUMN_DEVICETAGID + " TEXT,"
            + AnthroWRATable.COLUMN_SYNCED + " TEXT,"
            + AnthroWRATable.COLUMN_SYNCED_DATE + " TEXT,"
            + AnthroWRATable.COLUMN_APPVERSION + " TEXT,"
            + AnthroWRATable.COLUMN_SF2 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_CHILD = ("CREATE TABLE "
            + ChildTable.TABLE_NAME + "("
            + ChildTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ChildTable.COLUMN_PROJECT_NAME + " TEXT,"
            + ChildTable.COLUMN_UID + " TEXT,"
            + ChildTable.COLUMN_UUID + " TEXT,"
            + ChildTable.COLUMN_FMUID + " TEXT,"
            + ChildTable.COLUMN_MUID + " TEXT,"
            + ChildTable.COLUMN_PSU_CODE + " TEXT,"
            + ChildTable.COLUMN_HHID + " TEXT,"
            + ChildTable.COLUMN_SNO + " TEXT,"
            + ChildTable.COLUMN_USERNAME + " TEXT,"
            + ChildTable.COLUMN_SYSDATE + " TEXT,"
            + ChildTable.COLUMN_INDEXED + " TEXT,"
            + ChildTable.COLUMN_ISTATUS + " TEXT,"
            + ChildTable.COLUMN_DEVICEID + " TEXT,"
            + ChildTable.COLUMN_DEVICETAGID + " TEXT,"
            + ChildTable.COLUMN_SYNCED + " TEXT,"
            + ChildTable.COLUMN_SYNCED_DATE + " TEXT,"
            + ChildTable.COLUMN_APPVERSION + " TEXT,"
            + ChildTable.COLUMN_SD1 + " TEXT,"
            + ChildTable.COLUMN_SD2 + " TEXT,"
            + ChildTable.COLUMN_SD3 + " TEXT,"
            + ChildTable.COLUMN_SD4 + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ANTHROCHILD = ("CREATE TABLE "
            + AnthroChildTable.TABLE_NAME + "("
            + AnthroChildTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + AnthroChildTable.COLUMN_PROJECT_NAME + " TEXT,"
            + AnthroChildTable.COLUMN_UID + " TEXT,"
            + AnthroChildTable.COLUMN_UUID + " TEXT,"
            + AnthroChildTable.COLUMN_FMUID + " TEXT,"
            + AnthroChildTable.COLUMN_PSU_CODE + " TEXT,"
            + AnthroChildTable.COLUMN_HHID + " TEXT,"
            + AnthroChildTable.COLUMN_SNO + " TEXT,"
            + AnthroChildTable.COLUMN_USERNAME + " TEXT,"
            + AnthroChildTable.COLUMN_SYSDATE + " TEXT,"
            + AnthroChildTable.COLUMN_ISTATUS + " TEXT,"
            + AnthroChildTable.COLUMN_DEVICEID + " TEXT,"
            + AnthroChildTable.COLUMN_DEVICETAGID + " TEXT,"
            + AnthroChildTable.COLUMN_SYNCED + " TEXT,"
            + AnthroChildTable.COLUMN_SYNCED_DATE + " TEXT,"
            + AnthroChildTable.COLUMN_APPVERSION + " TEXT,"
            + AnthroChildTable.COLUMN_SF1 + " TEXT"
            + " );"
            )


    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_PSU_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )


/*    const val SQL_CREATE_FAMILY_MEMBERS = ("CREATE TABLE "
            + FamilyMembersTable.TABLE_NAME + "("
            + FamilyMembersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FamilyMembersTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FamilyMembersTable.COLUMN_UID + " TEXT,"
            + FamilyMembersTable.COLUMN_UUID + " TEXT,"
            + FamilyMembersTable.COLUMN_EB_CODE + " TEXT,"
            + FamilyMembersTable.COLUMN_HHID + " TEXT,"
            + FamilyMembersTable.COLUMN_USERNAME + " TEXT,"
            + FamilyMembersTable.COLUMN_SYSDATE + " TEXT,"
            + FamilyMembersTable.COLUMN_INDEXED + " TEXT,"
            + FamilyMembersTable.COLUMN_ISTATUS + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICEID + " TEXT,"
            + FamilyMembersTable.COLUMN_DEVICETAGID + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED + " TEXT,"
            + FamilyMembersTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FamilyMembersTable.COLUMN_APPVERSION + " TEXT,"
            + FamilyMembersTable.COLUMN_SA2 + " TEXT"
            + " );"
            )*/

    const val SQL_CREATE_PREGNANCY = ("CREATE TABLE "
            + PregnancyTable.TABLE_NAME + "("
            + PregnancyTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PregnancyTable.COLUMN_PROJECT_NAME + " TEXT,"
            + PregnancyTable.COLUMN_UID + " TEXT,"
            + PregnancyTable.COLUMN_UUID + " TEXT,"
            + PregnancyTable.COLUMN_FMUID + " TEXT,"
            + PregnancyTable.COLUMN_PSU_CODE + " TEXT,"
            + PregnancyTable.COLUMN_SNO + " TEXT,"
            + PregnancyTable.COLUMN_HHID + " TEXT,"
            + PregnancyTable.COLUMN_USERNAME + " TEXT,"
            + PregnancyTable.COLUMN_SYSDATE + " TEXT,"
            + PregnancyTable.COLUMN_INDEXED + " TEXT,"
            + PregnancyTable.COLUMN_ISTATUS + " TEXT,"
            + PregnancyTable.COLUMN_DEVICEID + " TEXT,"
            + PregnancyTable.COLUMN_DEVICETAGID + " TEXT,"
            + PregnancyTable.COLUMN_SYNCED + " TEXT,"
            + PregnancyTable.COLUMN_SYNCED_DATE + " TEXT,"
            + PregnancyTable.COLUMN_APPVERSION + " TEXT,"
            + PregnancyTable.COLUMN_SE1 + " TEXT,"
            + PregnancyTable.COLUMN_SE2 + " TEXT"

            + " );"
            )


    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE "
            + ClustersTable.TABLE_NAME + "("
            + ClustersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ClustersTable.COLUMN_PROVINCE_CODE + " TEXT,"
            + ClustersTable.COLUMN_PROVINCE_NAME + " TEXT,"
            + ClustersTable.COLUMN_DISTRICT_CODE + " TEXT,"
            + ClustersTable.COLUMN_DISTRICT_NAME + " TEXT,"
            + ClustersTable.COLUMN_TEHSIL_CODE + " TEXT,"
            + ClustersTable.COLUMN_TEHSIL_NAME + " TEXT,"
            + ClustersTable.COLUMN_UC_CODE + " TEXT,"
            + ClustersTable.COLUMN_UC_NAME + " TEXT,"
            + ClustersTable.COLUMN_VILLAGE_CODE + " TEXT,"
            + ClustersTable.COLUMN_VILLAGE_NAME + " TEXT,"
            + ClustersTable.COLUMN_CLUSTER_NO + " TEXT"
            + " );"
            )


    /*const val SQL_CREATE_RANDOM = ("CREATE TABLE "
            + RandomTable.TABLE_NAME + "("
            + RandomTable.COLUMN_ID + " INTEGER PRIMARY KEY,"
            + RandomTable.COLUMN_SNO + " TEXT,"
            + RandomTable.COLUMN_ENUM_BLOCK_CODE + " TEXT,"
            + RandomTable.COLUMN_HH_NO + " TEXT,"
            + RandomTable.COLUMN_HEAD_HH + " TEXT"
            + " );"
            )*/

    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )


}