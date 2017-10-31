package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e
  extends com.tencent.mm.g.b.e
{
  protected static c.a gLR;
  protected static Map<String, b> quR;
  protected static Map<String, a> quS;
  public String quP;
  protected int quQ;
  
  static
  {
    GMTrace.i(8181912698880L, 60960);
    c.a locala = new c.a();
    locala.hRR = new Field[22];
    locala.columns = new String[23];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "snsId";
    locala.uQH.put("snsId", "LONG");
    localStringBuilder.append(" snsId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "userName";
    locala.uQH.put("userName", "TEXT");
    localStringBuilder.append(" userName TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "localFlag";
    locala.uQH.put("localFlag", "INTEGER");
    localStringBuilder.append(" localFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.uQH.put("createTime", "INTEGER");
    localStringBuilder.append(" createTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "head";
    locala.uQH.put("head", "INTEGER");
    localStringBuilder.append(" head INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "localPrivate";
    locala.uQH.put("localPrivate", "INTEGER");
    localStringBuilder.append(" localPrivate INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "type";
    locala.uQH.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "sourceType";
    locala.uQH.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "likeFlag";
    locala.uQH.put("likeFlag", "INTEGER");
    localStringBuilder.append(" likeFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "pravited";
    locala.uQH.put("pravited", "INTEGER");
    localStringBuilder.append(" pravited INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "stringSeq";
    locala.uQH.put("stringSeq", "TEXT");
    localStringBuilder.append(" stringSeq TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "content";
    locala.uQH.put("content", "BLOB");
    localStringBuilder.append(" content BLOB");
    localStringBuilder.append(", ");
    locala.columns[12] = "attrBuf";
    locala.uQH.put("attrBuf", "BLOB");
    localStringBuilder.append(" attrBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "postBuf";
    locala.uQH.put("postBuf", "BLOB");
    localStringBuilder.append(" postBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "adinfo";
    locala.uQH.put("adinfo", "TEXT");
    localStringBuilder.append(" adinfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "adxml";
    locala.uQH.put("adxml", "TEXT");
    localStringBuilder.append(" adxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "createAdTime";
    locala.uQH.put("createAdTime", "INTEGER");
    localStringBuilder.append(" createAdTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "exposureTime";
    locala.uQH.put("exposureTime", "INTEGER");
    localStringBuilder.append(" exposureTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "firstControlTime";
    locala.uQH.put("firstControlTime", "INTEGER");
    localStringBuilder.append(" firstControlTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "recxml";
    locala.uQH.put("recxml", "TEXT");
    localStringBuilder.append(" recxml TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "subType";
    locala.uQH.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[21] = "exposureCount";
    locala.uQH.put("exposureCount", "INTEGER");
    localStringBuilder.append(" exposureCount INTEGER");
    locala.columns[22] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    quR = new ConcurrentHashMap();
    quS = new ConcurrentHashMap();
    GMTrace.o(8181912698880L, 60960);
  }
  
  public e()
  {
    GMTrace.i(8180033650688L, 60946);
    this.quP = null;
    GMTrace.o(8180033650688L, 60946);
  }
  
  public final void C(Bundle paramBundle)
  {
    GMTrace.i(15248073424896L, 113607);
    if (paramBundle == null)
    {
      GMTrace.o(15248073424896L, 113607);
      return;
    }
    ContentValues localContentValues = (ContentValues)paramBundle.getParcelable("values");
    this.field_snsId = localContentValues.getAsLong("snsId").longValue();
    this.field_userName = localContentValues.getAsString("userName");
    this.field_localFlag = localContentValues.getAsInteger("localFlag").intValue();
    this.field_createTime = localContentValues.getAsInteger("createTime").intValue();
    this.field_head = localContentValues.getAsInteger("head").intValue();
    this.field_localPrivate = localContentValues.getAsInteger("localPrivate").intValue();
    this.field_type = localContentValues.getAsInteger("type").intValue();
    this.field_sourceType = localContentValues.getAsInteger("sourceType").intValue();
    this.field_likeFlag = localContentValues.getAsInteger("likeFlag").intValue();
    this.field_pravited = localContentValues.getAsInteger("pravited").intValue();
    this.field_stringSeq = localContentValues.getAsString("stringSeq");
    this.field_content = localContentValues.getAsByteArray("content");
    this.field_attrBuf = localContentValues.getAsByteArray("attrBuf");
    this.field_postBuf = localContentValues.getAsByteArray("postBuf");
    this.field_adinfo = localContentValues.getAsString("adinfo");
    this.field_adxml = localContentValues.getAsString("adxml");
    this.field_createAdTime = localContentValues.getAsInteger("createAdTime").intValue();
    this.field_exposureTime = localContentValues.getAsInteger("exposureTime").intValue();
    this.field_firstControlTime = localContentValues.getAsInteger("firstControlTime").intValue();
    this.field_recxml = localContentValues.getAsString("recxml");
    this.field_subType = localContentValues.getAsInteger("subType").intValue();
    this.uQF = localContentValues.getAsLong("rowid").longValue();
    this.quQ = paramBundle.getInt("localid");
    GMTrace.o(15248073424896L, 113607);
  }
  
  public final boolean Hy(String paramString)
  {
    GMTrace.i(8180973174784L, 60953);
    paramString = com.tencent.mm.modelsns.e.lm(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.quP = (g.n(this.field_content) + g.n(this.field_attrBuf));
      GMTrace.o(8180973174784L, 60953);
      return true;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.AdSnsInfo", paramString, "", new Object[0]);
      GMTrace.o(8180973174784L, 60953);
    }
    return false;
  }
  
  public final void aE(byte[] paramArrayOfByte)
  {
    GMTrace.i(8181241610240L, 60955);
    this.field_attrBuf = paramArrayOfByte;
    this.quP = (g.n(this.field_content) + g.n(this.field_attrBuf));
    GMTrace.o(8181241610240L, 60955);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8181778481152L, 60959);
    super.b(paramCursor);
    this.quQ = ((int)this.uQF);
    GMTrace.o(8181778481152L, 60959);
  }
  
  public final boolean bir()
  {
    GMTrace.i(20066624077824L, 149508);
    b localb = bjH();
    if (localb != null)
    {
      boolean bool = localb.bir();
      GMTrace.o(20066624077824L, 149508);
      return bool;
    }
    GMTrace.o(20066624077824L, 149508);
    return false;
  }
  
  public final b bjH()
  {
    GMTrace.i(8180302086144L, 60948);
    b localb;
    if (this.field_adxml != null)
    {
      if (quR.containsKey(this.field_adxml))
      {
        localb = (b)quR.get(this.field_adxml);
        GMTrace.o(8180302086144L, 60948);
        return localb;
      }
      localb = new b(this.field_adxml);
      quR.put(this.field_adxml, localb);
    }
    for (;;)
    {
      if (localb == null)
      {
        localb = new b(null);
        GMTrace.o(8180302086144L, 60948);
        return localb;
      }
      GMTrace.o(8180302086144L, 60948);
      return localb;
      localb = null;
    }
  }
  
  public final b bjI()
  {
    GMTrace.i(8180436303872L, 60949);
    b localb;
    if (this.field_recxml != null)
    {
      if (quR.containsKey(this.field_recxml))
      {
        localb = (b)quR.get(this.field_recxml);
        GMTrace.o(8180436303872L, 60949);
        return localb;
      }
      localb = new b(this.field_recxml);
      quR.put(this.field_recxml, localb);
    }
    for (;;)
    {
      if (localb == null)
      {
        localb = new b(null);
        GMTrace.o(8180436303872L, 60949);
        return localb;
      }
      GMTrace.o(8180436303872L, 60949);
      return localb;
      localb = null;
    }
  }
  
  public final a bjJ()
  {
    GMTrace.i(8180570521600L, 60950);
    a locala;
    if (this.field_adinfo != null)
    {
      if (quS.containsKey(this.field_adinfo))
      {
        locala = (a)quS.get(this.field_adinfo);
        GMTrace.o(8180570521600L, 60950);
        return locala;
      }
      locala = new a(this.field_adinfo);
      quS.put(this.field_adinfo, locala);
    }
    for (;;)
    {
      if (locala == null)
      {
        locala = new a(null);
        GMTrace.o(8180570521600L, 60950);
        return locala;
      }
      GMTrace.o(8180570521600L, 60950);
      return locala;
      locala = null;
    }
  }
  
  public final int bjK()
  {
    GMTrace.i(20066758295552L, 149509);
    b localb = bjI();
    if (localb == null)
    {
      GMTrace.o(20066758295552L, 149509);
      return 0;
    }
    int i = localb.qlR;
    GMTrace.o(20066758295552L, 149509);
    return i;
  }
  
  public final bhc bjL()
  {
    GMTrace.i(8181107392512L, 60954);
    bhc localbhc1;
    if (this.field_content == null)
    {
      localbhc1 = com.tencent.mm.modelsns.e.LM();
      GMTrace.o(8181107392512L, 60954);
      return localbhc1;
    }
    if (this.quP == null) {
      this.quP = (g.n(this.field_content) + g.n(this.field_attrBuf));
    }
    if (m.quX.containsKey(this.quP))
    {
      localbhc1 = (bhc)m.quX.get(this.quP);
      if (localbhc1 != null)
      {
        GMTrace.o(8181107392512L, 60954);
        return localbhc1;
      }
    }
    try
    {
      localbhc1 = (bhc)new bhc().aC(this.field_content);
      m.quX.put(this.quP, localbhc1);
      GMTrace.o(8181107392512L, 60954);
      return localbhc1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AdSnsInfo", "error get snsinfo timeline!");
      bhc localbhc2 = com.tencent.mm.modelsns.e.LM();
      GMTrace.o(8181107392512L, 60954);
      return localbhc2;
    }
  }
  
  public final String bjM()
  {
    GMTrace.i(8181510045696L, 60957);
    String str = u.V("ad_table_", this.field_snsId);
    GMTrace.o(8181510045696L, 60957);
    return str;
  }
  
  public final m bjN()
  {
    GMTrace.i(8181644263424L, 60958);
    m localm = new m();
    localm.c(bjL());
    w.d("MicroMsg.AdSnsInfo", "from server xml ok %d", new Object[] { Long.valueOf(this.field_snsId) });
    localm.quQ = this.quQ;
    localm.field_userName = this.field_userName;
    localm.fZ(this.field_createTime);
    localm.field_likeFlag = this.field_likeFlag;
    localm.dL(this.field_snsId);
    localm.field_sourceType = this.field_sourceType;
    localm.field_content = this.field_content;
    localm.uD(2);
    localm.uD(32);
    localm.field_attrBuf = this.field_attrBuf;
    bhc localbhc = localm.bjL();
    localbhc.jWW = this.field_userName;
    localm.field_pravited = localbhc.uhC;
    localm.bkd();
    localm.c(localbhc);
    localm.field_type = localbhc.uyu.tKc;
    localm.field_subType = localbhc.uyu.tKe;
    localm.qva = this;
    GMTrace.o(8181644263424L, 60958);
    return localm;
  }
  
  public final Bundle bjO()
  {
    GMTrace.i(15247939207168L, 113606);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.qQ());
    localBundle.putInt("localid", this.quQ);
    GMTrace.o(15247939207168L, 113606);
    return localBundle;
  }
  
  public final void c(bhc parambhc)
  {
    GMTrace.i(8180838957056L, 60952);
    try
    {
      this.field_content = parambhc.toByteArray();
      GMTrace.o(8180838957056L, 60952);
      return;
    }
    catch (Exception parambhc)
    {
      w.printErrStackTrace("MicroMsg.AdSnsInfo", parambhc, "", new Object[0]);
      GMTrace.o(8180838957056L, 60952);
    }
  }
  
  public final int getSource()
  {
    GMTrace.i(8180704739328L, 60951);
    b localb = bjI();
    if (localb == null)
    {
      GMTrace.o(8180704739328L, 60951);
      return 0;
    }
    int i = localb.qlR;
    GMTrace.o(8180704739328L, 60951);
    return i;
  }
  
  protected final c.a uC()
  {
    GMTrace.i(8180167868416L, 60947);
    c.a locala = gLR;
    GMTrace.o(8180167868416L, 60947);
    return locala;
  }
  
  public final void uD(int paramInt)
  {
    GMTrace.i(8181375827968L, 60956);
    this.field_sourceType |= paramInt;
    GMTrace.o(8181375827968L, 60956);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */