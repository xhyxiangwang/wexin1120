package com.tencent.mm.plugin.favorite.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.lk;
import com.tencent.mm.g.a.lk.b;
import com.tencent.mm.g.a.mf;
import com.tencent.mm.g.a.qo;
import com.tencent.mm.g.a.qo.b;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.c.bfu;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import com.tencent.mm.x.o;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import com.tencent.mm.x.x.a;
import com.tencent.mm.x.x.b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
{
  public static void a(Context paramContext, String paramString, final j paramj, final sp paramsp, final Runnable paramRunnable)
  {
    GMTrace.i(6262330753024L, 46658);
    if (paramContext == null)
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but context is null");
      GMTrace.o(6262330753024L, 46658);
      return;
    }
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but to user is null");
      GMTrace.o(6262330753024L, 46658);
      return;
    }
    if (paramj == null) {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but info is null");
    }
    if (paramsp == null)
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but dataItem is null");
      GMTrace.o(6262330753024L, 46658);
      return;
    }
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6311722876928L, 47026);
        r.a(this.fmV, paramj, paramsp);
        af.u(paramRunnable);
        GMTrace.o(6311722876928L, 47026);
      }
      
      public final String toString()
      {
        GMTrace.i(6311857094656L, 47027);
        String str = super.toString() + "|sendFavFile";
        GMTrace.o(6311857094656L, 47027);
        return str;
      }
    });
    GMTrace.o(6262330753024L, 46658);
  }
  
  public static void a(Context paramContext, String paramString, sp paramsp)
  {
    GMTrace.i(16031368085504L, 119443);
    File localFile = new File(x.g(paramsp));
    if (localFile.exists())
    {
      String str = c(paramsp);
      w.d("MicroMsg.FavSendLogic", "send fav short Video::data path[%s] thumb path[%s]", new Object[] { localFile.getAbsolutePath(), str });
      bfu localbfu = null;
      ss localss = paramsp.tPx;
      if (localss != null)
      {
        localbfu = new bfu();
        localbfu.hdh = localss.hdh;
        localbfu.hde = localss.hde;
        localbfu.tQo = localss.tQo;
        localbfu.hdc = localss.hdc;
        localbfu.hdf = localss.hdf;
        localbfu.hdi = localss.hdi;
        localbfu.hdj = localss.hdj;
        localbfu.hdg = localss.hdg;
      }
      if (localbfu != null)
      {
        d.aNb().a(paramContext, paramString, localFile.getAbsolutePath(), str, 62, paramsp.duration, localbfu, false, false, paramsp.fMi);
        GMTrace.o(16031368085504L, 119443);
        return;
      }
      d.aNb().a(paramContext, paramString, localFile.getAbsolutePath(), str, 62, paramsp.duration, paramsp.fMi);
      GMTrace.o(16031368085504L, 119443);
      return;
    }
    w.w("MicroMsg.FavSendLogic", "sendShortVideo, error! data not existed");
    GMTrace.o(16031368085504L, 119443);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, j paramj, Runnable paramRunnable)
  {
    GMTrace.i(6262062317568L, 46656);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramj);
    a(paramContext, paramString1, paramString2, localLinkedList, paramRunnable);
    GMTrace.o(6262062317568L, 46656);
  }
  
  public static void a(final Context paramContext, String paramString1, final String paramString2, final List<j> paramList, final Runnable paramRunnable)
  {
    GMTrace.i(6262196535296L, 46657);
    if (paramContext == null)
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav msg, but context is null");
      af.u(paramRunnable);
      GMTrace.o(6262196535296L, 46657);
      return;
    }
    if (bg.mZ(paramString1))
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav msg, but to user is null");
      af.u(paramRunnable);
      GMTrace.o(6262196535296L, 46657);
      return;
    }
    if (paramList.isEmpty())
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav msg, but info is null");
      af.u(paramRunnable);
      GMTrace.o(6262196535296L, 46657);
      return;
    }
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6295079878656L, 46902);
        Iterator localIterator1 = bg.f(this.lOH.split(",")).iterator();
        while (localIterator1.hasNext())
        {
          String str = (String)localIterator1.next();
          Iterator localIterator2 = paramList.iterator();
          while (localIterator2.hasNext())
          {
            Object localObject3 = (j)localIterator2.next();
            if (localObject3 == null)
            {
              w.e("MicroMsg.FavSendLogic", "in run workerThread,want to send fav msg, but info is null,infos.size = %d", new Object[] { Integer.valueOf(paramList.size()) });
            }
            else
            {
              com.tencent.mm.plugin.report.service.g.paX.i(10925, new Object[] { Integer.valueOf(((j)localObject3).field_type), Integer.valueOf(((j)localObject3).field_id) });
              Object localObject1;
              Object localObject2;
              Object localObject4;
              Object localObject6;
              Object localObject5;
              switch (((j)localObject3).field_type)
              {
              case 3: 
              case 9: 
              case 12: 
              case 13: 
              default: 
                break;
              case 1: 
                d.aNb().A(str, ((j)localObject3).field_favProto.desc, o.fY(str));
                break;
              case 2: 
                localObject1 = ((j)localObject3).field_favProto.tQC.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = (sp)((Iterator)localObject1).next();
                  d.aNb().a(paramContext, str, x.g((sp)localObject2), 0, "", "");
                }
              case 16: 
                r.a(paramContext, str, x.n((j)localObject3));
                break;
              case 4: 
                r.b(paramContext, str, x.n((j)localObject3));
                break;
              case 6: 
                localObject1 = ((j)localObject3).field_favProto.tPL;
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("<msg>");
                ((StringBuilder)localObject2).append("<location ");
                ((StringBuilder)localObject2).append("x=\"").append(((sw)localObject1).lat).append("\" ");
                ((StringBuilder)localObject2).append("y=\"").append(((sw)localObject1).lng).append("\" ");
                ((StringBuilder)localObject2).append("scale=\"").append(((sw)localObject1).fFj).append("\" ");
                ((StringBuilder)localObject2).append("label=\"").append(bg.ap(((sw)localObject1).label, "")).append("\" ");
                ((StringBuilder)localObject2).append("maptype=\"0\" ");
                ((StringBuilder)localObject2).append("poiname=\"").append(bg.ap(((sw)localObject1).fJh, "")).append("\" ");
                ((StringBuilder)localObject2).append("/>");
                ((StringBuilder)localObject2).append("</msg>");
                d.aNb().A(str, ((StringBuilder)localObject2).toString(), 48);
                break;
              case 8: 
                r.a(str, (j)localObject3, x.n((j)localObject3));
                break;
              case 7: 
                localObject4 = paramContext;
                localObject6 = x.n((j)localObject3);
                localObject1 = new WXMusicObject();
                ((WXMusicObject)localObject1).musicUrl = ((sp)localObject6).tOE;
                ((WXMusicObject)localObject1).musicDataUrl = ((sp)localObject6).tOG;
                ((WXMusicObject)localObject1).musicLowBandUrl = ((sp)localObject6).tOI;
                ((WXMusicObject)localObject1).musicLowBandDataUrl = ((sp)localObject6).tOI;
                localObject5 = new WXMediaMessage();
                ((WXMediaMessage)localObject5).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
                ((WXMediaMessage)localObject5).title = ((sp)localObject6).title;
                ((WXMediaMessage)localObject5).description = ((sp)localObject6).desc;
                localObject2 = bg.readFromFile(x.h((sp)localObject6));
                localObject1 = localObject2;
                if (localObject2 == null)
                {
                  localObject1 = bg.ap(((sp)localObject6).fwl, "");
                  localObject1 = bg.readFromFile(x.axa() + com.tencent.mm.a.g.n(((String)localObject1).getBytes()));
                }
                ((WXMediaMessage)localObject5).thumbData = ((byte[])localObject1);
                localObject1 = ((j)localObject3).field_favProto.tQA.appId;
                l.a((WXMediaMessage)localObject5, (String)localObject1, x.a.hfp.m((Context)localObject4, (String)localObject1), str, 3, null);
                break;
              case 5: 
                if (localObject3 == null)
                {
                  w.w("MicroMsg.FavSendLogic", "item info is null, send fav url fail, return");
                }
                else
                {
                  localObject4 = x.n((j)localObject3);
                  localObject6 = ((j)localObject3).field_favProto.tPN;
                  Object localObject7 = ((j)localObject3).field_favProto.tQA;
                  localObject5 = new f.a();
                  if (localObject6 != null)
                  {
                    ((f.a)localObject5).title = ((tj)localObject6).title;
                    localObject2 = ((tj)localObject6).thumbUrl;
                    localObject1 = localObject2;
                    if (bg.mZ((String)localObject2)) {
                      localObject1 = bg.ap(((sp)localObject4).fwl, "");
                    }
                    ((f.a)localObject5).thumburl = ((String)localObject1);
                  }
                  if ((bg.mZ(((f.a)localObject5).title)) && (localObject4 != null)) {
                    ((f.a)localObject5).title = ((sp)localObject4).title;
                  }
                  if (localObject6 != null) {
                    ((f.a)localObject5).description = ((tj)localObject6).desc;
                  }
                  if ((bg.mZ(((f.a)localObject5).description)) && (localObject4 != null)) {
                    ((f.a)localObject5).description = ((sp)localObject4).desc;
                  }
                  if (((j)localObject3).field_favProto.tPN != null) {
                    ((f.a)localObject5).url = ((j)localObject3).field_favProto.tPN.tRc;
                  }
                  if ((localObject7 != null) && (bg.mZ(((f.a)localObject5).url))) {
                    ((f.a)localObject5).url = ((ta)localObject7).hNh;
                  }
                  if ((localObject4 != null) && (!bg.mZ(((sp)localObject4).canvasPageXml))) {
                    ((f.a)localObject5).canvasPageXml = ((sp)localObject4).canvasPageXml;
                  }
                  ((f.a)localObject5).action = "view";
                  ((f.a)localObject5).type = 5;
                  ((f.a)localObject5).fMi = ((sp)localObject4).fMi;
                  localObject2 = bg.readFromFile(x.h((sp)localObject4));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    if (localObject6 != null) {
                      break label1208;
                    }
                  }
                  for (localObject1 = null;; localObject1 = ((tj)localObject6).thumbUrl)
                  {
                    localObject2 = localObject1;
                    if (bg.mZ((String)localObject1)) {
                      localObject2 = bg.ap(((sp)localObject4).fwl, "");
                    }
                    localObject1 = bg.readFromFile(x.axa() + com.tencent.mm.a.g.n(((String)localObject2).getBytes()));
                    localObject2 = "fav_" + m.zF() + "_" + ((j)localObject3).field_id;
                    localObject6 = q.gi((String)localObject2);
                    localObject7 = q.Aw().n((String)localObject6, true);
                    ((q.b)localObject7).k("prePublishId", localObject2);
                    ((q.b)localObject7).k("preUsername", ((j)localObject3).field_fromUser);
                    ((q.b)localObject7).k("sendAppMsgScene", Integer.valueOf(1));
                    ((q.b)localObject7).k("adExtStr", ((sp)localObject4).fMi);
                    d.aNb().a(str, (byte[])localObject1, f.a.a((f.a)localObject5, null, null), (String)localObject6);
                    break;
                  }
                }
                break;
              case 10: 
                localObject1 = paramContext;
                localObject2 = ((j)localObject3).field_favProto.tPP;
                localObject3 = new lk();
                ((lk)localObject3).fJa.opType = 0;
                ((lk)localObject3).fJa.fJc = ((sy)localObject2).info;
                ((lk)localObject3).fJa.context = ((Context)localObject1);
                a.uLm.m((b)localObject3);
                if (((lk)localObject3).fJb.fwc)
                {
                  localObject2 = bg.readFromFile(x.axa() + com.tencent.mm.a.g.n(bg.ap(((sy)localObject2).thumbUrl, "").getBytes()));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    localObject1 = bg.readFromFile(((lk)localObject3).fJb.fBx);
                  }
                  d.aNb().a(str, (byte[])localObject1, ((lk)localObject3).fJb.fJd, null);
                }
                break;
              case 15: 
                localObject1 = paramContext;
                localObject2 = ((j)localObject3).field_favProto.tPR;
                localObject3 = new qo();
                ((qo)localObject3).fOA.opType = 0;
                ((qo)localObject3).fOA.fOC = ((td)localObject2).info;
                ((qo)localObject3).fOA.context = ((Context)localObject1);
                a.uLm.m((b)localObject3);
                w.d("MicroMsg.FavSendLogic", "sendFavTV ret = [%s], thumbUrl = [%s]", new Object[] { Boolean.valueOf(((qo)localObject3).fOB.fwc), ((td)localObject2).thumbUrl });
                if (((qo)localObject3).fOB.fwc)
                {
                  localObject2 = bg.readFromFile(x.axa() + com.tencent.mm.a.g.n(bg.ap(((td)localObject2).thumbUrl, "").getBytes()));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    localObject1 = bg.readFromFile(((qo)localObject3).fOB.fBx);
                  }
                  d.aNb().a(str, (byte[])localObject1, ((qo)localObject3).fOB.fJd, null);
                }
                break;
              case 11: 
                localObject1 = paramContext;
                localObject2 = ((j)localObject3).field_favProto.tPP;
                localObject3 = new lk();
                ((lk)localObject3).fJa.opType = 1;
                ((lk)localObject3).fJa.fJc = ((sy)localObject2).info;
                ((lk)localObject3).fJa.context = ((Context)localObject1);
                a.uLm.m((b)localObject3);
                if (((lk)localObject3).fJb.fwc)
                {
                  localObject2 = bg.readFromFile(x.axa() + com.tencent.mm.a.g.n(bg.ap(((sy)localObject2).thumbUrl, "").getBytes()));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    localObject1 = bg.readFromFile(((lk)localObject3).fJb.fBx);
                  }
                  d.aNb().a(str, (byte[])localObject1, ((lk)localObject3).fJb.fJd, null);
                }
                break;
              case 14: 
              case 18: 
                w.i("MicroMsg.FavSendLogic", "want send record, fav id %d", new Object[] { Integer.valueOf(((j)localObject3).field_id) });
                if ((((j)localObject3).field_id > 0) || (com.tencent.mm.pluginsdk.model.c.sRV))
                {
                  localObject1 = r.a.a(paramContext, (j)localObject3);
                  localObject2 = new sz();
                  try
                  {
                    w.d("MicroMsg.FavSendLogic", "do clone fav proto item");
                    ((sz)localObject2).aC(((j)localObject3).field_favProto.toByteArray());
                    localObject3 = new mf();
                    ((mf)localObject3).fKp.type = 2;
                    ((mf)localObject3).fKp.toUser = str;
                    ((mf)localObject3).fKp.fKs = ((sz)localObject2);
                    ((mf)localObject3).fKp.title = ((r.a)localObject1).title;
                    ((mf)localObject3).fKp.desc = ((r.a)localObject1).desc;
                    ((mf)localObject3).fKp.fBx = ((r.a)localObject1).fBx;
                    ((mf)localObject3).fKp.fKx = ((r.a)localObject1).lOO;
                    a.uLm.m((b)localObject3);
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      w.printErrStackTrace("MicroMsg.FavSendLogic", localException, "", new Object[0]);
                      w.e("MicroMsg.FavSendLogic", "clone fav proto item error: %s", new Object[] { localException.getMessage() });
                    }
                  }
                }
                break;
              case 17: 
                label1208:
                localObject1 = x.n(localException).desc;
                d.aNb().A(str, (String)localObject1, 42);
              }
            }
          }
          if (!bg.mZ(paramString2)) {
            d.aNb().A(str, paramString2, o.fY(str));
          }
        }
        af.u(paramRunnable);
        GMTrace.o(6295079878656L, 46902);
      }
      
      public final String toString()
      {
        GMTrace.i(6295214096384L, 46903);
        String str = super.toString() + "|sendFavMsg";
        GMTrace.o(6295214096384L, 46903);
        return str;
      }
    });
    GMTrace.o(6262196535296L, 46657);
  }
  
  public static void a(String paramString, j paramj, sp paramsp)
  {
    GMTrace.i(16031636520960L, 119445);
    Object localObject = x.g(paramsp);
    WXFileObject localWXFileObject = new WXFileObject();
    localWXFileObject.setFilePath((String)localObject);
    localObject = new WXMediaMessage();
    ((WXMediaMessage)localObject).mediaObject = localWXFileObject;
    ((WXMediaMessage)localObject).title = paramsp.title;
    if (bg.mZ(((WXMediaMessage)localObject).title)) {
      ((WXMediaMessage)localObject).title = paramj.field_favProto.title;
    }
    ((WXMediaMessage)localObject).description = paramsp.desc;
    ((WXMediaMessage)localObject).thumbData = bg.readFromFile(x.h(paramsp));
    l.a((WXMediaMessage)localObject, "", "", paramString, 3, null);
    GMTrace.o(16031636520960L, 119445);
  }
  
  public static void b(Context paramContext, String paramString, sp paramsp)
  {
    GMTrace.i(16031502303232L, 119444);
    File localFile = new File(x.g(paramsp));
    Object localObject2;
    if (localFile.exists())
    {
      localObject1 = new File(x.h(paramsp));
      if (((File)localObject1).exists()) {}
      for (localObject1 = ((File)localObject1).getAbsolutePath();; localObject1 = x.axa() + com.tencent.mm.a.g.n(bg.ap(paramsp.fwl, "").getBytes()))
      {
        w.d("MicroMsg.FavSendLogic", "sendVideo::data path[%s] thumb path[%s]", new Object[] { localFile.getAbsolutePath(), localObject1 });
        localObject2 = null;
        ss localss = paramsp.tPx;
        if (localss != null)
        {
          localObject2 = new bfu();
          ((bfu)localObject2).hdh = localss.hdh;
          ((bfu)localObject2).hde = localss.hde;
          ((bfu)localObject2).tQo = localss.tQo;
          ((bfu)localObject2).hdc = localss.hdc;
          ((bfu)localObject2).hdf = localss.hdf;
          ((bfu)localObject2).hdi = localss.hdi;
          ((bfu)localObject2).hdj = localss.hdj;
        }
        if (localObject2 == null) {
          break;
        }
        d.aNb().a(paramContext, paramString, localFile.getAbsolutePath(), (String)localObject1, 1, paramsp.duration, (bfu)localObject2, false, false, paramsp.fMi);
        GMTrace.o(16031502303232L, 119444);
        return;
      }
      d.aNb().a(paramContext, paramString, localFile.getAbsolutePath(), (String)localObject1, 1, paramsp.duration, paramsp.fMi);
      GMTrace.o(16031502303232L, 119444);
      return;
    }
    Object localObject1 = paramsp.tOE;
    if (!bg.mZ((String)localObject1))
    {
      localObject2 = new WXVideoObject();
      ((WXVideoObject)localObject2).videoUrl = ((String)localObject1);
      localObject1 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject2);
      paramContext = bg.ap(paramsp.title, paramContext.getResources().getString(R.l.dYl));
      ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
      ((WXMediaMessage)localObject1).title = paramContext;
      ((WXMediaMessage)localObject1).description = paramsp.desc;
      ((WXMediaMessage)localObject1).thumbData = bg.readFromFile(x.h(paramsp));
      if (((WXMediaMessage)localObject1).thumbData == null) {
        ((WXMediaMessage)localObject1).thumbData = bg.readFromFile(x.axa() + com.tencent.mm.a.g.n(bg.ap(paramsp.fwl, "").getBytes()));
      }
      paramContext = new f.a();
      paramContext.haS = 3;
      paramsp = paramsp.tPx;
      if (paramsp != null)
      {
        paramContext.hdh = paramsp.hdh;
        paramContext.hde = paramsp.hde;
        paramContext.hdd = paramsp.tQo;
        paramContext.hdc = paramsp.hdc;
        paramContext.hdf = paramsp.hdf;
        paramContext.hdi = paramsp.hdi;
        paramContext.hdj = paramsp.hdj;
      }
      l.a(paramContext, (WXMediaMessage)localObject1, paramString);
    }
    GMTrace.o(16031502303232L, 119444);
  }
  
  public static String c(sp paramsp)
  {
    GMTrace.i(6262464970752L, 46659);
    File localFile = new File(x.h(paramsp));
    if (localFile.exists()) {}
    for (paramsp = localFile.getAbsolutePath();; paramsp = x.axa() + com.tencent.mm.a.g.n(bg.ap(paramsp.fwl, "").getBytes()))
    {
      GMTrace.o(6262464970752L, 46659);
      return paramsp;
    }
  }
  
  public static final class a
  {
    public String desc;
    public String fBx;
    public String lOO;
    public String title;
    
    public a()
    {
      GMTrace.i(6311051788288L, 47021);
      GMTrace.o(6311051788288L, 47021);
    }
    
    public static a a(Context paramContext, j paramj)
    {
      GMTrace.i(6311320223744L, 47023);
      int j;
      Object localObject1;
      Object localObject2;
      if (paramj.field_type == 18)
      {
        locala = new a();
        localSparseIntArray = new SparseIntArray();
        if (paramj.field_type == 18) {
          locala.title = paramj.field_favProto.title;
        }
        localLinkedList = new LinkedList();
        localIterator = paramj.field_favProto.tQC.iterator();
        i = 0;
        j = 0;
        while (localIterator.hasNext())
        {
          localObject1 = (sp)localIterator.next();
          if ((paramj.field_type != 18) || (bg.mZ(((sp)localObject1).tOM)) || (!((sp)localObject1).tOM.equals(".htm")))
          {
            int k = localSparseIntArray.get(((sp)localObject1).aHe);
            localSparseIntArray.put(((sp)localObject1).aHe, k + 1);
            switch (((sp)localObject1).aHe)
            {
            default: 
              break;
            case 1: 
              if (localLinkedList.size() < 4)
              {
                localObject1 = ((sp)localObject1).desc;
                if (!bg.mZ((String)localObject1))
                {
                  localObject1 = ((String)localObject1).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
                  localLinkedList.add((String)localObject1 + "\n");
                }
              }
              break;
            case 3: 
              if (localLinkedList.size() < 4)
              {
                k = (int)x.cj(((sp)localObject1).duration);
                localLinkedList.add(paramContext.getString(R.l.dxw) + paramContext.getString(R.l.eaA, new Object[] { Integer.valueOf(k) }) + "\n");
              }
              break;
            case 2: 
              localLinkedList.size();
              if (j == 0)
              {
                localObject2 = x.h((sp)localObject1);
                if (xf((String)localObject2))
                {
                  locala.fBx = ((String)localObject2);
                  j = 1;
                }
                else
                {
                  locala.fBx = x.g((sp)localObject1);
                  j = 1;
                }
              }
              break;
            case 6: 
              if (localLinkedList.size() < 4)
              {
                localObject1 = ((sp)localObject1).tPr.tPL;
                localObject2 = new StringBuilder().append(paramContext.getString(R.l.dvZ));
                if ((!bg.mZ(((sw)localObject1).fJh)) && (!((sw)localObject1).fJh.equals(paramContext.getString(R.l.ekC)))) {
                  break label557;
                }
              }
              for (localObject1 = ((sw)localObject1).label;; localObject1 = ((sw)localObject1).fJh)
              {
                localLinkedList.add((String)localObject1 + "\n");
                if (i != 0) {
                  break;
                }
                i = 1;
                break;
              }
            case 8: 
              if (localLinkedList.size() < 4) {
                localLinkedList.add(paramContext.getString(R.l.dvK) + ((sp)localObject1).title + "\n");
              }
              if (i == 0) {
                i = 1;
              }
              break;
            case 4: 
              if (localLinkedList.size() < 4) {
                localLinkedList.add(paramContext.getString(R.l.dxv) + "\n");
              }
              break;
            case 17: 
              label557:
              if (localLinkedList.size() < 4) {
                localLinkedList.add(paramContext.getString(R.l.dwP) + "\n");
              }
              break;
            }
          }
        }
        locala.desc = "";
        paramj = localLinkedList.iterator();
        for (paramContext = ""; paramj.hasNext(); paramContext = paramContext + (String)localObject1) {
          localObject1 = (String)paramj.next();
        }
        paramj = paramContext.trim();
        paramContext = paramj;
        if (localLinkedList.size() >= 4) {
          paramContext = paramj + "...";
        }
        locala.desc = paramContext;
        locala.title = ab.getContext().getString(R.l.dYp);
        GMTrace.o(6311320223744L, 47023);
        return locala;
      }
      a locala = new a();
      SparseIntArray localSparseIntArray = new SparseIntArray();
      if (paramj.field_type == 14) {
        locala.title = paramj.field_favProto.title;
      }
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = paramj.field_favProto.tQC.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        localObject2 = (sp)localIterator.next();
        j = localSparseIntArray.get(((sp)localObject2).aHe);
        localSparseIntArray.put(((sp)localObject2).aHe, j + 1);
        switch (((sp)localObject2).aHe)
        {
        case 9: 
        case 12: 
        case 13: 
        default: 
          break;
        case 1: 
          if (localLinkedList.size() < 4) {
            localLinkedList.add(((sp)localObject2).tPt + ":" + ((sp)localObject2).desc + "\n");
          }
          break;
        case 3: 
          if (localLinkedList.size() < 4)
          {
            j = (int)x.aB(((sp)localObject2).duration);
            localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dxw) + paramContext.getString(R.l.eaA, new Object[] { Integer.valueOf(j) }) + "\n");
          }
          break;
        case 2: 
          if (localLinkedList.size() < 4) {
            localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dwG) + "\n");
          }
          if (i == 0)
          {
            paramj = x.h((sp)localObject2);
            if (!xf(paramj)) {
              break label2349;
            }
            locala.fBx = paramj;
            i = 1;
          }
          break;
        }
      }
      label1720:
      label2349:
      for (;;)
      {
        break;
        if (localLinkedList.size() < 4) {
          localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dxs) + ((sp)localObject2).title + "\n");
        }
        if (i != 0) {
          break;
        }
        paramj = x.h((sp)localObject2);
        if (xf(paramj))
        {
          locala.fBx = paramj;
          i = 1;
          break;
        }
        paramj = ((sp)localObject2).tPr.tPN;
        if (paramj == null) {}
        for (paramj = "";; paramj = paramj.thumbUrl)
        {
          localObject1 = paramj;
          if (bg.mZ(paramj)) {
            localObject1 = bg.ap(((sp)localObject2).fwl, "");
          }
          a(locala, (String)localObject1);
          break;
        }
        if (localLinkedList.size() < 4) {
          localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dxf) + "\n");
        }
        if (i != 0) {
          break;
        }
        paramj = x.h((sp)localObject2);
        if (xf(paramj))
        {
          locala.fBx = paramj;
          i = 1;
        }
        for (;;)
        {
          break;
          if (localLinkedList.size() < 4) {
            localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dxv) + "\n");
          }
          if (i != 0) {
            break;
          }
          paramj = x.h((sp)localObject2);
          if (xf(paramj))
          {
            locala.fBx = paramj;
            i = 1;
          }
          for (;;)
          {
            break;
            if (localLinkedList.size() < 4)
            {
              paramj = ((sp)localObject2).tPr.tPL;
              localObject1 = new StringBuilder().append(((sp)localObject2).tPt).append(":").append(paramContext.getString(R.l.dvZ));
              if ((!bg.mZ(paramj.fJh)) && (!paramj.fJh.equals(paramContext.getString(R.l.ekC)))) {
                break label1720;
              }
            }
            for (paramj = paramj.label;; paramj = paramj.fJh)
            {
              localLinkedList.add(paramj + "\n");
              if (i != 0) {
                break;
              }
              i = 1;
              break;
            }
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dwg) + ((sp)localObject2).title + "\n");
            }
            if (i != 0) {
              break;
            }
            a(locala, ((sp)localObject2).fwl);
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dvK) + ((sp)localObject2).title + "\n");
            }
            if (i != 0) {
              break;
            }
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dwI) + ((sp)localObject2).tPr.tPP.title + "\n");
            }
            if (i != 0) {
              break;
            }
            paramj = ((sp)localObject2).tPr.tPP;
            if (paramj != null) {
              a(locala, paramj.thumbUrl);
            }
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dus) + "\n");
            }
            if (i != 0) {
              break;
            }
            paramj = ((sp)localObject2).tPr.tPR;
            if (paramj != null) {
              a(locala, paramj.thumbUrl);
            }
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dvO) + "\n");
            }
            if (i != 0) {
              break;
            }
            ap.AS();
            locala.lOO = com.tencent.mm.x.c.yN().BH(((sp)localObject2).desc).siD;
            i = 1;
            break;
            if (localLinkedList.size() >= 4) {
              break;
            }
            localLinkedList.add(((sp)localObject2).tPt + ":" + paramContext.getString(R.l.dwP) + "\n");
            break;
            locala.desc = "";
            paramj = localLinkedList.iterator();
            for (paramContext = ""; paramj.hasNext(); paramContext = paramContext + (String)localObject1) {
              localObject1 = (String)paramj.next();
            }
            paramj = paramContext.trim();
            paramContext = paramj;
            if (localLinkedList.size() >= 4) {
              paramContext = paramj + "...";
            }
            locala.desc = paramContext;
            GMTrace.o(6311320223744L, 47023);
            return locala;
          }
        }
      }
    }
    
    private static void a(a parama, String paramString)
    {
      GMTrace.i(6311454441472L, 47024);
      paramString = x.axa() + com.tencent.mm.a.g.n(bg.ap(paramString, "").getBytes());
      if (xf(paramString)) {
        parama.fBx = paramString;
      }
      GMTrace.o(6311454441472L, 47024);
    }
    
    private static boolean xf(String paramString)
    {
      GMTrace.i(6311186006016L, 47022);
      boolean bool = new File(paramString).exists();
      GMTrace.o(6311186006016L, 47022);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */