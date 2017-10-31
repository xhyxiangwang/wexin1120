package com.tencent.mm.plugin.bottle.a;

import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bt.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;

public final class c
{
  private static int keP;
  private static int keQ;
  
  static
  {
    GMTrace.i(7594173267968L, 56581);
    keP = 1;
    keQ = 1;
    GMTrace.o(7594173267968L, 56581);
  }
  
  public static String a(Context paramContext, x paramx)
  {
    GMTrace.i(7593904832512L, 56579);
    if (paramx == null)
    {
      paramContext = paramContext.getString(R.l.dEc);
      GMTrace.o(7593904832512L, 56579);
      return paramContext;
    }
    if (RegionCodeDecoder.TA(paramx.getCountryCode()))
    {
      paramContext = paramx.getCity();
      if (!bg.mZ(paramContext))
      {
        GMTrace.o(7593904832512L, 56579);
        return paramContext;
      }
      paramContext = com.tencent.mm.x.n.fe(paramx.getProvince());
      if (!bg.mZ(paramContext))
      {
        GMTrace.o(7593904832512L, 56579);
        return paramContext;
      }
      RegionCodeDecoder.bRs();
      paramContext = RegionCodeDecoder.getLocName(paramx.getCountryCode());
      GMTrace.o(7593904832512L, 56579);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dEc);
    GMTrace.o(7593904832512L, 56579);
    return paramContext;
  }
  
  public static int agP()
  {
    GMTrace.i(7592696872960L, 56570);
    int i = keP;
    GMTrace.o(7592696872960L, 56570);
    return i;
  }
  
  public static int agQ()
  {
    GMTrace.i(7592831090688L, 56571);
    int i = keQ;
    GMTrace.o(7592831090688L, 56571);
    return i;
  }
  
  public static int agR()
  {
    GMTrace.i(7593233743872L, 56574);
    int i = com.tencent.mm.x.h.zC();
    GMTrace.o(7593233743872L, 56574);
    return i;
  }
  
  public static void agS()
  {
    GMTrace.i(7593770614784L, 56578);
    b localb = i.agX();
    long l = bg.Pp() - 7776000000L;
    Object localObject = "select distinct content , msgtype from bottleinfo1 where bottleinfo1.createtime < " + l;
    Cursor localCursor = localb.hhi.a((String)localObject, null, 0);
    int j = localCursor.getCount();
    if (j > 0)
    {
      String[] arrayOfString = new String[j];
      i = 0;
      localObject = arrayOfString;
      if (i < j)
      {
        localCursor.moveToPosition(i);
        if (localCursor.getInt(1) == 3) {
          arrayOfString[i] = localCursor.getString(0);
        }
        for (;;)
        {
          i += 1;
          break;
          arrayOfString[i] = null;
        }
      }
    }
    else
    {
      localObject = null;
    }
    localCursor.close();
    if (j > 0) {
      localb.hhi.delete("bottleinfo1", "createtime< ?", new String[] { String.valueOf(l) });
    }
    if (localObject == null)
    {
      GMTrace.o(7593770614784L, 56578);
      return;
    }
    int i = 0;
    while (i < localObject.length)
    {
      w.d("MicroMsg.BottleLogic", "delete path:" + q.getFullPath(localObject[i]));
      if (!bg.mZ(q.getFullPath(localObject[i]))) {
        com.tencent.mm.loader.stub.b.deleteFile(q.getFullPath(localObject[i]));
      }
      i += 1;
    }
    GMTrace.o(7593770614784L, 56578);
  }
  
  public static String b(Context paramContext, x paramx)
  {
    GMTrace.i(7594039050240L, 56580);
    if (paramx == null)
    {
      paramContext = paramContext.getString(R.l.dEc);
      GMTrace.o(7594039050240L, 56580);
      return paramContext;
    }
    String str = com.tencent.mm.x.n.fe(paramx.getProvince());
    Object localObject = str;
    if (RegionCodeDecoder.TA(paramx.getCountryCode()))
    {
      if (!bg.mZ(paramx.getCity())) {
        break label116;
      }
      localObject = new StringBuilder();
      RegionCodeDecoder.bRs();
    }
    label116:
    for (localObject = RegionCodeDecoder.getLocName(paramx.getCountryCode()) + str; bg.mZ((String)localObject); localObject = str + paramx.getCity())
    {
      paramContext = paramContext.getString(R.l.dEc);
      GMTrace.o(7594039050240L, 56580);
      return paramContext;
    }
    GMTrace.o(7594039050240L, 56580);
    return (String)localObject;
  }
  
  public static void kU(int paramInt)
  {
    GMTrace.i(7592965308416L, 56572);
    keP = paramInt;
    GMTrace.o(7592965308416L, 56572);
  }
  
  public static void kV(int paramInt)
  {
    GMTrace.i(7593099526144L, 56573);
    keQ = paramInt;
    GMTrace.o(7593099526144L, 56573);
  }
  
  public static int kW(int paramInt)
  {
    GMTrace.i(7593367961600L, 56575);
    switch (paramInt)
    {
    default: 
      GMTrace.o(7593367961600L, 56575);
      return -1;
    case 1: 
      GMTrace.o(7593367961600L, 56575);
      return 1;
    case 2: 
      GMTrace.o(7593367961600L, 56575);
      return 3;
    case 3: 
      GMTrace.o(7593367961600L, 56575);
      return 34;
    }
    GMTrace.o(7593367961600L, 56575);
    return 43;
  }
  
  public static String th(String paramString)
  {
    GMTrace.i(7593502179328L, 56576);
    if (bg.mZ(paramString))
    {
      GMTrace.o(7593502179328L, 56576);
      return null;
    }
    paramString = paramString.split("@bottle:");
    if ((paramString == null) || (paramString.length < 2))
    {
      GMTrace.o(7593502179328L, 56576);
      return null;
    }
    paramString = paramString[1];
    GMTrace.o(7593502179328L, 56576);
    return paramString;
  }
  
  public static void ti(String paramString)
  {
    a locala = null;
    GMTrace.i(7593636397056L, 56577);
    com.tencent.mm.plugin.bottle.a.ifN.pt();
    ap.AS();
    if (com.tencent.mm.x.c.yN().BJ(paramString) != 1)
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    ap.AS();
    au localau = com.tencent.mm.x.c.yN().Bu(paramString);
    if ((localau == null) || (!localau.field_talker.equals(paramString)))
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    Object localObject1 = th(paramString);
    if (bg.mZ((String)localObject1))
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    Object localObject2 = i.agX();
    String str = "select bottleinfo1.parentclientid,bottleinfo1.childcount,bottleinfo1.bottleid,bottleinfo1.bottletype,bottleinfo1.msgtype,bottleinfo1.voicelen,bottleinfo1.content,bottleinfo1.createtime,bottleinfo1.reserved1,bottleinfo1.reserved2,bottleinfo1.reserved3,bottleinfo1.reserved4 from bottleinfo1   where bottleinfo1.bottleid = \"" + bg.mX((String)localObject1) + "\"";
    localObject2 = ((b)localObject2).hhi.a(str, null, 0);
    if (localObject2 == null) {
      locala = null;
    }
    while ((locala == null) || (!locala.agO().equals(localObject1)))
    {
      GMTrace.o(7593636397056L, 56577);
      return;
      if (((Cursor)localObject2).moveToFirst())
      {
        locala = new a();
        locala.keJ = ((Cursor)localObject2).getString(0);
        locala.keK = ((Cursor)localObject2).getInt(1);
        locala.keL = ((Cursor)localObject2).getString(2);
        locala.keM = ((Cursor)localObject2).getInt(3);
        locala.msgType = ((Cursor)localObject2).getInt(4);
        locala.keN = ((Cursor)localObject2).getInt(5);
        locala.content = ((Cursor)localObject2).getString(6);
        locala.keO = ((Cursor)localObject2).getLong(7);
        locala.hhe = ((Cursor)localObject2).getInt(8);
        locala.hvE = ((Cursor)localObject2).getInt(9);
        locala.hhg = ((Cursor)localObject2).getString(10);
        locala.hhh = ((Cursor)localObject2).getString(11);
      }
      ((Cursor)localObject2).close();
    }
    if (locala.keM != 1)
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    localObject1 = new au();
    ((au)localObject1).cW(paramString);
    if (localau.field_createTime <= locala.keO) {}
    for (long l = localau.field_createTime - 1L;; l = locala.keO)
    {
      ((au)localObject1).D(l);
      ((au)localObject1).setType(kW(locala.msgType));
      ((au)localObject1).dB(2);
      ((au)localObject1).dC(1);
      if (((ce)localObject1).field_type != 34) {
        break label589;
      }
      ((au)localObject1).setContent(com.tencent.mm.modelvoice.n.b(m.zF(), locala.keN, false));
      paramString = locala.rh() + bg.Pp();
      if (j.eD(q.getFullPath(locala.rh()), q.getFullPath(paramString))) {
        break;
      }
      w.e("MicroMsg.BottleLogic", "Copy Bottle Voice File Failed :" + locala.rh());
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    ((au)localObject1).cX(paramString);
    for (;;)
    {
      ap.AS();
      com.tencent.mm.x.c.yN().K((au)localObject1);
      GMTrace.o(7593636397056L, 56577);
      return;
      label589:
      ((au)localObject1).setContent(locala.rh());
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */