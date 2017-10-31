package com.tencent.mm.plugin.qqmail.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.n;
import com.tencent.mm.protocal.c.bjr;
import com.tencent.mm.protocal.c.li;
import com.tencent.mm.protocal.c.no;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class v
  implements com.tencent.mm.ac.e
{
  String fFB;
  public String oET;
  String[] oFw;
  String[] oFx;
  String[] oFy;
  public d oGA;
  int oGB;
  f oGC;
  public e oGh;
  String oGj;
  Map<String, String> oGk;
  Map<String, String> oGl;
  Map<String, String> oGm;
  private b oGn;
  public t oGo;
  public Map<String, String> oGp;
  public f oGq;
  HashMap<Long, Integer> oGr;
  HashMap<Long, String> oGs;
  HashMap<String, Integer> oGt;
  int oGu;
  public ArrayList<g> oGv;
  public String oGw;
  public String oGx;
  public HashMap<String, String> oGy;
  public c oGz;
  
  public v()
  {
    GMTrace.i(5472593641472L, 40774);
    this.oGk = new HashMap();
    this.oGl = new LinkedHashMap();
    this.oGm = new LinkedHashMap();
    this.oGp = new HashMap();
    this.oGq = null;
    this.oGh = null;
    this.oGr = new HashMap();
    this.oGs = new HashMap();
    this.oGt = new HashMap();
    this.oGu = 0;
    this.oGv = new ArrayList();
    this.oGw = null;
    this.oGx = null;
    this.oGy = new HashMap();
    this.oGB = 0;
    this.oGC = new f()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(5459977175040L, 40680);
        w.i("MicroMsg.ShareModeMailAppService", "currentSendFile: %s, offset: %d, totalLen: %d, filesInfo.size: %d", new Object[] { v.this.oGw, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(v.this.oGv.size()) });
        if (paramAnonymousInt1 >= paramAnonymousInt2)
        {
          v.this.oGy.put(v.this.oGx, ((o)paramAnonymousk).aWU().tKf);
          paramAnonymousk = ((o)paramAnonymousk).aWU();
          if (v.this.oGA != null) {
            v.this.oGA.c(v.this.oGB - v.this.oGv.size(), v.this.oGB, v.this.oGx, paramAnonymousk.tKf);
          }
          if (v.this.oGv.isEmpty())
          {
            w.i("MicroMsg.ShareModeMailAppService", "finished send all files");
            if (v.this.oGz != null) {
              v.this.oGz.aWX();
            }
            GMTrace.o(5459977175040L, 40680);
            return;
          }
          w.i("MicroMsg.ShareModeMailAppService", "finished send one file, continue to send another one");
          paramAnonymousk = (v.g)v.this.oGv.remove(0);
          v.this.oGw = paramAnonymousk.fFE;
          v.this.oGx = paramAnonymousk.fnP;
          paramAnonymousk = new o(v.this.oGx, v.this.oGw, this);
          ap.wT().a(paramAnonymousk, 0);
        }
        GMTrace.o(5459977175040L, 40680);
      }
    };
    ap.wT().a(483, this);
    ap.wT().a(484, this);
    ap.wT().a(485, this);
    GMTrace.o(5472593641472L, 40774);
  }
  
  private void N(ArrayList<Long> paramArrayList)
  {
    GMTrace.i(5473264730112L, 40779);
    if (this.oGr != null)
    {
      this.oGr.clear();
      this.oGr = null;
    }
    this.oGr = new HashMap();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      long l = ((Long)paramArrayList.next()).longValue();
      this.oGr.put(Long.valueOf(l), Integer.valueOf(1));
    }
    GMTrace.o(5473264730112L, 40779);
  }
  
  private void a(l paraml)
  {
    GMTrace.i(5473533165568L, 40781);
    this.oGu += 1;
    w.i("MicroMsg.ShareModeMailAppService", "processCheckImgStatusSceneEnd, checkTimes: %d", new Object[] { Integer.valueOf(this.oGu) });
    paraml = ((li)paraml.gMC.hlV.hmc).tHH.iterator();
    while (paraml.hasNext())
    {
      no localno = (no)paraml.next();
      long l = localno.tvn;
      int i = localno.jXo;
      if (this.oGr.containsKey(Long.valueOf(l)))
      {
        w.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, status: %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
        if (i == 0)
        {
          this.oGr.remove(Long.valueOf(l));
          if (localno.tKf != null)
          {
            w.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, attachId: %s", new Object[] { Long.valueOf(l), localno.tKf });
            this.oGs.put(Long.valueOf(l), localno.tKf);
            this.oGt.put(localno.tKf, Integer.valueOf(localno.tKg));
          }
        }
        else
        {
          this.oGr.put(Long.valueOf(l), Integer.valueOf(i));
        }
      }
    }
    if (this.oGr.isEmpty())
    {
      w.i("MicroMsg.ShareModeMailAppService", "all image is in server");
      if (this.oGn != null) {
        this.oGn.a(new ArrayList(), this.oGs);
      }
      GMTrace.o(5473533165568L, 40781);
      return;
    }
    if (this.oGu < 3)
    {
      w.i("MicroMsg.ShareModeMailAppService", "checkTime small than limit, doScene again");
      paraml = new l(g(this.oGr));
      ap.wT().a(paraml, 0);
      GMTrace.o(5473533165568L, 40781);
      return;
    }
    this.oGn.a(g(this.oGr), this.oGs);
    GMTrace.o(5473533165568L, 40781);
  }
  
  private static ArrayList<Long> g(HashMap<Long, Integer> paramHashMap)
  {
    GMTrace.i(5473398947840L, 40780);
    ArrayList localArrayList = new ArrayList();
    paramHashMap = paramHashMap.keySet().iterator();
    while (paramHashMap.hasNext()) {
      localArrayList.add((Long)paramHashMap.next());
    }
    GMTrace.o(5473398947840L, 40780);
    return localArrayList;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(5473130512384L, 40778);
    w.i("MicroMsg.ShareModeMailAppService", "onSceneEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.ShareModeMailAppService", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramk.getType() == 483)
      {
        a((l)paramk);
        GMTrace.o(5473130512384L, 40778);
        return;
      }
      if (this.oGh != null) {
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5460245610496L, 40682);
            v.this.oGh.Em(v.this.oET);
            GMTrace.o(5460245610496L, 40682);
          }
        });
      }
      GMTrace.o(5473130512384L, 40778);
      return;
    }
    if (paramk.getType() == 483)
    {
      a((l)paramk);
      GMTrace.o(5473130512384L, 40778);
      return;
    }
    if (paramk.getType() != 484) {
      paramk.getType();
    }
    GMTrace.o(5473130512384L, 40778);
  }
  
  public final void a(f paramf, e parame)
  {
    GMTrace.i(5472862076928L, 40776);
    this.oGq = paramf;
    this.oGh = parame;
    if (this.oGk.size() > 0)
    {
      paramf = new ArrayList();
      parame = this.oGk.keySet().iterator();
      while (parame.hasNext())
      {
        String str = (String)parame.next();
        w.i("MicroMsg.ShareModeMailAppService", "check img status, msgSvrId: %s", new Object[] { str });
        paramf.add(Long.valueOf(bg.getLong(str, 0L)));
      }
      parame = new b()
      {
        public final void a(ArrayList<Long> paramAnonymousArrayList, HashMap<Long, String> paramAnonymousHashMap)
        {
          GMTrace.i(5456890167296L, 40657);
          w.i("MicroMsg.ShareModeMailAppService", "finishChckImgStatus, notUploadedImgIdList.size: %d, attachIdMap.size: %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.size()), Integer.valueOf(paramAnonymousHashMap.size()) });
          Object localObject1;
          if (paramAnonymousArrayList.size() > 0)
          {
            localObject1 = v.this;
            paramAnonymousArrayList = paramAnonymousArrayList.iterator();
            while (paramAnonymousArrayList.hasNext())
            {
              Object localObject2 = (Long)paramAnonymousArrayList.next();
              localObject2 = (String)((v)localObject1).oGk.get(String.valueOf(localObject2));
              w.i("MicroMsg.ShareModeMailAppService", "appendAllUndownloadImage, filePath: %s", new Object[] { localObject2 });
              if (!bg.mZ((String)localObject2))
              {
                if (((v)localObject1).oGv == null) {
                  ((v)localObject1).oGv = new ArrayList();
                }
                ((v)localObject1).oGv.add(new v.g((String)localObject2, (String)localObject2));
              }
            }
          }
          if (paramAnonymousHashMap.size() > 0) {
            v.this.f(paramAnonymousHashMap);
          }
          v.this.sE(10);
          paramAnonymousArrayList = v.this;
          w.i("MicroMsg.ShareModeMailAppService", "uploadMsgImg, filesInfo.size = %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.oGv.size()) });
          if (paramAnonymousArrayList.oGv == null) {
            paramAnonymousArrayList.oGv = new ArrayList();
          }
          if (paramAnonymousArrayList.oGv.size() > 0)
          {
            paramAnonymousHashMap = new v.3(paramAnonymousArrayList);
            localObject1 = new v.4(paramAnonymousArrayList);
            w.i("MicroMsg.ShareModeMailAppService", "uploadFile, filesInfo.size: %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.oGv.size()) });
            paramAnonymousArrayList.oGz = paramAnonymousHashMap;
            paramAnonymousArrayList.oGA = ((v.d)localObject1);
            paramAnonymousArrayList.oGB = paramAnonymousArrayList.oGv.size();
            if ((paramAnonymousArrayList.oGv != null) && (paramAnonymousArrayList.oGv.size() > 0))
            {
              paramAnonymousHashMap = (v.g)paramAnonymousArrayList.oGv.remove(0);
              paramAnonymousArrayList.oGw = paramAnonymousHashMap.fFE;
              paramAnonymousArrayList.oGx = paramAnonymousHashMap.fnP;
              paramAnonymousArrayList.oGy = new HashMap();
              paramAnonymousArrayList = new o(paramAnonymousArrayList.oGx, paramAnonymousArrayList.oGw, paramAnonymousArrayList.oGC);
              ap.wT().a(paramAnonymousArrayList, 0);
            }
            GMTrace.o(5456890167296L, 40657);
            return;
          }
          paramAnonymousArrayList.sE(90);
          paramAnonymousArrayList.aWW();
          GMTrace.o(5456890167296L, 40657);
        }
      };
      w.i("MicroMsg.ShareModeMailAppService", "checkImgStatus");
      this.oGu = 0;
      N(paramf);
      if (this.oGs != null)
      {
        this.oGs.clear();
        this.oGs = null;
      }
      this.oGs = new HashMap();
      this.oGn = parame;
      paramf = new l(paramf);
      ap.wT().a(paramf, 0);
      GMTrace.o(5472862076928L, 40776);
      return;
    }
    sE(90);
    aWW();
    GMTrace.o(5472862076928L, 40776);
  }
  
  public final void aWW()
  {
    GMTrace.i(5472996294656L, 40777);
    int j = 0;
    Object localObject2 = null;
    int i = j;
    Object localObject1 = localObject2;
    final Object localObject3;
    Object localObject4;
    if (this.oGl != null)
    {
      i = j;
      localObject1 = localObject2;
      if (this.oGl.size() > 0)
      {
        localObject1 = new k.a[this.oGl.size()];
        localObject2 = this.oGl.keySet().iterator();
        i = 0;
        j = 0;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          localObject4 = new k.a();
          ((k.a)localObject4).oFC = ((String)this.oGl.get(localObject3));
          ((k.a)localObject4).fnP = ((String)localObject3);
          ((k.a)localObject4).name = ((String)this.oGm.get(localObject3));
          ((k.a)localObject4).fileSize = com.tencent.mm.a.e.aY((String)localObject3);
          localObject1[j] = localObject4;
          w.i("MicroMsg.ShareModeMailAppService", "fileInfos[%d], attachId: %s, fileName: %s, name: %s, fileSize: %d", new Object[] { Integer.valueOf(j), ((k.a)localObject4).oFC, ((k.a)localObject4).fnP, ((k.a)localObject4).name, Integer.valueOf(((k.a)localObject4).fileSize) });
          i = ((k.a)localObject4).fileSize + i;
          j += 1;
        }
      }
    }
    Object localObject5;
    if ((this.oGp != null) && (this.oGp.size() > 0))
    {
      localObject2 = new k.a[this.oGp.size()];
      localObject3 = this.oGp.keySet().iterator();
      j = 0;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (String)((Iterator)localObject3).next();
        localObject5 = new k.a();
        ((k.a)localObject5).oFC = ((String)this.oGp.get(localObject4));
        ((k.a)localObject5).fnP = ((String)localObject4);
        ((k.a)localObject5).fileSize = bg.a((Integer)this.oGt.get(((k.a)localObject5).oFC), 0);
        if (((k.a)localObject5).fileSize == 0) {
          ((k.a)localObject5).fileSize = com.tencent.mm.a.e.aY((String)localObject4);
        }
        localObject2[j] = localObject5;
        w.i("MicroMsg.ShareModeMailAppService", "imagesFileInfos[%d], attachId: %s, fileName: %s, fileSize: %d", new Object[] { Integer.valueOf(j), ((k.a)localObject5).oFC, ((k.a)localObject5).fnP, Integer.valueOf(((k.a)localObject5).fileSize) });
        i = ((k.a)localObject5).fileSize + i;
        j += 1;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.ShareModeMailAppService", "totalFileSize = %d", new Object[] { Integer.valueOf(i) });
      if ((localObject2 == null) || (localObject2.length == 0))
      {
        localObject2 = null;
        if ((localObject1 != null) && (localObject1.length != 0)) {
          break label607;
        }
        localObject1 = null;
      }
      label607:
      for (;;)
      {
        localObject3 = new a()
        {
          public final void aWY()
          {
            GMTrace.i(5453534724096L, 40632);
            v.this.sE(100);
            GMTrace.o(5453534724096L, 40632);
          }
        };
        localObject4 = new k(this.fFB, this.oFw, this.oFx, this.oFy, this.oET);
        ((k)localObject4).oFz = this.oGj;
        if ((localObject1 == null) || (localObject1.length <= 0)) {
          break label1649;
        }
        ((k)localObject4).oFB = new k.a[localObject1.length];
        j = 0;
        while (j < ((k)localObject4).oFB.length)
        {
          ((k)localObject4).oFB[j] = localObject1[j];
          j += 1;
        }
        break;
      }
      w.i("MicroMsg.MailContentFormatter", "setFileInfo, fileInfos.length = %d", new Object[] { Integer.valueOf(((k)localObject4).oFB.length) });
      if ((localObject2 != null) && (localObject2.length > 0))
      {
        ((k)localObject4).oFA = ((k.a[])localObject2);
        label653:
        localObject2 = new StringBuilder("");
        localObject5 = new StringBuilder("");
        if (((k)localObject4).fFB == null) {
          break label1667;
        }
        localObject1 = new StringBuilder("");
        ((StringBuilder)localObject1).append("From: ");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append("=?utf-8?B?");
        ((StringBuilder)localObject1).append(Base64.encodeToString(((k)localObject4).fFB.getBytes(), 2));
        ((StringBuilder)localObject1).append("?=");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append("<");
        ((StringBuilder)localObject1).append(((k)localObject4).fFB);
        ((StringBuilder)localObject1).append(">");
      }
      int k;
      Object localObject6;
      int m;
      label1649:
      label1667:
      for (localObject1 = ((StringBuilder)localObject1).toString();; localObject1 = null)
      {
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        localObject1 = ((k)localObject4).aWR();
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        localObject1 = ((k)localObject4).aWS();
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        localObject1 = ((k)localObject4).aWT();
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        ((StringBuilder)localObject5).append("Subject: ");
        if (((k)localObject4).oET != null) {
          ((StringBuilder)localObject5).append(((k)localObject4).oET);
        }
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("Mime-Version: 1.0");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("Content-Type: multipart/mixed;boundary=\"----=_NextPart_5208D22F_0929AFA8_5112E4AB\"");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("Content-Transfer-Encoding: 8Bit");
        ((StringBuilder)localObject5).append("\n");
        localObject1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", new Locale("en")).format(new Date());
        ((StringBuilder)localObject5).append("Date: " + (String)localObject1);
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("X-QQ-MIME: TCMime 1.0 by Tencent");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("X-Mailer: QQMail 2.x");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("X-QQ-Mailer: QQMail 2.x");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject2).append(((StringBuilder)localObject5).toString());
        ((StringBuilder)localObject2).append("\r\n");
        ((StringBuilder)localObject2).append("This is a multi-part message in MIME format.");
        ((StringBuilder)localObject2).append("\n");
        ((StringBuilder)localObject2).append("\r\n");
        localObject1 = new StringBuilder("");
        ((StringBuilder)localObject1).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject1).append("Content-Type:text/html;charset=\"utf-8\"");
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject1).append("Content-Transfer-Encoding:base64");
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject1).append("\r\n");
        ((StringBuilder)localObject1).append(Base64.encodeToString(((k)localObject4).oFz.getBytes(), 0));
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject2).append(((StringBuilder)localObject1).toString());
        ((StringBuilder)localObject2).append("\r\n");
        if ((((k)localObject4).oFA == null) || (((k)localObject4).oFA.length <= 0)) {
          break label1673;
        }
        localObject1 = ((k)localObject4).oFA;
        k = localObject1.length;
        j = 0;
        while (j < k)
        {
          StringBuilder localStringBuilder = localObject1[j];
          localObject5 = localStringBuilder.oFC;
          localObject6 = localStringBuilder.fnP;
          m = localStringBuilder.fileSize;
          localStringBuilder = new StringBuilder("");
          localStringBuilder.append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("Content-Type:image/jpeg;name=\"%s\"", new Object[] { localObject6 }));
          localStringBuilder.append("\n");
          localStringBuilder.append("Content-Transfer-Encoding:base64");
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("Content-ID:<%s>", new Object[] { localObject6 }));
          localStringBuilder.append("\n");
          localStringBuilder.append("\r\n");
          localStringBuilder.append(String.format("QQMail-LinkID:%s", new Object[] { localObject5 }));
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("QQMail-LinkSize:%d", new Object[] { Integer.valueOf(m) }));
          localStringBuilder.append("\n");
          localStringBuilder.append("QQMail-LineLen:72");
          localStringBuilder.append("\n");
          localStringBuilder.append("QQMail-BreakType:1");
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("QQMail-Key:%s", new Object[] { k.Ej((String)localObject5) }));
          localStringBuilder.append("\n");
          localStringBuilder.append("QQMail-LinkEnd");
          localStringBuilder.append("\n");
          ((StringBuilder)localObject2).append(localStringBuilder.toString());
          ((StringBuilder)localObject2).append("\r\n");
          j += 1;
        }
        ((k)localObject4).oFB = null;
        break;
        ((k)localObject4).oFA = null;
        break label653;
      }
      label1673:
      ((StringBuilder)localObject2).append("\r\n");
      if ((((k)localObject4).oFB != null) && (((k)localObject4).oFB.length > 0))
      {
        localObject1 = ((k)localObject4).oFB;
        k = localObject1.length;
        j = 0;
        while (j < k)
        {
          localObject5 = localObject1[j];
          localObject4 = ((k.a)localObject5).oFC;
          m = ((k.a)localObject5).fileSize;
          localObject5 = ((k.a)localObject5).name;
          localObject6 = new StringBuilder("");
          ((StringBuilder)localObject6).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("Content-Type:application/octet-stream;charset=\"utf-8\";name=\"=?utf-8?B?%s?=\"", new Object[] { Base64.encodeToString(((String)localObject5).getBytes(), 2) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("Content-Disposition: attachment; filename=\"=?utf-8?B?%s?=\"", new Object[] { Base64.encodeToString(((String)localObject5).getBytes(), 2) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("Content-Transfer-Encoding:base64");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("Content-ID:<%s>", new Object[] { Long.valueOf(System.currentTimeMillis()) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("\r\n");
          ((StringBuilder)localObject6).append(String.format("QQMail-LinkID:%s", new Object[] { localObject4 }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("QQMail-LinkSize:%d", new Object[] { Integer.valueOf(m) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("QQMail-LineLen:72");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("QQMail-BreakType:1");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("QQMail-Key:%s", new Object[] { k.Ej((String)localObject4) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("QQMail-LinkEnd");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject2).append(((StringBuilder)localObject6).toString());
          ((StringBuilder)localObject2).append("\r\n");
          j += 1;
        }
      }
      ((StringBuilder)localObject2).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB--");
      localObject1 = new m(((StringBuilder)localObject2).toString(), this.fFB, this.oFw, i, new f()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(5474741125120L, 40790);
          w.i("MicroMsg.ShareModeMailAppService", "composeSend, offset: %d, totalLen: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          if (paramAnonymousInt1 >= paramAnonymousInt2)
          {
            w.i("MicroMsg.ShareModeMailAppService", "finish send");
            if (localObject3 != null) {
              localObject3.aWY();
            }
          }
          GMTrace.o(5474741125120L, 40790);
        }
      });
      ap.wT().a((com.tencent.mm.ac.k)localObject1, 0);
      GMTrace.o(5472996294656L, 40777);
      return;
      localObject2 = null;
    }
  }
  
  public final void f(HashMap<Long, String> paramHashMap)
  {
    GMTrace.i(16027207335936L, 119412);
    if (this.oGp == null) {
      this.oGp = new HashMap();
    }
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Long)localIterator.next();
      String str = (String)paramHashMap.get(localObject);
      localObject = (String)this.oGk.get(String.valueOf(localObject));
      w.i("MicroMsg.ShareModeMailAppService", "appendDownloadImgToAttachIdMap, filePath: %s, attachId: %s", new Object[] { localObject, str });
      if (!bg.mZ((String)localObject)) {
        this.oGp.put(localObject, str);
      }
    }
    GMTrace.o(16027207335936L, 119412);
  }
  
  public final void sE(final int paramInt)
  {
    GMTrace.i(5472727859200L, 40775);
    if (this.oGq != null) {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5452729417728L, 40626);
          v.this.oGq.I(v.this.oET, paramInt, this.hsi);
          GMTrace.o(5452729417728L, 40626);
        }
      });
    }
    GMTrace.o(5472727859200L, 40775);
  }
  
  static abstract interface a
  {
    public abstract void aWY();
  }
  
  public static abstract interface b
  {
    public abstract void a(ArrayList<Long> paramArrayList, HashMap<Long, String> paramHashMap);
  }
  
  public static abstract interface c
  {
    public abstract void aWX();
  }
  
  public static abstract interface d
  {
    public abstract void c(int paramInt1, int paramInt2, String paramString1, String paramString2);
  }
  
  public static abstract interface e
  {
    public abstract void Em(String paramString);
  }
  
  public static abstract interface f
  {
    public abstract void I(String paramString, int paramInt1, int paramInt2);
  }
  
  public static final class g
  {
    public String fFE;
    public String fnP;
    
    public g()
    {
      GMTrace.i(5474875342848L, 40791);
      GMTrace.o(5474875342848L, 40791);
    }
    
    public g(String paramString1, String paramString2)
    {
      GMTrace.i(5475009560576L, 40792);
      this.fFE = paramString1;
      this.fnP = paramString2;
      GMTrace.o(5475009560576L, 40792);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */