package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.b.dd;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class m
  extends dd
{
  protected static c.a gLR;
  protected static Map<String, bhc> quX;
  protected static Map<String, amo> quY;
  private boolean pYb;
  public String quP;
  public int quQ;
  public String quZ;
  public e qva;
  private amo qvb;
  
  static
  {
    GMTrace.i(8299218993152L, 61834);
    c.a locala = new c.a();
    locala.hRR = new Field[15];
    locala.columns = new String[16];
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
    locala.columns[14] = "subType";
    locala.uQH.put("subType", "INTEGER");
    localStringBuilder.append(" subType INTEGER");
    locala.columns[15] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    quX = new ConcurrentHashMap();
    quY = new ConcurrentHashMap();
    GMTrace.o(8299218993152L, 61834);
  }
  
  public m()
  {
    GMTrace.i(8293044977664L, 61788);
    this.quP = null;
    this.quZ = null;
    this.pYb = false;
    this.qvb = null;
    GMTrace.o(8293044977664L, 61788);
  }
  
  public m(byte paramByte)
  {
    GMTrace.i(8293313413120L, 61790);
    this.quP = null;
    this.quZ = null;
    this.pYb = false;
    this.qvb = null;
    dL(0L);
    GMTrace.o(8293313413120L, 61790);
  }
  
  private static int dM(long paramLong)
  {
    GMTrace.i(8293984501760L, 61795);
    String str = new SimpleDateFormat("yyyyMMdd").format(new Date(1000L * paramLong));
    try
    {
      i = Integer.valueOf(str).intValue();
      GMTrace.o(8293984501760L, 61795);
      return i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SnsInfo", "error valueOf  " + str);
        int i = (int)(paramLong / 86400L);
      }
    }
  }
  
  public static boolean dO(long paramLong)
  {
    GMTrace.i(8296803074048L, 61816);
    if (bg.aE(paramLong / 1000L) > 1200L)
    {
      GMTrace.o(8296803074048L, 61816);
      return true;
    }
    GMTrace.o(8296803074048L, 61816);
    return false;
  }
  
  public static void release()
  {
    try
    {
      GMTrace.i(8295729332224L, 61808);
      quX.clear();
      quY.clear();
      GMTrace.o(8295729332224L, 61808);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static m x(m paramm)
  {
    GMTrace.i(8293447630848L, 61791);
    m localm = new m();
    localm.quQ = paramm.quQ;
    localm.field_snsId = paramm.field_snsId;
    localm.field_userName = paramm.field_userName;
    localm.field_localFlag = paramm.field_localFlag;
    localm.field_createTime = paramm.field_createTime;
    localm.field_head = paramm.field_head;
    localm.field_localPrivate = paramm.field_localPrivate;
    localm.field_type = paramm.field_type;
    localm.field_sourceType = paramm.field_sourceType;
    localm.field_likeFlag = paramm.field_likeFlag;
    localm.field_pravited = paramm.field_pravited;
    localm.field_stringSeq = paramm.field_stringSeq;
    localm.field_content = paramm.field_content;
    localm.field_attrBuf = paramm.field_attrBuf;
    GMTrace.o(8293447630848L, 61791);
    return localm;
  }
  
  public final boolean Hy(String paramString)
  {
    GMTrace.i(8296131985408L, 61811);
    paramString = com.tencent.mm.modelsns.e.lm(paramString);
    try
    {
      this.field_content = paramString.toByteArray();
      this.quP = (g.n(this.field_content) + g.n(this.field_attrBuf));
      GMTrace.o(8296131985408L, 61811);
      return true;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.SnsInfo", paramString, "", new Object[0]);
      GMTrace.o(8296131985408L, 61811);
    }
    return false;
  }
  
  public final void aE(byte[] paramArrayOfByte)
  {
    GMTrace.i(8295326679040L, 61805);
    this.field_attrBuf = paramArrayOfByte;
    this.quP = (g.n(this.field_content) + g.n(this.field_attrBuf));
    GMTrace.o(8295326679040L, 61805);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8295595114496L, 61807);
    super.b(paramCursor);
    this.quQ = ((int)this.uQF);
    GMTrace.o(8295595114496L, 61807);
  }
  
  public final boolean bgY()
  {
    GMTrace.i(8298816339968L, 61831);
    if (this.field_snsId == 0L)
    {
      GMTrace.o(8298816339968L, 61831);
      return true;
    }
    GMTrace.o(8298816339968L, 61831);
    return false;
  }
  
  public final boolean bin()
  {
    GMTrace.i(8299084775424L, 61833);
    int i = bku();
    if ((i == 5) || (i == 4))
    {
      GMTrace.o(8299084775424L, 61833);
      return true;
    }
    GMTrace.o(8299084775424L, 61833);
    return false;
  }
  
  public final boolean bir()
  {
    GMTrace.i(20065013465088L, 149496);
    b localb = bjH();
    if (localb != null)
    {
      boolean bool = localb.bir();
      GMTrace.o(20065013465088L, 149496);
      return bool;
    }
    GMTrace.o(20065013465088L, 149496);
    return false;
  }
  
  public final b bjH()
  {
    GMTrace.i(8297339944960L, 61820);
    if (this.qva == null) {
      this.qva = ae.bhr().dI(this.field_snsId);
    }
    if (this.qva == null)
    {
      localb = new b(null);
      GMTrace.o(8297339944960L, 61820);
      return localb;
    }
    b localb = this.qva.bjH();
    GMTrace.o(8297339944960L, 61820);
    return localb;
  }
  
  public final a bjJ()
  {
    GMTrace.i(8297474162688L, 61821);
    if (this.qva == null) {
      this.qva = ae.bhr().dI(this.field_snsId);
    }
    if (this.qva == null)
    {
      locala = new a(null);
      GMTrace.o(8297474162688L, 61821);
      return locala;
    }
    a locala = this.qva.bjJ();
    GMTrace.o(8297474162688L, 61821);
    return locala;
  }
  
  public final bhc bjL()
  {
    GMTrace.i(8295863549952L, 61809);
    bhc localbhc1;
    if (this.field_content == null)
    {
      localbhc1 = com.tencent.mm.modelsns.e.LM();
      GMTrace.o(8295863549952L, 61809);
      return localbhc1;
    }
    if (this.quP == null) {
      this.quP = (g.n(this.field_content) + g.n(this.field_attrBuf));
    }
    if (quX.containsKey(this.quP))
    {
      localbhc1 = (bhc)quX.get(this.quP);
      if (localbhc1 != null)
      {
        GMTrace.o(8295863549952L, 61809);
        return localbhc1;
      }
    }
    try
    {
      localbhc1 = (bhc)new bhc().aC(this.field_content);
      quX.put(this.quP, localbhc1);
      GMTrace.o(8295863549952L, 61809);
      return localbhc1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
      bhc localbhc2 = com.tencent.mm.modelsns.e.LM();
      GMTrace.o(8295863549952L, 61809);
      return localbhc2;
    }
  }
  
  public final String bjM()
  {
    GMTrace.i(8293716066304L, 61793);
    if (uF(32))
    {
      str = u.V("ad_table_", this.field_snsId);
      GMTrace.o(8293716066304L, 61793);
      return str;
    }
    String str = u.V("sns_table_", this.field_snsId);
    GMTrace.o(8293716066304L, 61793);
    return str;
  }
  
  public final Bundle bjO()
  {
    GMTrace.i(15278675066880L, 113835);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("values", super.qQ());
    localBundle.putInt("localid", this.quQ);
    if (bkr() != null) {
      localBundle.putBundle("adValues", bkr().bjO());
    }
    GMTrace.o(15278675066880L, 113835);
    return localBundle;
  }
  
  public final amo bjY()
  {
    GMTrace.i(8293179195392L, 61789);
    amo localamo1;
    if (this.field_postBuf == null)
    {
      localamo1 = new amo();
      GMTrace.o(8293179195392L, 61789);
      return localamo1;
    }
    if (this.quZ == null) {
      this.quZ = g.n(this.field_postBuf);
    }
    if (quY.containsKey(this.quZ))
    {
      this.qvb = ((amo)quY.get(this.quZ));
      if (this.qvb != null)
      {
        localamo1 = this.qvb;
        GMTrace.o(8293179195392L, 61789);
        return localamo1;
      }
    }
    try
    {
      this.qvb = ((amo)new amo().aC(this.field_postBuf));
      quY.put(this.quZ, this.qvb);
      localamo1 = this.qvb;
      GMTrace.o(8293179195392L, 61789);
      return localamo1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SnsInfo", "error get snsinfo timeline!");
      amo localamo2 = new amo();
      GMTrace.o(8293179195392L, 61789);
      return localamo2;
    }
  }
  
  public final int bjZ()
  {
    GMTrace.i(8294252937216L, 61797);
    int i = this.field_createTime;
    GMTrace.o(8294252937216L, 61797);
    return i;
  }
  
  public final void bka()
  {
    GMTrace.i(8294387154944L, 61798);
    this.field_localPrivate |= 0x1;
    GMTrace.o(8294387154944L, 61798);
  }
  
  public final int bkb()
  {
    GMTrace.i(8294521372672L, 61799);
    int i = this.field_localPrivate;
    GMTrace.o(8294521372672L, 61799);
    return i;
  }
  
  public final boolean bkc()
  {
    GMTrace.i(8294655590400L, 61800);
    if ((this.field_localFlag & 0x80) > 0)
    {
      GMTrace.o(8294655590400L, 61800);
      return true;
    }
    GMTrace.o(8294655590400L, 61800);
    return false;
  }
  
  public final void bkd()
  {
    GMTrace.i(8294789808128L, 61801);
    this.field_localFlag |= 0x2;
    GMTrace.o(8294789808128L, 61801);
  }
  
  public final void bke()
  {
    GMTrace.i(8294924025856L, 61802);
    this.field_localFlag &= 0xFFFFFFFD;
    GMTrace.o(8294924025856L, 61802);
  }
  
  public final boolean bkf()
  {
    GMTrace.i(8295058243584L, 61803);
    if ((this.field_localFlag & 0x2) > 0)
    {
      GMTrace.o(8295058243584L, 61803);
      return true;
    }
    GMTrace.o(8295058243584L, 61803);
    return false;
  }
  
  public final String bkg()
  {
    GMTrace.i(8295192461312L, 61804);
    if (uF(32))
    {
      str = u.V("ad_table_", this.quQ);
      GMTrace.o(8295192461312L, 61804);
      return str;
    }
    String str = u.V("sns_table_", this.quQ);
    GMTrace.o(8295192461312L, 61804);
    return str;
  }
  
  public final boolean bkh()
  {
    GMTrace.i(8296266203136L, 61812);
    if ((this.field_localFlag & 0x10) > 0)
    {
      GMTrace.o(8296266203136L, 61812);
      return true;
    }
    GMTrace.o(8296266203136L, 61812);
    return false;
  }
  
  public final boolean bki()
  {
    GMTrace.i(8296400420864L, 61813);
    if (((this.field_localFlag & 0x20) > 0) && (this.field_snsId == 0L))
    {
      GMTrace.o(8296400420864L, 61813);
      return true;
    }
    GMTrace.o(8296400420864L, 61813);
    return false;
  }
  
  public final void bkj()
  {
    GMTrace.i(8296534638592L, 61814);
    this.field_localFlag &= 0xFFFFFFDF;
    GMTrace.o(8296534638592L, 61814);
  }
  
  public final void bkk()
  {
    GMTrace.i(8296668856320L, 61815);
    this.field_localFlag |= 0x20;
    GMTrace.o(8296668856320L, 61815);
  }
  
  public final String bkl()
  {
    GMTrace.i(8297608380416L, 61822);
    Object localObject = bjJ();
    if (localObject == null)
    {
      GMTrace.o(8297608380416L, 61822);
      return "";
    }
    localObject = ((a)localObject).qlp;
    GMTrace.o(8297608380416L, 61822);
    return (String)localObject;
  }
  
  public final String bkm()
  {
    GMTrace.i(8297742598144L, 61823);
    Object localObject = bjJ();
    if (localObject == null)
    {
      GMTrace.o(8297742598144L, 61823);
      return "";
    }
    localObject = ((a)localObject).qlo;
    GMTrace.o(8297742598144L, 61823);
    return (String)localObject;
  }
  
  public final String bkn()
  {
    GMTrace.i(8297876815872L, 61824);
    Object localObject = bjH();
    if (localObject != null)
    {
      localObject = ((b)localObject).qle;
      GMTrace.o(8297876815872L, 61824);
      return (String)localObject;
    }
    GMTrace.o(8297876815872L, 61824);
    return "";
  }
  
  public final String bko()
  {
    GMTrace.i(8298011033600L, 61825);
    Object localObject = bjJ();
    if (localObject != null)
    {
      localObject = ((a)localObject).qle;
      GMTrace.o(8298011033600L, 61825);
      return (String)localObject;
    }
    GMTrace.o(8298011033600L, 61825);
    return "";
  }
  
  public final String bkp()
  {
    GMTrace.i(8298145251328L, 61826);
    Object localObject = bjJ();
    if (localObject != null)
    {
      localObject = ((a)localObject).iLj;
      GMTrace.o(8298145251328L, 61826);
      return (String)localObject;
    }
    GMTrace.o(8298145251328L, 61826);
    return "";
  }
  
  public final String bkq()
  {
    GMTrace.i(8298279469056L, 61827);
    Object localObject = bjJ();
    if (localObject != null)
    {
      localObject = ((a)localObject).qhb;
      GMTrace.o(8298279469056L, 61827);
      return (String)localObject;
    }
    GMTrace.o(8298279469056L, 61827);
    return "";
  }
  
  public final e bkr()
  {
    GMTrace.i(8298413686784L, 61828);
    if (this.qva == null) {
      this.qva = ae.bhr().dI(this.field_snsId);
    }
    if (this.qva != null)
    {
      this.qva.field_createTime = this.field_createTime;
      this.qva.field_userName = this.field_userName;
      this.qva.field_likeFlag = this.field_likeFlag;
      this.qva.field_attrBuf = this.field_attrBuf;
    }
    e locale = this.qva;
    GMTrace.o(8298413686784L, 61828);
    return locale;
  }
  
  public final boolean bks()
  {
    GMTrace.i(15402155376640L, 114755);
    boolean bool = uF(32);
    GMTrace.o(15402155376640L, 114755);
    return bool;
  }
  
  public final int bkt()
  {
    GMTrace.i(20064879247360L, 149495);
    b localb = bjH();
    if (localb != null)
    {
      int i = localb.qlR;
      GMTrace.o(20064879247360L, 149495);
      return i;
    }
    GMTrace.o(20064879247360L, 149495);
    return 0;
  }
  
  public final int bku()
  {
    GMTrace.i(8298950557696L, 61832);
    if (uF(32))
    {
      Object localObject = bjH();
      if (((b)localObject).bim())
      {
        GMTrace.o(8298950557696L, 61832);
        return 3;
      }
      if (((b)localObject).bin())
      {
        localObject = bjL();
        if ((localObject != null) && (((bhc)localObject).uyu.tKc == 15) && (((bhc)localObject).uyB != 1))
        {
          GMTrace.o(8298950557696L, 61832);
          return 5;
        }
        GMTrace.o(8298950557696L, 61832);
        return 4;
      }
      if (this.field_type == 1)
      {
        GMTrace.o(8298950557696L, 61832);
        return 1;
      }
      GMTrace.o(8298950557696L, 61832);
      return 2;
    }
    GMTrace.o(8298950557696L, 61832);
    return -1;
  }
  
  public final void c(bhc parambhc)
  {
    GMTrace.i(8295997767680L, 61810);
    try
    {
      this.field_content = parambhc.toByteArray();
      this.quP = (g.n(this.field_content) + g.n(this.field_attrBuf));
      GMTrace.o(8295997767680L, 61810);
      return;
    }
    catch (Exception parambhc)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SnsInfo", parambhc, "", new Object[0]);
      }
    }
  }
  
  public final void dL(long paramLong)
  {
    GMTrace.i(8293581848576L, 61792);
    this.field_snsId = paramLong;
    if (paramLong != 0L) {
      dN(paramLong);
    }
    GMTrace.o(8293581848576L, 61792);
  }
  
  public final void dN(long paramLong)
  {
    GMTrace.i(8295460896768L, 61806);
    this.field_stringSeq = i.jdMethod_do(paramLong);
    this.field_stringSeq = i.Gf(this.field_stringSeq);
    w.d("MicroMsg.SnsInfo", paramLong + " stringSeq " + this.field_stringSeq);
    GMTrace.o(8295460896768L, 61806);
  }
  
  public final void fZ(int paramInt)
  {
    GMTrace.i(8294118719488L, 61796);
    if ((paramInt - this.field_createTime < 180) && (paramInt - this.field_createTime >= 0))
    {
      if (this.field_head == 0) {
        this.field_head = dM(this.field_createTime);
      }
      GMTrace.o(8294118719488L, 61796);
      return;
    }
    this.field_createTime = paramInt;
    this.field_head = dM(paramInt);
    GMTrace.o(8294118719488L, 61796);
  }
  
  public final String getUserName()
  {
    GMTrace.i(8293850284032L, 61794);
    String str = this.field_userName;
    GMTrace.o(8293850284032L, 61794);
    return str;
  }
  
  public final boolean isValid()
  {
    GMTrace.i(8298682122240L, 61830);
    if (this.field_snsId != 0L)
    {
      GMTrace.o(8298682122240L, 61830);
      return true;
    }
    GMTrace.o(8298682122240L, 61830);
    return false;
  }
  
  protected final c.a uC()
  {
    GMTrace.i(8292910759936L, 61787);
    c.a locala = gLR;
    GMTrace.o(8292910759936L, 61787);
    return locala;
  }
  
  public final void uD(int paramInt)
  {
    GMTrace.i(8297071509504L, 61818);
    this.field_sourceType |= paramInt;
    GMTrace.o(8297071509504L, 61818);
  }
  
  public final boolean uF(int paramInt)
  {
    GMTrace.i(8296937291776L, 61817);
    if ((this.field_sourceType & paramInt) > 0)
    {
      GMTrace.o(8296937291776L, 61817);
      return true;
    }
    GMTrace.o(8296937291776L, 61817);
    return false;
  }
  
  public final void uG(int paramInt)
  {
    GMTrace.i(8297205727232L, 61819);
    this.field_sourceType &= (paramInt ^ 0xFFFFFFFF);
    GMTrace.o(8297205727232L, 61819);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */