package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.provider.ContactsContract.Contacts;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.appstorage.e;
import com.tencent.mm.plugin.appbrand.appstorage.e.a;
import com.tencent.mm.plugin.appbrand.appstorage.e.b;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 226;
  public static final String NAME = "addPhoneContact";
  private e iVG;
  
  public a()
  {
    GMTrace.i(19805167943680L, 147560);
    GMTrace.o(19805167943680L, 147560);
  }
  
  private static e.a a(JSONObject paramJSONObject, String paramString)
  {
    GMTrace.i(19805436379136L, 147562);
    paramJSONObject = new e.a(paramJSONObject.optString(paramString + "Country"), paramJSONObject.optString(paramString + "State"), paramJSONObject.optString(paramString + "City"), paramJSONObject.optString(paramString + "Street"), paramJSONObject.optString(paramString + "PostalCode"));
    GMTrace.o(19805436379136L, 147562);
    return paramJSONObject;
  }
  
  private static void a(ArrayList<ContentValues> paramArrayList, e.a parama, int paramInt)
  {
    GMTrace.i(19805704814592L, 147564);
    if ((parama != null) && (parama.KC().length() > 0))
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
      localContentValues.put("data1", parama.KC());
      localContentValues.put("data9", parama.iDR);
      localContentValues.put("data2", Integer.valueOf(paramInt));
      paramArrayList.add(localContentValues);
    }
    GMTrace.o(19805704814592L, 147564);
  }
  
  private static void a(ArrayList<ContentValues> paramArrayList, String paramString, int paramInt)
  {
    GMTrace.i(19805839032320L, 147565);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
    localContentValues.put("data1", paramString);
    localContentValues.put("data2", Integer.valueOf(paramInt));
    paramArrayList.add(localContentValues);
    GMTrace.o(19805839032320L, 147565);
  }
  
  public final void a(Intent paramIntent, MMActivity paramMMActivity, String paramString)
  {
    GMTrace.i(19805570596864L, 147563);
    paramIntent.setFlags(268435456);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.iVG.iDC;
    Object localObject2 = new StringBuilder();
    if ((bg.Rn(((e.b)localObject1).iDS)) || (bg.Rn(((e.b)localObject1).iDT)) || (bg.Rn(((e.b)localObject1).iDU)))
    {
      if (((e.b)localObject1).iDU.trim().length() > 0) {
        ((StringBuilder)localObject2).append(((e.b)localObject1).iDU);
      }
      if (((e.b)localObject1).iDT.trim().length() > 0) {
        ((StringBuilder)localObject2).append(((e.b)localObject1).iDT);
      }
      if (((e.b)localObject1).iDS.trim().length() > 0) {
        ((StringBuilder)localObject2).append(((e.b)localObject1).iDS);
      }
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject2).toString();
      if (!bg.mZ((String)localObject1))
      {
        paramIntent.putExtra("name", (String)localObject1);
        if (!bg.mZ(this.iVG.aDw))
        {
          localObject1 = this.iVG.aDw;
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/nickname");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          ((ContentValues)localObject2).put("data2", Integer.valueOf(1));
          localArrayList.add(localObject2);
        }
        if (!bg.mZ(this.iVG.iDL))
        {
          localObject1 = this.iVG.iDL;
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/note");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          localArrayList.add(localObject2);
        }
        if ((!bg.mZ(this.iVG.iDM)) || (!bg.mZ(this.iVG.title)))
        {
          localObject1 = new ContentValues();
          ((ContentValues)localObject1).put("mimetype", "vnd.android.cursor.item/organization");
          if (!bg.mZ(this.iVG.iDM)) {
            ((ContentValues)localObject1).put("data1", this.iVG.iDM);
          }
          if (!bg.mZ(this.iVG.title)) {
            ((ContentValues)localObject1).put("data4", this.iVG.title);
          }
          ((ContentValues)localObject1).put("data2", Integer.valueOf(1));
          localArrayList.add(localObject1);
        }
        if (!bg.mZ(this.iVG.url))
        {
          localObject1 = this.iVG.url;
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/website");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          ((ContentValues)localObject2).put("data2", Integer.valueOf(1));
          localArrayList.add(localObject2);
        }
        if (!bg.mZ(this.iVG.gbP)) {
          paramIntent.putExtra("email", this.iVG.gbP);
        }
        if (!bg.mZ(this.iVG.iDH)) {
          a(localArrayList, this.iVG.iDH, 2);
        }
        if (!bg.mZ(this.iVG.iDI)) {
          a(localArrayList, this.iVG.iDI, 1);
        }
        if (!bg.mZ(this.iVG.iDK)) {
          a(localArrayList, this.iVG.iDK, 3);
        }
        if (!bg.mZ(this.iVG.iDJ)) {
          a(localArrayList, this.iVG.iDJ, 10);
        }
        if (!bg.mZ(this.iVG.iDO)) {
          a(localArrayList, this.iVG.iDO, 5);
        }
        if (!bg.mZ(this.iVG.iDN)) {
          a(localArrayList, this.iVG.iDN, 4);
        }
        a(localArrayList, this.iVG.iDG, 3);
        a(localArrayList, this.iVG.iDF, 2);
        a(localArrayList, this.iVG.iDE, 1);
        if (!bg.mZ(this.iVG.iDP))
        {
          localObject1 = this.iVG.iDP;
          paramMMActivity = paramMMActivity.getString(p.i.bis);
          localObject2 = new ContentValues();
          ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/im");
          ((ContentValues)localObject2).put("data1", (String)localObject1);
          ((ContentValues)localObject2).put("data5", Integer.valueOf(-1));
          ((ContentValues)localObject2).put("data6", paramMMActivity);
          localArrayList.add(localObject2);
        }
        paramMMActivity = c.aI(paramString, this.iVG.iDD);
        if ((paramMMActivity != null) && (!bg.mZ(paramMMActivity.hhT)))
        {
          paramString = paramMMActivity.hhT;
          paramMMActivity = paramString;
          if (!paramString.startsWith("file://")) {
            paramMMActivity = "file://" + paramString;
          }
          paramMMActivity = b.CT().hh(paramMMActivity);
          if (paramMMActivity != null)
          {
            paramString = new ByteArrayOutputStream();
            paramMMActivity.compress(Bitmap.CompressFormat.JPEG, 100, paramString);
            localObject1 = paramString.toByteArray();
            localObject2 = new ContentValues();
            ((ContentValues)localObject2).put("mimetype", "vnd.android.cursor.item/photo");
            ((ContentValues)localObject2).put("data15", (byte[])localObject1);
            localArrayList.add(localObject2);
            paramMMActivity.recycle();
          }
        }
      }
      try
      {
        paramString.close();
        paramIntent.putParcelableArrayListExtra("data", localArrayList);
        GMTrace.o(19805570596864L, 147563);
        return;
        if (((e.b)localObject1).iDS.trim().length() > 0) {
          ((StringBuilder)localObject2).append(((e.b)localObject1).iDS);
        }
        if (((e.b)localObject1).iDT.trim().length() > 0)
        {
          ((StringBuilder)localObject2).append(" ");
          ((StringBuilder)localObject2).append(((e.b)localObject1).iDT);
        }
        if (((e.b)localObject1).iDU.trim().length() <= 0) {
          continue;
        }
        ((StringBuilder)localObject2).append(" ");
        ((StringBuilder)localObject2).append(((e.b)localObject1).iDU);
        continue;
        w.e("MicroMsg.JsApiAddPhoneContact", "no contact user name");
      }
      catch (IOException paramMMActivity)
      {
        for (;;) {}
      }
    }
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19805302161408L, 147561);
    w.d("MicroMsg.JsApiAddPhoneContact", "addPhoneContact!");
    if (paramJSONObject == null)
    {
      paramk.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiAddPhoneContact", "data is null");
      GMTrace.o(19805302161408L, 147561);
      return;
    }
    if (bg.mZ(paramJSONObject.optString("firstName")))
    {
      paramk.v(paramInt, d("fail:firstName is null", null));
      w.e("MicroMsg.JsApiAddPhoneContact", "firstName is null");
      GMTrace.o(19805302161408L, 147561);
      return;
    }
    final MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      paramk.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiAddPhoneContact", "mmActivity is null, invoke fail!");
      GMTrace.o(19805302161408L, 147561);
      return;
    }
    this.iVG = new e();
    this.iVG.iDD = paramJSONObject.optString("photoFilePath");
    this.iVG.aDw = paramJSONObject.optString("nickName");
    final Object localObject = new e.b(paramJSONObject.optString("firstName"), paramJSONObject.optString("middleName"), paramJSONObject.optString("lastName"));
    this.iVG.iDC = ((e.b)localObject);
    this.iVG.iDL = paramJSONObject.optString("remark");
    this.iVG.iDH = paramJSONObject.optString("mobilePhoneNumber");
    this.iVG.iDP = paramJSONObject.optString("weChatNumber");
    this.iVG.iDG = a(paramJSONObject, "address");
    this.iVG.iDM = paramJSONObject.optString("organization");
    this.iVG.title = paramJSONObject.optString("title");
    this.iVG.iDN = paramJSONObject.optString("workFaxNumber");
    this.iVG.iDK = paramJSONObject.optString("workPhoneNumber");
    this.iVG.iDJ = paramJSONObject.optString("hostNumber");
    this.iVG.gbP = paramJSONObject.optString("email");
    this.iVG.url = paramJSONObject.optString("url");
    this.iVG.iDF = a(paramJSONObject, "workAddress");
    this.iVG.iDO = paramJSONObject.optString("homeFaxNumber");
    this.iVG.iDI = paramJSONObject.optString("homePhoneNumber");
    this.iVG.iDE = a(paramJSONObject, "homeAddress");
    localMMActivity.vow = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(20368345530368L, 151756);
        paramk.v(paramInt, a.this.d("ok", null));
        GMTrace.o(20368345530368L, 151756);
      }
    };
    localObject = paramk.iqL;
    paramk = localMMActivity.getString(p.i.iyl);
    paramJSONObject = localMMActivity.getString(p.i.iyk);
    localObject = new h.c()
    {
      public final void hC(int paramAnonymousInt)
      {
        GMTrace.i(19805033725952L, 147559);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(19805033725952L, 147559);
          return;
          Intent localIntent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
          a.this.a(localIntent, localMMActivity, localObject);
          localMMActivity.startActivity(localIntent);
          localMMActivity.startActivityForResult(localIntent, hashCode() & 0xFFFF);
          GMTrace.o(19805033725952L, 147559);
          return;
          localIntent = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
          localIntent.setType("vnd.android.cursor.item/person");
          a.this.a(localIntent, localMMActivity, localObject);
          localMMActivity.startActivityForResult(localIntent, hashCode() & 0xFFFF);
        }
      }
    };
    h.a(localMMActivity, "", new String[] { paramk, paramJSONObject }, "", (h.c)localObject);
    GMTrace.o(19805302161408L, 147561);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */