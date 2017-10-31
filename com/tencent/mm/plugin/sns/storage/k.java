package com.tencent.mm.plugin.sns.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.dc;
import com.tencent.mm.protocal.c.bep;
import com.tencent.mm.protocal.c.sn;
import com.tencent.mm.protocal.c.tx;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;

public final class k
  extends dc
{
  protected static c.a gLR;
  
  static
  {
    GMTrace.i(8185939230720L, 60990);
    c.a locala = new c.a();
    locala.hRR = new Field[16];
    locala.columns = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "userName";
    locala.uQH.put("userName", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" userName TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "userName";
    locala.columns[1] = "md5";
    locala.uQH.put("md5", "TEXT");
    localStringBuilder.append(" md5 TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "newerIds";
    locala.uQH.put("newerIds", "TEXT");
    localStringBuilder.append(" newerIds TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "bgId";
    locala.uQH.put("bgId", "TEXT");
    localStringBuilder.append(" bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bgUrl";
    locala.uQH.put("bgUrl", "TEXT");
    localStringBuilder.append(" bgUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "older_bgId";
    locala.uQH.put("older_bgId", "TEXT");
    localStringBuilder.append(" older_bgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "local_flag";
    locala.uQH.put("local_flag", "INTEGER");
    localStringBuilder.append(" local_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "istyle";
    locala.uQH.put("istyle", "INTEGER");
    localStringBuilder.append(" istyle INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "iFlag";
    locala.uQH.put("iFlag", "INTEGER");
    localStringBuilder.append(" iFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "icount";
    locala.uQH.put("icount", "INTEGER");
    localStringBuilder.append(" icount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "faultS";
    locala.uQH.put("faultS", "BLOB");
    localStringBuilder.append(" faultS BLOB");
    localStringBuilder.append(", ");
    locala.columns[11] = "snsBgId";
    locala.uQH.put("snsBgId", "LONG");
    localStringBuilder.append(" snsBgId LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "snsuser";
    locala.uQH.put("snsuser", "BLOB");
    localStringBuilder.append(" snsuser BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "adsession";
    locala.uQH.put("adsession", "BLOB");
    localStringBuilder.append(" adsession BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "lastFirstPageRequestErrCode";
    locala.uQH.put("lastFirstPageRequestErrCode", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrCode INTEGER");
    localStringBuilder.append(", ");
    locala.columns[15] = "lastFirstPageRequestErrType";
    locala.uQH.put("lastFirstPageRequestErrType", "INTEGER");
    localStringBuilder.append(" lastFirstPageRequestErrType INTEGER");
    locala.columns[16] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(8185939230720L, 60990);
  }
  
  public k()
  {
    GMTrace.i(8185133924352L, 60984);
    GMTrace.o(8185133924352L, 60984);
  }
  
  public final void bjU()
  {
    GMTrace.i(8185402359808L, 60986);
    this.field_local_flag &= 0xFFFFFFFD;
    GMTrace.o(8185402359808L, 60986);
  }
  
  public final boolean bjV()
  {
    GMTrace.i(8185536577536L, 60987);
    if ((this.field_local_flag & 0x2) > 0)
    {
      GMTrace.o(8185536577536L, 60987);
      return true;
    }
    GMTrace.o(8185536577536L, 60987);
    return false;
  }
  
  public final bep bjW()
  {
    GMTrace.i(8185670795264L, 60988);
    try
    {
      bep localbep = (bep)new bep().aC(this.field_snsuser);
      GMTrace.o(8185670795264L, 60988);
      return localbep;
    }
    catch (Exception localException)
    {
      GMTrace.o(8185670795264L, 60988);
    }
    return null;
  }
  
  public final sn bjX()
  {
    GMTrace.i(8185805012992L, 60989);
    new tx();
    localObject1 = new sn();
    Object localObject2 = localObject1;
    if (!bg.bp(this.field_faultS)) {}
    try
    {
      localObject2 = (tx)new tx().aC(this.field_faultS);
      if (((tx)localObject2).tRU.size() <= 0) {
        break label95;
      }
      localObject2 = (sn)((tx)localObject2).tRU.getFirst();
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = localObject1;
      }
    }
    localObject2 = localObject1;
    GMTrace.o(8185805012992L, 60989);
    return (sn)localObject2;
  }
  
  protected final c.a uC()
  {
    GMTrace.i(8185268142080L, 60985);
    c.a locala = gLR;
    GMTrace.o(8185268142080L, 60985);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */