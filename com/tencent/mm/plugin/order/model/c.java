package com.tencent.mm.plugin.order.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.order.b.a;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c
{
  public List<j> knh;
  private List<a> oqS;
  
  public c()
  {
    GMTrace.i(6631026851840L, 49405);
    this.knh = new ArrayList();
    this.oqS = new ArrayList();
    loadFromDB();
    aVf();
    aVe();
    aVg();
    GMTrace.o(6631026851840L, 49405);
  }
  
  public static j DG(String paramString)
  {
    GMTrace.i(6631563722752L, 49409);
    Map localMap = bh.p(paramString, "sysmsg");
    if (localMap == null)
    {
      GMTrace.o(6631563722752L, 49409);
      return null;
    }
    j localj = new j();
    localj.osl = ((String)localMap.get(".sysmsg.paymsg.PayMsgType"));
    localj.osm = ((String)localMap.get(".sysmsg.paymsg.Brief.IconUrl"));
    localj.osn = ((String)localMap.get(".sysmsg.paymsg.Brief.CreateTime"));
    localj.oso = ((String)localMap.get(".sysmsg.paymsg.StatusSection.IconUrl"));
    localj.osp = ((String)localMap.get(".sysmsg.paymsg.StatusSection.StatusDesc"));
    localj.fJC = ((String)localMap.get(".sysmsg.paymsg.StatusSection.Content"));
    localj.osq = ((String)localMap.get(".sysmsg.paymsg.StatusSection.JumpUrl"));
    localj.osr = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppUserName"));
    localj.osb = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppNickName"));
    localj.oss = ((String)localMap.get(".sysmsg.paymsg.ContactSection.AppTelephone"));
    int i = 0;
    if (i == 0) {
      paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.Name");
    }
    for (String str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button.JumpUrl");; str = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".JumpUrl"))
    {
      if (TextUtils.isEmpty(paramString)) {
        break label373;
      }
      localObject = new j.a();
      ((j.a)localObject).name = paramString;
      ((j.a)localObject).jumpUrl = str;
      if (localj.ost == null) {
        localj.ost = new ArrayList();
      }
      localj.ost.add(localObject);
      i += 1;
      break;
      paramString = (String)localMap.get(".sysmsg.paymsg.StatusSection.Button" + i + ".Name");
    }
    label373:
    i = 0;
    if (i == 0)
    {
      paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection.Name");
      str = (String)localMap.get(".sysmsg.paymsg.NormalSection.Value");
    }
    for (Object localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection.JumpUrl");; localObject = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".JumpUrl"))
    {
      if (TextUtils.isEmpty(paramString)) {
        break label591;
      }
      j.b localb = new j.b();
      localb.name = paramString;
      localb.value = str;
      localb.jumpUrl = ((String)localObject);
      if (localj.osu == null) {
        localj.osu = new ArrayList();
      }
      localj.osu.add(localb);
      i += 1;
      break;
      paramString = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Name");
      str = (String)localMap.get(".sysmsg.paymsg.NormalSection" + i + ".Value");
    }
    label591:
    GMTrace.o(6631563722752L, 49409);
    return localj;
  }
  
  public static MallOrderDetailObject a(j paramj)
  {
    GMTrace.i(6632637464576L, 49417);
    if (paramj == null)
    {
      GMTrace.o(6632637464576L, 49417);
      return null;
    }
    MallOrderDetailObject localMallOrderDetailObject = new MallOrderDetailObject();
    Object localObject1 = new MallOrderDetailObject.b();
    ((MallOrderDetailObject.b)localObject1).oqN = paramj.osp;
    if ((!TextUtils.isEmpty(paramj.osn)) && (com.tencent.mm.plugin.order.c.c.ul(paramj.osn))) {}
    int i;
    Object localObject2;
    MallOrderDetailObject.a locala;
    for (((MallOrderDetailObject.b)localObject1).time = Integer.valueOf(paramj.osn).intValue();; ((MallOrderDetailObject.b)localObject1).time = ((int)(System.currentTimeMillis() / 1000L)))
    {
      ((MallOrderDetailObject.b)localObject1).thumbUrl = paramj.oso;
      ((MallOrderDetailObject.b)localObject1).mDg = paramj.osq;
      ((MallOrderDetailObject.b)localObject1).oqO = paramj.fJC;
      localMallOrderDetailObject.oqF = ((MallOrderDetailObject.b)localObject1);
      localObject1 = paramj.ost;
      if ((localObject1 == null) || (((List)localObject1).size() <= 0)) {
        break;
      }
      localMallOrderDetailObject.oqH = new ArrayList();
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = (j.a)((List)localObject1).get(i);
        locala = new MallOrderDetailObject.a();
        locala.name = ((j.a)localObject2).name;
        locala.value = "";
        locala.jumpUrl = ((j.a)localObject2).jumpUrl;
        locala.knE = false;
        localMallOrderDetailObject.oqH.add(locala);
        i += 1;
      }
    }
    localObject1 = paramj.osu;
    if ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      if (localMallOrderDetailObject.oqH == null) {
        localMallOrderDetailObject.oqH = new ArrayList();
      }
      i = 0;
      while (i < ((List)localObject1).size())
      {
        localObject2 = (j.b)((List)localObject1).get(i);
        locala = new MallOrderDetailObject.a();
        locala.name = ((j.b)localObject2).name;
        locala.value = ((j.b)localObject2).value;
        locala.jumpUrl = ((j.b)localObject2).jumpUrl;
        locala.knE = false;
        if (i == 0) {
          locala.knE = true;
        }
        localMallOrderDetailObject.oqH.add(locala);
        i += 1;
      }
    }
    localMallOrderDetailObject.oqL = paramj.oss;
    localMallOrderDetailObject.fBG = paramj.osr;
    if ((!TextUtils.isEmpty(paramj.osn)) && (com.tencent.mm.plugin.order.c.c.ul(paramj.osn))) {}
    for (localMallOrderDetailObject.oqM = Integer.valueOf(paramj.osn).intValue();; localMallOrderDetailObject.oqM = ((int)(System.currentTimeMillis() / 1000L)))
    {
      GMTrace.o(6632637464576L, 49417);
      return localMallOrderDetailObject;
    }
  }
  
  private void aVe()
  {
    GMTrace.i(6631429505024L, 49408);
    if ((this.knh == null) || (this.knh.size() == 0))
    {
      GMTrace.o(6631429505024L, 49408);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.knh);
    int i = 0;
    while (i < localArrayList.size())
    {
      j localj = (j)localArrayList.get(i);
      if ((localj.osl != null) && (com.tencent.mm.plugin.order.c.c.ul(localj.osl)))
      {
        int j = Integer.valueOf(localj.osl).intValue();
        if ((j != 2) && (j != 1)) {
          DH(localj.fJw);
        }
      }
      i += 1;
    }
    GMTrace.o(6631429505024L, 49408);
  }
  
  private void aVf()
  {
    GMTrace.i(6631832158208L, 49411);
    int i = 0;
    while (i < this.oqS.size())
    {
      a locala = (a)this.oqS.get(i);
      String str = locala.field_msgContentXml;
      j localj = DG(str);
      localj.fJw = locala.field_msgId;
      this.knh.add(localj);
      w.v("MicroMsg.MallPayMsgManager", "parsePayMsgFromMsgXmlList xml:" + str);
      i += 1;
    }
    GMTrace.o(6631832158208L, 49411);
  }
  
  private void loadFromDB()
  {
    GMTrace.i(6631295287296L, 49407);
    com.tencent.mm.plugin.order.a.b.aVa();
    Cursor localCursor = com.tencent.mm.plugin.order.a.b.aVc().Mp();
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      localCursor.moveToFirst();
      int i = localCursor.getColumnIndex("msgId");
      int j = localCursor.getColumnIndex("msgContentXml");
      int k = localCursor.getColumnIndex("isRead");
      while (!localCursor.isAfterLast())
      {
        a locala = new a();
        locala.field_msgId = localCursor.getString(i);
        locala.field_msgContentXml = localCursor.getString(j);
        locala.field_isRead = localCursor.getString(k);
        localCursor.moveToNext();
        this.oqS.add(locala);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(6631295287296L, 49407);
  }
  
  public final boolean DH(String paramString)
  {
    GMTrace.i(6631697940480L, 49410);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6631697940480L, 49410);
      return false;
    }
    paramString = DJ(paramString);
    if (paramString != null)
    {
      this.knh.remove(paramString);
      int i;
      if (paramString != null) {
        i = 0;
      }
      for (;;)
      {
        if (i < this.oqS.size())
        {
          a locala = (a)this.oqS.get(i);
          if (paramString.fJw.equals(locala.field_msgId))
          {
            this.oqS.remove(locala);
            com.tencent.mm.plugin.order.a.b.aVa();
            com.tencent.mm.plugin.order.a.b.aVc().a(locala, new String[0]);
          }
        }
        else
        {
          GMTrace.o(6631697940480L, 49410);
          return true;
        }
        i += 1;
      }
    }
    GMTrace.o(6631697940480L, 49410);
    return false;
  }
  
  public final boolean DI(String paramString)
  {
    GMTrace.i(6631966375936L, 49412);
    if ((this.knh == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(6631966375936L, 49412);
      return false;
    }
    int i = 0;
    while (i < this.knh.size())
    {
      j localj = (j)this.knh.get(i);
      if ((localj != null) && (localj.fJw.equals(paramString)))
      {
        GMTrace.o(6631966375936L, 49412);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6631966375936L, 49412);
    return false;
  }
  
  public final j DJ(String paramString)
  {
    GMTrace.i(6632100593664L, 49413);
    if ((this.knh == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(6632100593664L, 49413);
      return null;
    }
    int i = 0;
    while (i < this.knh.size())
    {
      j localj = (j)this.knh.get(i);
      if (paramString.equals(localj.fJw))
      {
        GMTrace.o(6632100593664L, 49413);
        return localj;
      }
      i += 1;
    }
    GMTrace.o(6632100593664L, 49413);
    return null;
  }
  
  public final a DK(String paramString)
  {
    GMTrace.i(6632234811392L, 49414);
    if ((this.oqS == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(6632234811392L, 49414);
      return null;
    }
    int i = 0;
    while (i < this.oqS.size())
    {
      a locala = (a)this.oqS.get(i);
      if (paramString.equals(locala.field_msgId))
      {
        GMTrace.o(6632234811392L, 49414);
        return locala;
      }
      i += 1;
    }
    GMTrace.o(6632234811392L, 49414);
    return null;
  }
  
  public final void a(j paramj, String paramString1, String paramString2)
  {
    GMTrace.i(6631161069568L, 49406);
    if ((paramj == null) || (TextUtils.isEmpty(paramString1)))
    {
      GMTrace.o(6631161069568L, 49406);
      return;
    }
    a locala = new a();
    locala.field_msgId = paramj.fJw;
    locala.field_msgContentXml = paramString1;
    locala.field_isRead = paramString2;
    com.tencent.mm.plugin.order.a.b.aVa();
    if (!com.tencent.mm.plugin.order.a.b.aVc().a(locala)) {
      w.e("MicroMsg.MallPayMsgManager", "insert CommonMsgXml failed! id:" + paramj.fJw);
    }
    this.oqS.add(locala);
    GMTrace.o(6631161069568L, 49406);
  }
  
  public final void aVg()
  {
    GMTrace.i(6632369029120L, 49415);
    int i = aVh();
    ap.AS();
    com.tencent.mm.x.c.xi().set(204820, Integer.valueOf(i));
    w.v("MicroMsg.MallPayMsgManager", "save unread msg is :" + i);
    GMTrace.o(6632369029120L, 49415);
  }
  
  public final int aVh()
  {
    GMTrace.i(6632503246848L, 49416);
    if ((this.oqS == null) || (this.oqS.size() == 0))
    {
      GMTrace.o(6632503246848L, 49416);
      return 0;
    }
    int i = 0;
    int k;
    for (int j = 0; i < this.oqS.size(); j = k)
    {
      a locala = (a)this.oqS.get(i);
      k = j;
      if (locala != null)
      {
        k = j;
        if ("0".equals(locala.field_isRead)) {
          k = j + 1;
        }
      }
      i += 1;
    }
    w.v("MicroMsg.MallPayMsgManager", "msg xml unread msg is %s:" + j);
    GMTrace.o(6632503246848L, 49416);
    return j;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */