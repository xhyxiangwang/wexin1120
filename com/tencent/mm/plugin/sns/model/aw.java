package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sns.data.h;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.aku;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdf;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdu;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cl;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aw
{
  private static final Pattern imC;
  public aly fNs;
  private String gCs;
  public int jOR;
  int pYr;
  int pYs;
  List<h> qfD;
  String qfE;
  String qfF;
  LinkedList<bes> qfG;
  LinkedList<Long> qfH;
  public bhc qfI;
  public amo qfJ;
  m qfK;
  bdk qfL;
  as qfM;
  public bft qfN;
  public boolean qfO;
  
  static
  {
    GMTrace.i(8085007499264L, 60238);
    imC = Pattern.compile("(\n){3,}");
    GMTrace.o(8085007499264L, 60238);
  }
  
  public aw(int paramInt)
  {
    GMTrace.i(8079907225600L, 60200);
    this.qfI = e.LM();
    this.qfJ = new amo();
    this.qfK = new m();
    this.qfL = null;
    Object localObject = new as();
    ((as)localObject).tuc = new aq();
    ((as)localObject).tue = new cl();
    ((as)localObject).tuf = new ct();
    this.qfM = ((as)localObject);
    this.qfN = new bft();
    this.fNs = new aly();
    this.gCs = "";
    this.qfO = false;
    this.gCs = ae.bgV();
    this.jOR = paramInt;
    this.qfI.uyu.tKc = paramInt;
    w.d("MicroMsg.UploadPackHelper", "contentType " + paramInt);
    this.qfI.uhC = 0;
    this.qfI.jWW = this.gCs;
    this.qfJ.tvh = com.tencent.mm.a.g.n((ae.bgV() + bg.Pq() + System.currentTimeMillis()).getBytes());
    this.qfJ.uhW = 0;
    this.qfJ.uhX = 0;
    this.qfJ.uhC = 0;
    this.qfJ.uia = 0;
    this.qfJ.hkI = 0;
    this.qfJ.uic = 0;
    this.qfJ.uif = 0;
    localObject = new bdk();
    ((bdk)localObject).tDg = 0L;
    ((bdk)localObject).orU = 0;
    ((bdk)localObject).uvf = 0;
    ((bdk)localObject).twR = ae.bgV();
    ((bdk)localObject).uvi = new LinkedList();
    ((bdk)localObject).uvg = 0;
    ((bdk)localObject).uvh = 0;
    ((bdk)localObject).uvo = new LinkedList();
    ((bdk)localObject).uvm = 0;
    ((bdk)localObject).uvn = 0;
    ((bdk)localObject).uvl = new LinkedList();
    ((bdk)localObject).uvj = 0;
    ((bdk)localObject).uvk = 0;
    ((bdk)localObject).ujv = 1;
    ((bdk)localObject).uvf = 0;
    ((bdk)localObject).uvp = 0;
    ((bdk)localObject).uve = new axs().bd(new byte[0]);
    this.qfL = ((bdk)localObject);
    localObject = this.qfK;
    ((m)localObject).field_localFlag |= 0x10;
    this.qfK.fZ((int)(System.currentTimeMillis() / 1000L));
    this.qfK.field_type = paramInt;
    this.qfK.field_userName = this.gCs;
    this.qfK.field_pravited = 0;
    this.qfK.field_stringSeq = "0000099999999999999999999";
    this.qfK.uD(2);
    this.qfK.bkd();
    if ((paramInt == 1) || (paramInt == 2)) {
      this.qfK.uD(4);
    }
    if (paramInt == 7) {
      this.qfK.uG(2);
    }
    this.qfH = new LinkedList();
    this.qfJ.uie = this.qfH;
    localObject = this.qfH.iterator();
    while (((Iterator)localObject).hasNext())
    {
      long l = ((Long)((Iterator)localObject).next()).longValue();
      bdf localbdf = new bdf();
      localbdf.uvc = l;
      this.qfL.tvK.add(localbdf);
    }
    this.qfL.ukL = this.qfH.size();
    GMTrace.o(8079907225600L, 60200);
  }
  
  private static String GQ(String paramString)
  {
    GMTrace.i(8080041443328L, 60201);
    if (paramString == null) {}
    String str2;
    for (String str1 = "";; str2 = paramString)
    {
      paramString = str1;
      try
      {
        str1 = str1.trim();
        paramString = str1;
        str1 = str1.replace("\r\n", "\n");
        paramString = str1;
        str1 = imC.matcher(str1).replaceAll("\n\n");
        GMTrace.o(8080041443328L, 60201);
        return str1;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      w.e("MicroMsg.UploadPackHelper", "filter desc error ");
      GMTrace.o(8080041443328L, 60201);
      return paramString;
    }
  }
  
  public static void Hb(String paramString)
  {
    GMTrace.i(14438337871872L, 107574);
    paramString = new File(paramString);
    if (!paramString.getParentFile().exists()) {
      paramString.getParentFile().mkdirs();
    }
    GMTrace.o(14438337871872L, 107574);
  }
  
  public static amn T(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8083262668800L, 60225);
    amn localamn = e.LN();
    localamn.nas = paramString1;
    w.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localamn.jXP = 2;
    localamn.mDo = paramString2;
    localamn.uhz = 0;
    localamn.uhA = paramString3;
    localamn.uhB = 0;
    localamn.uhG = 1;
    GMTrace.o(8083262668800L, 60225);
    return localamn;
  }
  
  public static amn a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(15963588132864L, 118938);
    amn localamn = e.LN();
    localamn.nas = paramString1;
    w.i("MicroMsg.UploadPackHelper", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", new Object[] { Integer.valueOf(6), paramString2, paramString4, paramString5, paramString6 });
    localamn.jXP = 6;
    if (FileOp.kI(paramString2) <= 0L)
    {
      GMTrace.o(15963588132864L, 118938);
      return null;
    }
    paramString1 = new h(paramString2, 6);
    paramString1.pYw = paramString4;
    paramString3 = ae.bhe().a(paramString1, paramString2, paramString3, paramString5, paramString6);
    paramString2 = null;
    paramString1 = paramString2;
    if (paramString3.height > 0)
    {
      paramString1 = paramString2;
      if (paramString3.width > 0)
      {
        paramString1 = paramString2;
        if (paramString3.fileSize > 0)
        {
          paramString1 = new amp();
          paramString1.uit = paramString3.height;
          paramString1.uis = paramString3.width;
          paramString1.uiu = paramString3.fileSize;
        }
      }
    }
    localamn.nas = ("Locall_path" + paramString3.pYt);
    localamn.uhD = paramString1;
    localamn.pYt = paramString3.pYt;
    GMTrace.o(15963588132864L, 118938);
    return localamn;
  }
  
  private static amn l(String paramString1, int paramInt, String paramString2)
  {
    Object localObject = null;
    GMTrace.i(8083128451072L, 60224);
    amn localamn = e.LN();
    localamn.nas = paramString1;
    w.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localamn.jXP = 2;
    if (FileOp.kI(paramString2) <= 0L)
    {
      GMTrace.o(8083128451072L, 60224);
      return null;
    }
    paramString1 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(new StringBuilder().append(paramString2).append(System.currentTimeMillis()).toString().getBytes());
    FileOp.o(paramString2, paramString1);
    paramString1 = new h(paramString1, 2);
    paramString2 = new LinkedList();
    paramString2.add(paramString1);
    paramString1 = ae.bhe().bu(paramString2);
    if ((paramString1 == null) || (paramString1.size() == 0))
    {
      GMTrace.o(8083128451072L, 60224);
      return null;
    }
    paramString2 = (h)paramString1.get(0);
    paramString1 = (String)localObject;
    if (paramString2.height > 0)
    {
      paramString1 = (String)localObject;
      if (paramString2.width > 0)
      {
        paramString1 = (String)localObject;
        if (paramString2.fileSize > 0)
        {
          paramString1 = new amp();
          paramString1.uit = paramString2.height;
          paramString1.uis = paramString2.width;
          paramString1.uiu = paramString2.fileSize;
        }
      }
    }
    localamn.nas = ("Locall_path" + paramString2.pYt);
    localamn.uhD = paramString1;
    localamn.pYt = paramString2.pYt;
    GMTrace.o(8083128451072L, 60224);
    return localamn;
  }
  
  private static amn r(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(8082994233344L, 60223);
    if (bg.bp(paramArrayOfByte))
    {
      w.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.tH() + " attachBuf is null");
      GMTrace.o(8082994233344L, 60223);
      return null;
    }
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(new StringBuilder(" ").append(System.currentTimeMillis()).toString().getBytes());
    FileOp.kL(ae.getAccSnsTmpPath());
    w.d("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.tH() + " buildUploadAttachInfo file:" + str);
    if (FileOp.b(str, paramArrayOfByte, paramArrayOfByte.length) < 0)
    {
      w.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.tH() + " writeFile error file:" + str);
      GMTrace.o(8082994233344L, 60223);
      return null;
    }
    paramString = l(paramString, 2, str);
    GMTrace.o(8082994233344L, 60223);
    return paramString;
  }
  
  public final aw GR(String paramString)
  {
    GMTrace.i(8080175661056L, 60202);
    this.qfE = GQ(paramString);
    this.qfI.uyr = this.qfE;
    GMTrace.o(8080175661056L, 60202);
    return this;
  }
  
  public final aw GS(String paramString)
  {
    GMTrace.i(8080578314240L, 60205);
    this.qfI.uyy = paramString;
    this.qfM.tuc.ttV = paramString;
    GMTrace.o(8080578314240L, 60205);
    return this;
  }
  
  public final aw GT(String paramString)
  {
    GMTrace.i(8080712531968L, 60206);
    this.qfI.qAC = paramString;
    GMTrace.o(8080712531968L, 60206);
    return this;
  }
  
  public final aw GU(String paramString)
  {
    GMTrace.i(8080980967424L, 60208);
    this.qfF = paramString;
    this.qfI.uyu.mCK = paramString;
    GMTrace.o(8080980967424L, 60208);
    return this;
  }
  
  public final aw GV(String paramString)
  {
    GMTrace.i(8081115185152L, 60209);
    this.qfI.uyu.mDo = paramString;
    GMTrace.o(8081115185152L, 60209);
    return this;
  }
  
  public final aw GW(String paramString)
  {
    GMTrace.i(8081249402880L, 60210);
    this.qfI.uyu.fuw = paramString;
    GMTrace.o(8081249402880L, 60210);
    return this;
  }
  
  public final aw GX(String paramString)
  {
    GMTrace.i(8082188926976L, 60217);
    cr localcr2 = this.qfI.uyt;
    cr localcr1 = localcr2;
    if (localcr2 == null) {
      localcr1 = new cr();
    }
    localcr1.nas = paramString;
    this.qfI.uyt = localcr1;
    GMTrace.o(8082188926976L, 60217);
    return this;
  }
  
  public final aw GY(String paramString)
  {
    GMTrace.i(8082323144704L, 60218);
    cr localcr2 = this.qfI.uyt;
    cr localcr1 = localcr2;
    if (localcr2 == null) {
      localcr1 = new cr();
    }
    localcr1.mFw = paramString;
    this.qfI.uyt = localcr1;
    GMTrace.o(8082323144704L, 60218);
    return this;
  }
  
  public final aw GZ(String paramString)
  {
    GMTrace.i(8082457362432L, 60219);
    this.qfI.tbH = bg.mY(paramString);
    GMTrace.o(8082457362432L, 60219);
    return this;
  }
  
  public final aw Ha(String paramString)
  {
    GMTrace.i(8082591580160L, 60220);
    this.qfI.tbI = bg.mY(paramString);
    GMTrace.o(8082591580160L, 60220);
    return this;
  }
  
  public final aw S(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8080846749696L, 60207);
    aq localaq = this.qfM.tuc;
    Object localObject = paramString1;
    if (bg.mZ(paramString1)) {
      localObject = "";
    }
    localaq.mDD = ((String)localObject);
    localObject = this.qfM.tuc;
    paramString1 = paramString2;
    if (bg.mZ(paramString2)) {
      paramString1 = "";
    }
    ((aq)localObject).ttW = paramString1;
    paramString2 = this.qfM.tuc;
    paramString1 = paramString3;
    if (bg.mZ(paramString3)) {
      paramString1 = "";
    }
    paramString2.ttX = paramString1;
    GMTrace.o(8080846749696L, 60207);
    return this;
  }
  
  public final aw a(akv paramakv)
  {
    GMTrace.i(8081517838336L, 60212);
    if (paramakv == null)
    {
      GMTrace.o(8081517838336L, 60212);
      return this;
    }
    this.qfI.uys = paramakv;
    GMTrace.o(8081517838336L, 60212);
    return this;
  }
  
  @Deprecated
  public final boolean a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    GMTrace.i(8083665321984L, 60228);
    paramString1 = T("", paramString1, paramString2);
    if (paramString1 == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
      GMTrace.o(8083665321984L, 60228);
      return false;
    }
    paramString1.mCK = paramString3;
    if (paramInt > 0) {
      paramString1.fvu = paramInt;
    }
    if (!bg.mZ(paramString4)) {
      paramString1.qyB = paramString4;
    }
    this.qfI.uyu.tKd.add(paramString1);
    GMTrace.o(8083665321984L, 60228);
    return true;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    GMTrace.i(8083799539712L, 60229);
    boolean bool = a(paramArrayOfByte, paramString1, paramString2, -1, "");
    GMTrace.o(8083799539712L, 60229);
    return bool;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(8083933757440L, 60230);
    paramArrayOfByte = r("", paramArrayOfByte);
    if (paramArrayOfByte == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.data is null!");
      GMTrace.o(8083933757440L, 60230);
      return false;
    }
    paramArrayOfByte.mCK = paramString1;
    if (paramInt > 0) {
      paramArrayOfByte.fvu = paramInt;
    }
    if (!bg.mZ(paramString3)) {
      paramArrayOfByte.qyB = paramString3;
    }
    if (!bg.mZ(paramString2)) {
      paramArrayOfByte.fuw = paramString2;
    }
    if (!bg.mZ(paramString1)) {
      paramArrayOfByte.mCK = paramString1;
    }
    this.qfI.uyu.tKd.add(paramArrayOfByte);
    paramString1 = new aku();
    paramString1.ufH = paramArrayOfByte.pYt;
    this.qfJ.uhY.add(paramString1);
    GMTrace.o(8083933757440L, 60230);
    return true;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    GMTrace.i(8084067975168L, 60231);
    paramArrayOfByte = r("", paramArrayOfByte);
    if ((paramArrayOfByte == null) || ((bg.mZ(paramString2)) && (bg.mZ(paramString3))))
    {
      w.e("MicroMsg.UploadPackHelper", "share music/video  appmsg.thumbData is null!");
      GMTrace.o(8084067975168L, 60231);
      return false;
    }
    if (!bg.mZ(paramString1)) {
      this.qfI.uyu.mDo = paramString1;
    }
    if (!bg.mZ(paramString3))
    {
      paramArrayOfByte.mDo = paramString3;
      paramArrayOfByte.uhz = 0;
    }
    for (;;)
    {
      if (!bg.mZ(paramString2))
      {
        paramArrayOfByte.uhE = paramString2;
        paramArrayOfByte.uhF = 0;
      }
      paramArrayOfByte.jXP = paramInt;
      paramArrayOfByte.fuw = bg.ap(paramString4, "");
      paramArrayOfByte.mCK = bg.ap(paramString5, "");
      this.qfI.uyu.tKd.add(paramArrayOfByte);
      paramString1 = new aku();
      paramString1.ufH = paramArrayOfByte.pYt;
      this.qfJ.uhY.add(paramString1);
      GMTrace.o(8084067975168L, 60231);
      return true;
      if (!bg.mZ(paramString2))
      {
        paramArrayOfByte.mDo = paramString2;
        paramArrayOfByte.uhz = 0;
      }
    }
  }
  
  public final aw ak(LinkedList<bes> paramLinkedList)
  {
    GMTrace.i(8081920491520L, 60215);
    this.qfG = paramLinkedList;
    this.qfJ.uhZ = paramLinkedList;
    paramLinkedList = this.qfG.iterator();
    while (paramLinkedList.hasNext())
    {
      bes localbes = (bes)paramLinkedList.next();
      bcz localbcz = new bcz();
      localbcz.twR = localbes.jWW;
      this.qfL.uvo.add(localbcz);
    }
    this.qfL.uvm = this.qfG.size();
    this.qfL.uvn = this.qfG.size();
    GMTrace.o(8081920491520L, 60215);
    return this;
  }
  
  public final aw bq(List<String> paramList)
  {
    GMTrace.i(8082725797888L, 60221);
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.qfL.ujv = 1;
      GMTrace.o(8082725797888L, 60221);
      return this;
    }
    paramList = paramList.iterator();
    LinkedList localLinkedList = new LinkedList();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      axt localaxt = new axt();
      localaxt.Qx(str);
      localLinkedList.add(localaxt);
    }
    this.qfJ.uij = localLinkedList;
    if (this.qfL.ujv == 3)
    {
      this.qfL.uvt = localLinkedList;
      this.qfL.uvs = localLinkedList.size();
    }
    for (;;)
    {
      GMTrace.o(8082725797888L, 60221);
      return this;
      if (this.qfL.ujv == 5)
      {
        this.qfL.uij = localLinkedList;
        this.qfL.uvu = localLinkedList.size();
      }
    }
  }
  
  public final void br(List<h> paramList)
  {
    GMTrace.i(8084202192896L, 60232);
    this.qfD = paramList;
    paramList = ae.bhe().bu(this.qfD);
    Object localObject1 = new LinkedList();
    if (paramList == null)
    {
      GMTrace.o(8084202192896L, 60232);
      return;
    }
    Object localObject2 = paramList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      h localh = (h)((Iterator)localObject2).next();
      aku localaku = new aku();
      localaku.ufH = localh.pYt;
      ((LinkedList)localObject1).add(localaku);
    }
    this.qfJ.uhY = ((LinkedList)localObject1);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localObject1 = (h)paramList.next();
      localObject2 = new amp();
      ((amp)localObject2).uit = 0.0F;
      ((amp)localObject2).uis = 0.0F;
      ((amp)localObject2).uiu = 0.0F;
      if ((((h)localObject1).height > 0) && (((h)localObject1).width > 0) && (((h)localObject1).fileSize > 0))
      {
        ((amp)localObject2).uit = ((h)localObject1).height;
        ((amp)localObject2).uis = ((h)localObject1).width;
        ((amp)localObject2).uiu = ((h)localObject1).fileSize;
      }
      localObject1 = e.a("Locall_path" + ((h)localObject1).pYt, ((h)localObject1).type, "", "", 0, 0, this.pYs, "", (amp)localObject2);
      this.qfI.uyu.tKd.add(localObject1);
    }
    GMTrace.o(8084202192896L, 60232);
  }
  
  public final int commit()
  {
    GMTrace.i(8084604846080L, 60235);
    long l = System.currentTimeMillis();
    try
    {
      this.qfJ.uib = System.currentTimeMillis();
      this.qfJ.hkI = 0;
      this.qfK.aE(this.qfL.toByteArray());
      this.qfK.field_postBuf = this.qfJ.toByteArray();
      w.d("MicroMsg.UploadPackHelper", "snsObj " + this.qfL.toString());
      w.d("MicroMsg.UploadPackHelper", "postinfo " + this.qfJ.toString());
      w.d("MicroMsg.UploadPackHelper", "timelineObj " + this.qfI.toString());
      if (this.qfI.uyu.tKd != null)
      {
        w.d("MicroMsg.UploadPackHelper", "timelineObj MeidaCount %d ", new Object[] { Integer.valueOf(this.qfI.uyu.tKd.size()) });
        i = 0;
        while (i < this.qfI.uyu.tKd.size())
        {
          amn localamn = (amn)this.qfI.uyu.tKd.get(i);
          if (localamn != null) {
            w.d("MicroMsg.UploadPackHelper", "timelineObj media %d %s", new Object[] { Integer.valueOf(localamn.pYt), bg.ap(localamn.mDo, "") });
          }
          i += 1;
        }
      }
    }
    catch (Exception localException1)
    {
      int i;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.UploadPackHelper", localException1, "", new Object[0]);
      }
      if (this.qfM != null) {
        this.qfI.qfM = this.qfM;
      }
      this.qfK.c(this.qfI);
      int k = ae.bhp().y(this.qfK);
      Iterator localIterator = this.qfJ.uhY.iterator();
      int j = 0;
      Object localObject1 = null;
      if (localIterator.hasNext())
      {
        Object localObject2 = (aku)localIterator.next();
        q localq = ae.bhe().dQ(((aku)localObject2).ufH);
        for (;;)
        {
          try
          {
            amq localamq = (amq)new amq().aC(localq.qvA);
            if (this.qfI.uyt != null) {
              localamq.fKY = this.qfI.uyt.nas;
            }
            if (this.fNs != null) {
              this.fNs.ugL = 0;
            }
            localamq.uiC = this.fNs;
            localamq.jOR = this.qfI.uyu.tKc;
            if ((localamq.jOR == 1) || (localamq.jOR == 15))
            {
              if (!bg.mZ(localamq.fKY))
              {
                i = 5;
                localamq.uiD = i;
              }
            }
            else
            {
              localq.qvA = localamq.toByteArray();
              ae.bhe().a(((aku)localObject2).ufH, localq);
              localObject2 = localamq.fwU;
              j += 1;
              localObject1 = localObject2;
              break;
            }
            if ((localamq.uiC == null) || (localamq.jOR != 15)) {
              break label607;
            }
            if (localamq.uiC.ugK)
            {
              i = 1;
              localamq.uiD = i;
              continue;
            }
          }
          catch (Exception localException2)
          {
            w.e("MicroMsg.UploadPackHelper", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
          }
          i = 2;
          continue;
          label607:
          boolean bool = ((h)this.qfD.get(j)).pYx;
          if (bool) {
            i = 1;
          } else {
            i = 2;
          }
        }
      }
      w.i("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s", new Object[] { Integer.valueOf(k), Integer.valueOf(this.qfK.field_type), localObject1 });
      if ((k > 0) && (this.qfK.field_type == 15)) {
        ap.dv(u.V("sns_table_", k), (String)localObject1);
      }
      w.d("MicroMsg.UploadPackHelper", "pack commit result " + k + " cost " + (System.currentTimeMillis() - l));
      GMTrace.o(8084604846080L, 60235);
      return k;
    }
  }
  
  public final void d(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(8084336410624L, 60233);
    bdu localbdu = new bdu();
    localbdu.twj = paramString1;
    localbdu.twk = paramString2;
    localbdu.twl = paramString3;
    localbdu.qAx = paramInt1;
    localbdu.qAy = paramInt2;
    this.qfJ.uik = localbdu;
    GMTrace.o(8084336410624L, 60233);
  }
  
  public final aw dw(String paramString1, String paramString2)
  {
    GMTrace.i(8080309878784L, 60203);
    this.qfJ.token = paramString1;
    this.qfJ.uih = paramString2;
    GMTrace.o(8080309878784L, 60203);
    return this;
  }
  
  public final boolean dx(String paramString1, String paramString2)
  {
    GMTrace.i(8083531104256L, 60227);
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString1.getBytes());
    Hb(str);
    FileOp.o(paramString1, str);
    paramString1 = l("", 2, str);
    if (paramString1 == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      GMTrace.o(8083531104256L, 60227);
      return false;
    }
    paramString1.mCK = paramString2;
    if (bg.mZ(paramString1.fuw)) {
      paramString1.fuw = paramString2;
    }
    this.qfI.uyu.tKd.add(paramString1);
    paramString2 = new aku();
    paramString2.ufH = paramString1.pYt;
    this.qfJ.uhY.add(paramString2);
    GMTrace.o(8083531104256L, 60227);
    return true;
  }
  
  public final boolean j(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(8083396886528L, 60226);
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString1.getBytes());
    Hb(str);
    FileOp.o(paramString1, str);
    paramString1 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString2.getBytes());
    FileOp.o(paramString2, paramString1);
    paramString1 = a("", 6, str, paramString1, paramString4, "", "");
    if (paramString1 == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      GMTrace.o(8083396886528L, 60226);
      return false;
    }
    paramString1.mCK = paramString3;
    if (bg.mZ(paramString1.fuw)) {
      paramString1.fuw = paramString3;
    }
    this.qfI.uyu.tKd.add(paramString1);
    paramString2 = new aku();
    paramString2.ufH = paramString1.pYt;
    this.qfJ.uhY.add(paramString2);
    GMTrace.o(8083396886528L, 60226);
    return true;
  }
  
  public final void ot(String paramString)
  {
    GMTrace.i(8084470628352L, 60234);
    this.qfJ.fwy = paramString;
    GMTrace.o(8084470628352L, 60234);
  }
  
  public final aw uk(int paramInt)
  {
    GMTrace.i(8080444096512L, 60204);
    this.qfI.uyw = 1;
    this.qfI.uyx = paramInt;
    GMTrace.o(8080444096512L, 60204);
    return this;
  }
  
  public final void ul(int paramInt)
  {
    GMTrace.i(8081383620608L, 60211);
    w.d("MicroMsg.UploadPackHelper", "set post form " + paramInt);
    this.qfJ.uic = paramInt;
    GMTrace.o(8081383620608L, 60211);
  }
  
  public final aw um(int paramInt)
  {
    GMTrace.i(8081652056064L, 60213);
    this.pYs = paramInt;
    this.qfJ.uhC = paramInt;
    this.qfI.uhC = paramInt;
    if (paramInt > 0)
    {
      this.qfK.field_pravited = paramInt;
      this.qfK.bka();
      this.qfK.uG(2);
      this.qfK.bke();
    }
    GMTrace.o(8081652056064L, 60213);
    return this;
  }
  
  public final aw un(int paramInt)
  {
    GMTrace.i(8081786273792L, 60214);
    this.pYr = paramInt;
    this.qfJ.uhX = paramInt;
    GMTrace.o(8081786273792L, 60214);
    return this;
  }
  
  public final aw uo(int paramInt)
  {
    GMTrace.i(8082054709248L, 60216);
    this.qfJ.uif = paramInt;
    GMTrace.o(8082054709248L, 60216);
    return this;
  }
  
  public final aw up(int paramInt)
  {
    GMTrace.i(8082860015616L, 60222);
    if (paramInt == 1) {
      this.qfL.ujv = 3;
    }
    for (;;)
    {
      this.qfJ.uii = paramInt;
      GMTrace.o(8082860015616L, 60222);
      return this;
      if (paramInt == 0) {
        this.qfL.ujv = 5;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */