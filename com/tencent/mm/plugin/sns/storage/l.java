package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bep;
import com.tencent.mm.protocal.c.tx;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  extends com.tencent.mm.sdk.e.i<k>
  implements com.tencent.mm.plugin.sns.b.e
{
  public static final String[] gMz;
  public com.tencent.mm.sdk.e.e gMB;
  private boolean quV;
  private g quW;
  
  static
  {
    GMTrace.i(8302306000896L, 61857);
    gMz = new String[] { com.tencent.mm.sdk.e.i.a(k.gLR, "snsExtInfo3") };
    GMTrace.o(8302306000896L, 61857);
  }
  
  public l(com.tencent.mm.sdk.e.e parame, g paramg)
  {
    super(parame, k.gLR, "snsExtInfo3", null);
    GMTrace.i(8299621646336L, 61837);
    this.quV = false;
    this.quW = null;
    this.gMB = parame;
    this.quW = paramg;
    w.i("MicroMsg.SnsExtStorage", "createExtStorage " + parame + "  " + Thread.currentThread().getId());
    GMTrace.o(8299621646336L, 61837);
  }
  
  private k a(String paramString, k paramk)
  {
    GMTrace.i(8301366476800L, 61850);
    int j;
    if (paramk == null)
    {
      j = 0;
      i = 0;
      label17:
      if ((i != 0) || (j != 0)) {
        break label243;
      }
      paramk = this.gMB.a("select count(*)  from sqlite_master where type='table' and name = 'snsExtInfo2'", null, 2);
      if (!paramk.moveToFirst()) {
        break label253;
      }
    }
    label243:
    label253:
    for (int i = paramk.getInt(0);; i = 0)
    {
      paramk.close();
      if (i == 0)
      {
        w.v("MicroMsg.SnsExtStorage", "can not get snsextinfo2 %s", new Object[] { paramString });
        GMTrace.o(8301366476800L, 61850);
        return null;
        if ((paramk.field_iFlag & 0x1) > 0) {}
        for (i = 1;; i = 0)
        {
          j = i;
          if ((paramk.field_local_flag & 0x4) <= 0) {
            break;
          }
          j = i;
          i = 1;
          break label17;
        }
      }
      paramk = "select * from snsExtInfo2 where userName=\"" + bg.mX(paramString) + "\"";
      w.d("MicroMsg.SnsExtStorage", "get from snsextinfo2 sql %s", new Object[] { paramk });
      paramk = this.gMB.a(paramk, null, 2);
      k localk = new k();
      if (paramk.moveToFirst())
      {
        localk.b(paramk);
        paramk.close();
        w.i("MicroMsg.SnsExtStorage", "setSnsUserInfo fix newversion change snsextinfo3 %s", new Object[] { paramString });
        GMTrace.o(8301366476800L, 61850);
        return localk;
      }
      paramk.close();
      GMTrace.o(8301366476800L, 61850);
      return null;
    }
  }
  
  public final bep FR(String paramString)
  {
    GMTrace.i(8301500694528L, 61851);
    paramString = HE(paramString);
    if (paramString == null)
    {
      paramString = new bep();
      GMTrace.o(8301500694528L, 61851);
      return paramString;
    }
    paramString = paramString.bjW();
    GMTrace.o(8301500694528L, 61851);
    return paramString;
  }
  
  public final void HB(String paramString)
  {
    GMTrace.i(8300024299520L, 61840);
    k localk = HE(paramString);
    localk.field_userName = paramString;
    super.a(localk, new String[] { this.uQJ.uQG });
    GMTrace.o(8300024299520L, 61840);
  }
  
  public final tx HC(String paramString)
  {
    GMTrace.i(8300561170432L, 61844);
    Object localObject = new tx();
    new k();
    paramString = HE(paramString);
    try
    {
      if (!bg.bp(paramString.field_faultS))
      {
        paramString = (tx)new tx().aC(paramString.field_faultS);
        localObject = paramString;
        if (paramString == null) {
          localObject = new tx();
        }
        GMTrace.o(8300561170432L, 61844);
        return (tx)localObject;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.SnsExtStorage", "parser field_faultS error");
        paramString = (String)localObject;
      }
    }
  }
  
  public final void HD(String paramString)
  {
    GMTrace.i(8300695388160L, 61845);
    new k();
    k localk = HE(paramString);
    localk.field_userName = paramString;
    localk.field_local_flag &= 0xFFFFFFFE;
    c(localk);
    GMTrace.o(8300695388160L, 61845);
  }
  
  public final k HE(String paramString)
  {
    GMTrace.i(8300829605888L, 61846);
    k localk2 = new k();
    k localk1 = localk2;
    if (this.quW != null)
    {
      localk1 = localk2;
      if (this.quV)
      {
        localk1 = this.quW.GC(paramString);
        if (localk1 != null)
        {
          GMTrace.o(8300829605888L, 61846);
          return localk1;
        }
        localk1 = new k();
      }
    }
    localk1.field_userName = paramString;
    super.b(localk1, new String[] { this.uQJ.uQG });
    GMTrace.o(8300829605888L, 61846);
    return localk1;
  }
  
  public final boolean a(k paramk)
  {
    GMTrace.i(8299890081792L, 61839);
    if ((this.quV) && (this.quW != null))
    {
      bool = this.quW.a(paramk);
      if (this.quW != null) {
        this.quW.bhF();
      }
      GMTrace.o(8299890081792L, 61839);
      return bool;
    }
    boolean bool = super.a(paramk);
    GMTrace.o(8299890081792L, 61839);
    return bool;
  }
  
  public final boolean a(String paramString, bep parambep)
  {
    GMTrace.i(8301098041344L, 61848);
    paramString = HE(paramString);
    String str = com.tencent.mm.plugin.sns.data.i.jdMethod_do(parambep.huW);
    if ((!bg.mZ(parambep.huV)) && ((paramString.field_bgUrl == null) || (!paramString.field_bgId.equals(str))))
    {
      paramString.field_older_bgId = paramString.field_bgId;
      paramString.field_local_flag |= 0x1;
      paramString.bjU();
      w.d("MicroMsg.SnsExtStorage", "bg change");
    }
    paramString.field_bgId = str;
    paramString.field_bgUrl = parambep.huV;
    paramString.field_iFlag = parambep.huU;
    paramString.field_snsBgId = parambep.huW;
    paramString.field_local_flag |= 0x4;
    if (parambep != null) {}
    try
    {
      paramString.field_snsuser = parambep.toByteArray();
      a(paramString);
      GMTrace.o(8301098041344L, 61848);
      return true;
    }
    catch (Exception parambep)
    {
      for (;;) {}
    }
  }
  
  public final boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(8301903347712L, 61854);
    paramString = HE(paramString);
    int i = paramString.field_iFlag;
    if (paramBoolean1)
    {
      i |= 0x200;
      if (!paramBoolean2) {
        break label92;
      }
      i |= 0x400;
      label45:
      if (!paramBoolean3) {
        break label103;
      }
      i |= 0x800;
    }
    for (;;)
    {
      paramString.field_iFlag = i;
      c(paramString);
      GMTrace.o(8301903347712L, 61854);
      return true;
      i &= 0xFDFF;
      break;
      label92:
      i &= 0xFBFF;
      break label45;
      label103:
      i &= 0xF7FF;
    }
  }
  
  public final boolean ap(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8301634912256L, 61852);
    paramString = HE(paramString);
    int i = paramString.field_iFlag;
    if (paramBoolean) {
      i |= 0x1;
    }
    for (;;)
    {
      paramString.field_iFlag = i;
      c(paramString);
      GMTrace.o(8301634912256L, 61852);
      return true;
      i &= 0xFFFFFFFE;
    }
  }
  
  public final bep aq(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8301769129984L, 61853);
    paramString = HE(paramString).bjW();
    if (paramString == null)
    {
      w.e("MicroMsg.SnsExtStorage", "userinfo is null");
      GMTrace.o(8301769129984L, 61853);
      return null;
    }
    int i = paramString.uwA;
    if (paramBoolean) {
      i |= 0x1;
    }
    for (;;)
    {
      paramString.uwA = i;
      GMTrace.o(8301769129984L, 61853);
      return paramString;
      i &= 0xFFFFFFFE;
    }
  }
  
  public final bep b(String paramString, bep parambep)
  {
    GMTrace.i(8301232259072L, 61849);
    k localk = HE(paramString);
    if (localk == null)
    {
      paramString = a(paramString, localk);
      if (paramString != null) {
        if (parambep.huU != -1) {
          break label62;
        }
      }
      label62:
      for (i = paramString.field_iFlag;; i = parambep.huU)
      {
        parambep.huU = i;
        GMTrace.o(8301232259072L, 61849);
        return parambep;
      }
    }
    String str;
    label103:
    int j;
    if (bg.mZ(parambep.huV))
    {
      str = localk.field_bgUrl;
      parambep.huV = str;
      if (parambep.huU != -1) {
        break label166;
      }
      i = 1;
      if (i == 0) {
        break label171;
      }
      j = localk.field_iFlag;
      label114:
      parambep.huU = j;
      paramString = a(paramString, localk);
      if (paramString != null) {
        if (i == 0) {
          break label180;
        }
      }
    }
    label166:
    label171:
    label180:
    for (int i = paramString.field_iFlag;; i = parambep.huU)
    {
      parambep.huU = i;
      GMTrace.o(8301232259072L, 61849);
      return parambep;
      str = parambep.huV;
      break;
      i = 0;
      break label103;
      j = parambep.huU;
      break label114;
    }
  }
  
  public final bep b(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(8302037565440L, 61855);
    paramString = HE(paramString).bjW();
    if (paramString == null)
    {
      w.e("MicroMsg.SnsExtStorage", "userinfo is null");
      GMTrace.o(8302037565440L, 61855);
      return null;
    }
    int i = paramString.uwA;
    if (paramBoolean1)
    {
      i |= 0x200;
      if (!paramBoolean2) {
        break label112;
      }
      i |= 0x400;
      label71:
      if (!paramBoolean3) {
        break label123;
      }
      i |= 0x800;
    }
    for (;;)
    {
      paramString.uwA = i;
      GMTrace.o(8302037565440L, 61855);
      return paramString;
      i &= 0xFDFF;
      break;
      label112:
      i &= 0xFBFF;
      break label71;
      label123:
      i &= 0xF7FF;
    }
  }
  
  public final boolean b(k paramk)
  {
    GMTrace.i(8299755864064L, 61838);
    boolean bool = super.a(paramk);
    GMTrace.o(8299755864064L, 61838);
    return bool;
  }
  
  public final void bfY()
  {
    GMTrace.i(8299353210880L, 61835);
    w.d("MicroMsg.SnsExtStorage", "attachCache");
    this.quV = true;
    GMTrace.o(8299353210880L, 61835);
  }
  
  public final void bfZ()
  {
    GMTrace.i(8299487428608L, 61836);
    this.quV = false;
    this.quW.bhG();
    w.d("MicroMsg.SnsExtStorage", "detchCache");
    GMTrace.o(8299487428608L, 61836);
  }
  
  public final boolean c(k paramk)
  {
    GMTrace.i(8300963823616L, 61847);
    if ((paramk == null) || (paramk.field_userName == null) || (paramk.field_userName.equals("")))
    {
      GMTrace.o(8300963823616L, 61847);
      return false;
    }
    boolean bool = super.a(paramk);
    GMTrace.o(8300963823616L, 61847);
    return bool;
  }
  
  public final boolean dC(String paramString1, String paramString2)
  {
    GMTrace.i(8300426952704L, 61843);
    paramString1 = HE(paramString1);
    paramString1.field_newerIds = paramString2;
    boolean bool = super.a(paramString1);
    GMTrace.o(8300426952704L, 61843);
    return bool;
  }
  
  public final int e(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    GMTrace.i(8300292734976L, 61842);
    paramString1 = HE(paramString1);
    paramString1.field_md5 = paramString2;
    paramString1.field_adsession = paramArrayOfByte;
    super.a(paramString1);
    GMTrace.o(8300292734976L, 61842);
    return 0;
  }
  
  public final int k(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(8300158517248L, 61841);
    paramString1 = HE(paramString1);
    paramString1.field_md5 = paramString2;
    paramString1.field_lastFirstPageRequestErrType = paramInt1;
    paramString1.field_lastFirstPageRequestErrCode = paramInt2;
    super.a(paramString1);
    GMTrace.o(8300158517248L, 61841);
    return 0;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */