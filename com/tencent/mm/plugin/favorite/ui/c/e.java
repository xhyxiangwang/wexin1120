package com.tencent.mm.plugin.favorite.ui.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.kf;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.r.a;
import com.tencent.mm.plugin.favorite.b.v;
import com.tencent.mm.plugin.favorite.b.v.a;
import com.tencent.mm.plugin.favorite.b.v.b;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavImgGalleryUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteFileDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteImgDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteSightDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteTextDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteVideoPlayUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteVoiceDetailUI;
import com.tencent.mm.pluginsdk.ui.applet.d.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.ui.base.i.a.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import com.tencent.mm.x.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  private static int[] lXt;
  
  static
  {
    GMTrace.i(6425539510272L, 47874);
    lXt = new int[] { R.h.btQ, R.h.btR, R.h.btS, R.h.btT, R.h.btU };
    GMTrace.o(6425539510272L, 47874);
  }
  
  private static String A(j paramj)
  {
    GMTrace.i(6423928897536L, 47862);
    if (paramj.field_favProto == null)
    {
      GMTrace.o(6423928897536L, 47862);
      return null;
    }
    if ((paramj.field_favProto.tPN != null) && (!bg.mZ(paramj.field_favProto.tPN.canvasPageXml)))
    {
      paramj = paramj.field_favProto.tPN.thumbUrl;
      GMTrace.o(6423928897536L, 47862);
      return paramj;
    }
    paramj = paramj.field_favProto.tQC;
    if ((paramj != null) && (paramj.size() == 1))
    {
      paramj = ((sp)paramj.get(0)).haX;
      GMTrace.o(6423928897536L, 47862);
      return paramj;
    }
    GMTrace.o(6423928897536L, 47862);
    return null;
  }
  
  public static void a(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6423392026624L, 47858);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_info_id", paramj.field_localId);
    localIntent.putExtra("show_share", paramBoolean);
    com.tencent.mm.bi.d.b(paramContext, "record", ".ui.FavRecordDetailUI", localIntent);
    GMTrace.o(6423392026624L, 47858);
  }
  
  public static void a(d.a parama, final Context paramContext, j paramj)
  {
    Object localObject3 = null;
    Object localObject5 = null;
    Object localObject4 = null;
    GMTrace.i(6424734203904L, 47868);
    if ((paramj == null) || (paramContext == null))
    {
      w.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      GMTrace.o(6424734203904L, 47868);
      return;
    }
    sp localsp1 = x.n(paramj);
    if (paramj == null)
    {
      w.w("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
      label58:
      localObject1 = null;
      label60:
      if (!(localObject1 instanceof String)) {
        break label1336;
      }
    }
    Object localObject2;
    for (Object localObject1 = (String)localObject1;; localObject1 = null)
    {
      localObject2 = paramj.field_favProto.tPN;
      switch (paramj.field_type)
      {
      case 3: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
      case 17: 
      default: 
        paramj = (j)localObject4;
        if (localObject2 != null)
        {
          paramj = (j)localObject4;
          if (!bg.mZ(((tj)localObject2).title)) {
            paramj = ((tj)localObject2).title;
          }
        }
        localObject1 = paramj;
        if (bg.mZ(paramj)) {
          localObject1 = localsp1.title;
        }
        parama.Oq(paramContext.getResources().getString(R.l.dus) + (String)localObject1);
        GMTrace.o(6424734203904L, 47868);
        return;
        sp localsp2 = x.n(paramj);
        if (5 == paramj.field_type)
        {
          localObject1 = new File(x.h(localsp2));
          if (((File)localObject1).exists())
          {
            localObject1 = ((File)localObject1).getAbsolutePath();
            break label60;
          }
          localObject1 = paramj.field_favProto.tPN;
          if (localObject1 == null) {}
          for (localObject1 = null;; localObject1 = ((tj)localObject1).thumbUrl)
          {
            localObject2 = localObject1;
            if (bg.mZ((String)localObject1)) {
              localObject2 = localsp2.fwl;
            }
            localObject2 = x.xj((String)localObject2);
            localObject1 = localObject2;
            if (!bg.mZ((String)localObject2)) {
              break;
            }
            localObject1 = Integer.valueOf(R.k.dlk);
            break;
          }
        }
        if ((11 == paramj.field_type) || (10 == paramj.field_type))
        {
          localObject1 = paramj.field_favProto.tPP;
          if (localObject1 != null)
          {
            localObject2 = x.xj(((sy)localObject1).thumbUrl);
            localObject1 = localObject2;
            if (!bg.mZ((String)localObject2)) {
              break label60;
            }
            localObject1 = Integer.valueOf(R.k.dle);
            break label60;
          }
        }
        if ((15 == paramj.field_type) || (12 == paramj.field_type))
        {
          localObject1 = paramj.field_favProto.tPR;
          if (localObject1 != null)
          {
            localObject2 = x.xj(((td)localObject1).thumbUrl);
            localObject1 = localObject2;
            if (!bg.mZ((String)localObject2)) {
              break label60;
            }
            localObject1 = Integer.valueOf(R.k.dle);
            break label60;
          }
        }
        if ((2 == paramj.field_type) || (7 == paramj.field_type) || (16 == paramj.field_type) || (4 == paramj.field_type))
        {
          localObject1 = new File(x.h(localsp2));
          if (((File)localObject1).exists())
          {
            localObject1 = ((File)localObject1).getAbsolutePath();
            break label60;
          }
          localObject1 = x.xj(localsp2.fwl);
          localObject2 = localObject1;
          if (bg.mZ((String)localObject1))
          {
            x.b(paramj, localsp2, true);
            localObject2 = x.h(localsp2);
          }
          localObject1 = localObject2;
          if (!bg.mZ((String)localObject2)) {
            break label60;
          }
        }
        switch (paramj.field_type)
        {
        default: 
          localObject1 = Integer.valueOf(R.k.dlh);
          break;
        case 2: 
          localObject1 = Integer.valueOf(R.g.aVR);
          break;
        case 7: 
          localObject1 = Integer.valueOf(R.k.dkW);
          break;
          if ((3 == paramj.field_type) || (6 == paramj.field_type)) {
            break label58;
          }
          if (8 == paramj.field_type)
          {
            localObject1 = Integer.valueOf(com.tencent.mm.pluginsdk.c.Nd(localsp2.tOM));
            break;
          }
          if (17 == paramj.field_type)
          {
            ap.AS();
            localObject1 = com.tencent.mm.x.c.yN().BH(localsp2.desc);
            if ((((au.a)localObject1).siD != null) && (((au.a)localObject1).siD.length() != 0))
            {
              localObject1 = new SpannableString(((au.a)localObject1).siD);
              break;
            }
            localObject1 = Integer.valueOf(R.g.aYg);
            break;
          }
          if ((14 != paramj.field_type) || (paramj.field_favProto.tQC == null)) {
            break label58;
          }
          localObject1 = paramj.field_favProto.tQC.iterator();
          do
          {
            do
            {
              if (!((Iterator)localObject1).hasNext()) {
                break;
              }
              localsp2 = (sp)((Iterator)localObject1).next();
            } while (localsp2.aHe == 1);
            if (localsp2.aHe == 3)
            {
              localObject1 = Integer.valueOf(R.k.dlj);
              break label60;
            }
            if (localsp2.aHe == 6)
            {
              localObject1 = Integer.valueOf(R.k.dkV);
              break label60;
            }
            if (localsp2.aHe == 8)
            {
              localObject1 = Integer.valueOf(com.tencent.mm.pluginsdk.c.Nd(localsp2.tOM));
              break label60;
            }
            if ((localsp2.aHe == 2) || (localsp2.aHe == 7) || (localsp2.aHe == 15) || (localsp2.aHe == 4))
            {
              localObject1 = new File(x.h(localsp2));
              if (((File)localObject1).exists())
              {
                localObject1 = ((File)localObject1).getAbsolutePath();
                break label60;
              }
              localObject1 = x.xj(localsp2.fwl);
              if (bg.mZ((String)localObject1)) {
                switch (localsp2.aHe)
                {
                default: 
                  localObject1 = Integer.valueOf(R.k.dlh);
                  break;
                case 2: 
                  localObject1 = Integer.valueOf(R.g.aVR);
                  break;
                case 7: 
                  localObject1 = Integer.valueOf(R.k.dkW);
                  break;
                }
              }
              break label60;
            }
            if (localsp2.aHe == 5)
            {
              localObject1 = new File(x.h(localsp2));
              if (((File)localObject1).exists())
              {
                localObject1 = ((File)localObject1).getAbsolutePath();
                break label60;
              }
              localObject1 = localsp2.tPr.tPN;
              if (localObject1 == null) {}
              for (localObject1 = null;; localObject1 = ((tj)localObject1).thumbUrl)
              {
                localObject2 = localObject1;
                if (bg.mZ((String)localObject1)) {
                  localObject2 = localsp2.fwl;
                }
                localObject2 = x.xj((String)localObject2);
                localObject1 = localObject2;
                if (!bg.mZ((String)localObject2)) {
                  break;
                }
                localObject1 = Integer.valueOf(R.k.dlk);
                break;
              }
            }
            if ((localsp2.aHe == 10) || (localsp2.aHe == 11))
            {
              localObject2 = localsp2.tPr.tPP;
              if (localObject2 != null)
              {
                localObject2 = x.xj(((sy)localObject2).thumbUrl);
                localObject1 = localObject2;
                if (!bg.mZ((String)localObject2)) {
                  break label60;
                }
                localObject1 = Integer.valueOf(R.k.dle);
                break label60;
              }
            }
            if ((localsp2.aHe == 12) || (localsp2.aHe == 14))
            {
              localObject2 = localsp2.tPr.tPR;
              if (localObject2 != null)
              {
                localObject2 = x.xj(((td)localObject2).thumbUrl);
                localObject1 = localObject2;
                if (!bg.mZ((String)localObject2)) {
                  break label60;
                }
                localObject1 = Integer.valueOf(R.k.dle);
                break label60;
              }
            }
          } while (localsp2.aHe != 16);
          ap.AS();
          localObject1 = com.tencent.mm.x.c.yN().BH(localsp2.desc);
          if ((((au.a)localObject1).siD != null) && (((au.a)localObject1).siD.length() != 0))
          {
            localObject1 = new SpannableString(((au.a)localObject1).siD);
            break;
          }
          localObject1 = Integer.valueOf(R.g.aYg);
          break;
          label1336:
          if ((localObject1 instanceof Integer)) {
            ((Integer)localObject1).intValue();
          }
          break;
        }
        break;
      }
    }
    localObject1 = paramj.field_favProto.title;
    paramj = (j)localObject1;
    if (bg.mZ((String)localObject1)) {
      paramj = localsp1.title;
    }
    parama.Oq(paramContext.getResources().getString(R.l.dvK) + paramj);
    GMTrace.o(6424734203904L, 47868);
    return;
    parama.Oq(paramj.field_favProto.desc);
    parama.bIJ();
    parama.a(new i.a.a()
    {
      public final void ayk()
      {
        GMTrace.i(6422720937984L, 47853);
        Intent localIntent = new Intent();
        localIntent.putExtra("Retr_Msg_content", this.lXu.field_favProto.desc);
        com.tencent.mm.bi.d.a(paramContext, ".ui.transmit.RetransmitPreviewUI", localIntent);
        com.tencent.mm.ui.base.b.fk(paramContext);
        GMTrace.o(6422720937984L, 47853);
      }
    });
    GMTrace.o(6424734203904L, 47868);
    return;
    paramj = paramj.field_favProto.tPL;
    parama.Oq(paramContext.getString(R.l.dvZ) + paramj.label);
    GMTrace.o(6424734203904L, 47868);
    return;
    if ((localObject2 != null) && (!bg.mZ(((tj)localObject2).title))) {
      paramj = ((tj)localObject2).title;
    }
    for (localObject1 = ((tj)localObject2).desc;; localObject1 = localObject3)
    {
      localObject2 = paramj;
      if (bg.mZ(paramj)) {
        localObject2 = localsp1.title;
      }
      if (bg.mZ((String)localObject1)) {
        paramj = localsp1.desc;
      }
      parama.Oq(paramContext.getResources().getString(R.l.dxs) + (String)localObject2);
      GMTrace.o(6424734203904L, 47868);
      return;
      paramj = r.a.a(paramContext, paramj).title;
      parama.Oq(paramContext.getResources().getString(R.l.dwP) + paramj);
      GMTrace.o(6424734203904L, 47868);
      return;
      parama.a(com.tencent.mm.sdk.platformtools.d.QK((String)localObject1), 3);
      GMTrace.o(6424734203904L, 47868);
      return;
      parama.a(com.tencent.mm.sdk.platformtools.d.QK((String)localObject1), 2);
      GMTrace.o(6424734203904L, 47868);
      return;
      parama.a(com.tencent.mm.sdk.platformtools.d.QK((String)localObject1), 2);
      GMTrace.o(6424734203904L, 47868);
      return;
      localObject1 = paramContext.getResources().getString(R.l.dwq);
      paramContext = r.a.a(paramContext, paramj).desc.replaceAll("\n", " ");
      parama.Oq((String)localObject1 + paramContext);
      GMTrace.o(6424734203904L, 47868);
      return;
      paramj = (j)localObject5;
      if (localObject2 != null)
      {
        paramj = (j)localObject5;
        if (!bg.mZ(((tj)localObject2).title)) {
          paramj = ((tj)localObject2).title;
        }
      }
      localObject1 = paramj;
      if (bg.mZ(paramj)) {
        localObject1 = localsp1.title;
      }
      parama.Oq(paramContext.getResources().getString(R.l.dwg) + (String)localObject1);
      GMTrace.o(6424734203904L, 47868);
      return;
      paramj = null;
    }
  }
  
  public static String[] a(j paramj, ae paramae)
  {
    Object localObject2 = null;
    GMTrace.i(6424599986176L, 47867);
    if (paramj == null)
    {
      w.w("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
      GMTrace.o(6424599986176L, 47867);
      return null;
    }
    final sp localsp = x.n(paramj);
    String[] arrayOfString = new String[2];
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6428223864832L, 47894);
        x.b(this.lXu, localsp, true);
        GMTrace.o(6428223864832L, 47894);
      }
    };
    Object localObject1;
    switch (paramj.field_type)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    case 16: 
    case 17: 
    default: 
      if (localsp != null)
      {
        arrayOfString[0] = x.h(localsp);
        arrayOfString[1] = localsp.fwl;
        paramae.post(local1);
      }
    case 5: 
    case 10: 
    case 15: 
    case 11: 
      for (;;)
      {
        w.d("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath thumbPath %s, thumbUrl %s, type %d", new Object[] { arrayOfString[0], arrayOfString[1], Integer.valueOf(paramj.field_type) });
        GMTrace.o(6424599986176L, 47867);
        return arrayOfString;
        localObject1 = paramj.field_favProto.tPN;
        if (localsp == null)
        {
          if (localObject1 != null) {
            arrayOfString[1] = ((tj)localObject1).thumbUrl;
          }
        }
        else
        {
          if (localObject1 == null) {}
          for (localObject1 = null;; localObject1 = ((tj)localObject1).thumbUrl)
          {
            localObject2 = localObject1;
            if (bg.mZ((String)localObject1)) {
              localObject2 = localsp.fwl;
            }
            arrayOfString[0] = x.h(localsp);
            arrayOfString[1] = localObject2;
            paramae.post(local1);
            break;
          }
          paramae = paramj.field_favProto.tPP;
          if (paramae != null)
          {
            arrayOfString[1] = paramae.thumbUrl;
            continue;
            paramae = paramj.field_favProto.tPR;
            if (paramae != null)
            {
              arrayOfString[1] = paramae.thumbUrl;
              continue;
              paramae = paramj.field_favProto.tPP;
              if (paramae != null) {
                arrayOfString[1] = paramae.thumbUrl;
              }
            }
          }
        }
      }
    }
    if (paramj.field_favProto.tQC != null)
    {
      Iterator localIterator = paramj.field_favProto.tQC.iterator();
      label382:
      localObject1 = localObject2;
      if (localIterator.hasNext())
      {
        localObject1 = (sp)localIterator.next();
        if (((sp)localObject1).aHe != 2) {
          break label442;
        }
        localObject1 = x.g((sp)localObject1);
        paramae.post(local1);
      }
    }
    for (;;)
    {
      arrayOfString[0] = localObject1;
      arrayOfString[1] = localsp.fwl;
      break;
      label442:
      if (((sp)localObject1).aHe != 15) {
        break label382;
      }
      localObject1 = x.h((sp)localObject1);
      paramae.post(local1);
    }
  }
  
  public static void b(Context paramContext, j paramj)
  {
    GMTrace.i(6423257808896L, 47857);
    if (paramContext == null)
    {
      w.w("MicroMsg.FavItemLogic", "Context is null");
      GMTrace.o(6423257808896L, 47857);
      return;
    }
    if (paramj == null)
    {
      w.w("MicroMsg.FavItemLogic", "Fav item is null");
      GMTrace.o(6423257808896L, 47857);
      return;
    }
    w.i("MicroMsg.FavItemLogic", "Handler favItemInfo id %d, type %d", new Object[] { Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_type) });
    switch (paramj.field_type)
    {
    case -1: 
    case 0: 
    case 9: 
    case 13: 
    default: 
      w.w("MicroMsg.FavItemLogic", "Do not match any type %d", new Object[] { Integer.valueOf(paramj.field_type) });
    case 1: 
    case 2: 
    case 3: 
    case 16: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 12: 
    case 15: 
    case 11: 
    case 14: 
    case 17: 
      do
      {
        GMTrace.o(6423257808896L, 47857);
        return;
        localObject1 = new Intent(paramContext, FavoriteTextDetailUI.class);
        ((Intent)localObject1).putExtra("key_detail_text", paramj.field_favProto.desc);
        ((Intent)localObject1).putExtra("key_detail_info_id", paramj.field_localId);
        ((Intent)localObject1).putExtra("key_detail_can_share_to_friend", paramj.awJ());
        ((Intent)localObject1).putExtra("key_detail_time", paramj.field_updateTime);
        if (paramj.field_sourceCreateTime <= 0L) {}
        for (long l = paramj.field_updateTime;; l = paramj.field_sourceCreateTime)
        {
          ((Intent)localObject1).putExtra("key_detail_create_time", l);
          paramContext.startActivity((Intent)localObject1);
          GMTrace.o(6423257808896L, 47857);
          return;
        }
        e(paramContext, paramj);
        GMTrace.o(6423257808896L, 47857);
        return;
        localObject1 = new Intent(paramContext, FavoriteVoiceDetailUI.class);
        ((Intent)localObject1).putExtra("key_detail_info_id", paramj.field_localId);
        ((Intent)localObject1).putExtra("key_detail_create_time", paramj.field_favProto.tQA.hUw);
        paramContext.startActivity((Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        localObject1 = x.n(paramj);
        if ((localObject1 != null) && (((sp)localObject1).tPx != null) && ((!bg.mZ(((sp)localObject1).tPx.hdc)) || (!bg.mZ(((sp)localObject1).tPx.hdg))))
        {
          w.i("MicroMsg.FavItemLogic", "it is ad sight.");
          c(paramContext, paramj);
          GMTrace.o(6423257808896L, 47857);
          return;
        }
        d(paramContext, paramj);
        GMTrace.o(6423257808896L, 47857);
        return;
        d(paramContext, paramj);
        GMTrace.o(6423257808896L, 47857);
        return;
        d(paramContext, paramj, true);
        GMTrace.o(6423257808896L, 47857);
        return;
        Object localObject2 = paramj.field_favProto.tPL;
        String str = paramj.field_favProto.iDL;
        localObject1 = paramj.field_favProto.tQA;
        if ((localObject1 != null) && (!bg.mZ(((ta)localObject1).tQf))) {}
        for (localObject1 = n.fc(((ta)localObject1).tQf);; localObject1 = n.fc(paramj.field_fromUser))
        {
          ArrayList localArrayList = new ArrayList();
          if (paramj.field_tagProto.tQM != null) {
            localArrayList.addAll(paramj.field_tagProto.tQM);
          }
          com.tencent.mm.plugin.favorite.c.a(paramj.field_localId, (sw)localObject2, (String)localObject1, str, localArrayList, paramContext);
          GMTrace.o(6423257808896L, 47857);
          return;
        }
        localObject1 = paramj.field_favProto.tQA;
        localObject2 = x.n(paramj);
        paramj = new File(x.h((sp)localObject2));
        if (!paramj.exists()) {
          if (((sp)localObject2).fwl == null) {
            paramj = "";
          }
        }
        for (;;)
        {
          com.tencent.mm.as.b.b(((com.tencent.mm.as.a.a)h.h(com.tencent.mm.as.a.a.class)).a(6, null, ((sp)localObject2).title, ((sp)localObject2).desc, ((sp)localObject2).tOE, ((sp)localObject2).tOI, ((sp)localObject2).tOG, ((sp)localObject2).lUP, x.axc(), paramj, "", ((ta)localObject1).appId));
          paramj = new Intent();
          paramj.putExtra("key_scene", 2);
          com.tencent.mm.bi.d.b(paramContext, "music", ".ui.MusicMainUI", paramj);
          GMTrace.o(6423257808896L, 47857);
          return;
          paramj = new File(x.axa() + g.n(((sp)localObject2).fwl.getBytes()));
          if (paramj.exists()) {}
          for (paramj = paramj.getAbsolutePath();; paramj = "") {
            break;
          }
          paramj = paramj.getAbsolutePath();
        }
        c(paramContext, paramj, true);
        GMTrace.o(6423257808896L, 47857);
        return;
        w.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
        l = paramj.field_localId;
        paramj = paramj.field_favProto.tPP.info;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_is_favorite_item", true);
        ((Intent)localObject1).putExtra("key_favorite_local_id", l);
        ((Intent)localObject1).putExtra("key_Product_xml", paramj);
        ((Intent)localObject1).putExtra("key_can_delete_favorite_item", true);
        ((Intent)localObject1).putExtra("key_ProductUI_getProductInfoScene", 3);
        com.tencent.mm.bi.d.b(paramContext, "scanner", ".ui.ProductUI", (Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        w.d("MicroMsg.FavItemLogic", "start tv ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
        l = paramj.field_localId;
        paramj = paramj.field_favProto.tPR.info;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_TV_getProductInfoScene", 3);
        ((Intent)localObject1).putExtra("key_is_favorite_item", true);
        ((Intent)localObject1).putExtra("key_favorite_local_id", l);
        ((Intent)localObject1).putExtra("key_TV_xml", paramj);
        ((Intent)localObject1).putExtra("key_can_delete_favorite_item", true);
        com.tencent.mm.bi.d.b(paramContext, "shake", ".ui.TVInfoUI", (Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        w.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_product_scene", 4);
        ((Intent)localObject1).putExtra("key_product_info", paramj.field_favProto.tPP.info);
        com.tencent.mm.bi.d.b(paramContext, "product", ".ui.MallProductUI", (Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        a(paramContext, paramj, true);
        GMTrace.o(6423257808896L, 47857);
        return;
        paramj = x.n(paramj).desc;
        ap.AS();
        paramj = com.tencent.mm.x.c.yN().BH(paramj);
      } while (paramj == null);
      Object localObject1 = new Intent();
      ((Intent)localObject1).putExtra("Contact_User", paramj.siD);
      ((Intent)localObject1).putExtra("Contact_Alias", paramj.glq);
      ((Intent)localObject1).putExtra("Contact_Nick", paramj.fvS);
      ((Intent)localObject1).putExtra("Contact_QuanPin", paramj.hwl);
      ((Intent)localObject1).putExtra("Contact_PyInitial", paramj.hwk);
      ((Intent)localObject1).putExtra("Contact_Uin", paramj.oAD);
      ((Intent)localObject1).putExtra("Contact_Mobile_MD5", paramj.vfm);
      ((Intent)localObject1).putExtra("Contact_full_Mobile_MD5", paramj.vfn);
      ((Intent)localObject1).putExtra("Contact_QQNick", paramj.bRk());
      ((Intent)localObject1).putExtra("User_From_Fmessage", false);
      ((Intent)localObject1).putExtra("Contact_Scene", paramj.scene);
      ((Intent)localObject1).putExtra("Contact_FMessageCard", true);
      ((Intent)localObject1).putExtra("Contact_RemarkName", paramj.hwp);
      ((Intent)localObject1).putExtra("Contact_VUser_Info_Flag", paramj.skn);
      ((Intent)localObject1).putExtra("Contact_VUser_Info", paramj.gcb);
      ((Intent)localObject1).putExtra("Contact_BrandIconURL", paramj.oyv);
      ((Intent)localObject1).putExtra("Contact_Province", paramj.getProvince());
      ((Intent)localObject1).putExtra("Contact_City", paramj.getCity());
      ((Intent)localObject1).putExtra("Contact_Sex", paramj.gbM);
      ((Intent)localObject1).putExtra("Contact_Signature", paramj.signature);
      ((Intent)localObject1).putExtra("Contact_ShowUserName", false);
      ((Intent)localObject1).putExtra("Contact_KSnsIFlag", 0);
      com.tencent.mm.bi.d.b(paramContext, "profile", ".ui.ContactInfoUI", (Intent)localObject1);
      com.tencent.mm.bj.a.zd(paramj.scene);
      GMTrace.o(6423257808896L, 47857);
      return;
    case 18: 
      b(paramContext, paramj, true);
      GMTrace.o(6423257808896L, 47857);
      return;
    }
    Toast.makeText(paramContext, R.l.dYj, 0).show();
    GMTrace.o(6423257808896L, 47857);
  }
  
  public static void b(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6423660462080L, 47860);
    w.i("MicroMsg.FavItemLogic", "click WNNoteItem, handleWNNoteItem");
    Object localObject = new kf();
    ((kf)localObject).fHF.type = 3;
    ((kf)localObject).fHF.fHB = 2;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new ke();
    ((ke)localObject).fHu.field_localId = paramj.field_localId;
    ((ke)localObject).fHu.fHw = paramj.field_xml;
    ((ke)localObject).fHu.context = paramContext;
    ((ke)localObject).fHu.type = 2;
    ((ke)localObject).fHu.fHE = paramBoolean;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    GMTrace.o(6423660462080L, 47860);
  }
  
  public static void b(d.a parama, final Context paramContext, final j paramj)
  {
    GMTrace.i(6424868421632L, 47869);
    if ((paramj == null) || (paramContext == null))
    {
      w.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      GMTrace.o(6424868421632L, 47869);
      return;
    }
    final sp localsp = x.n(paramj);
    switch (paramj.field_type)
    {
    }
    for (;;)
    {
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6433995227136L, 47937);
          e.c(this.val$context, paramj, false);
          GMTrace.o(6433995227136L, 47937);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6419499712512L, 47829);
          Intent localIntent = new Intent();
          localIntent.putExtra("Retr_Msg_content", this.lXu.field_favProto.desc);
          com.tencent.mm.bi.d.a(paramContext, ".ui.transmit.RetransmitPreviewUI", localIntent);
          com.tencent.mm.ui.base.b.fk(paramContext);
          GMTrace.o(6419499712512L, 47829);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6426881687552L, 47884);
          Intent localIntent = new Intent();
          localIntent.putExtra("map_view_type", 1);
          localIntent.putExtra("kwebmap_slat", this.lXw.lat);
          localIntent.putExtra("kwebmap_lng", this.lXw.lng);
          localIntent.putExtra("Kwebmap_locaion", this.lXw.label);
          localIntent.putExtra("kShowshare", false);
          com.tencent.mm.bi.d.b(paramContext, "location", ".ui.RedirectUI", localIntent);
          GMTrace.o(6426881687552L, 47884);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6418425970688L, 47821);
          e.d(this.val$context, paramj, false);
          GMTrace.o(6418425970688L, 47821);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6432921485312L, 47929);
          e.a(this.val$context, paramj, false);
          GMTrace.o(6432921485312L, 47929);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6430371348480L, 47910);
          Intent localIntent = new Intent(this.val$context, FavImgGalleryUI.class);
          localIntent.putExtra("key_detail_info_id", paramj.field_localId);
          localIntent.putExtra("key_detail_data_id", localsp.lUP);
          localIntent.putExtra("show_share", false);
          this.val$context.startActivity(localIntent);
          GMTrace.o(6430371348480L, 47910);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6426613252096L, 47882);
          sp localsp = x.n(this.lXu);
          if (localsp == null)
          {
            w.e("MicroMsg.FavItemLogic", "goPlayView, but dataitem is null , exit");
            GMTrace.o(6426613252096L, 47882);
            return;
          }
          if ((localsp.tPx != null) && ((!bg.mZ(localsp.tPx.hdc)) || (!bg.mZ(localsp.tPx.hdg))))
          {
            w.i("MicroMsg.FavItemLogic", "it is ad sight.use sight play");
            localIntent = new Intent(paramContext, FavoriteFileDetailUI.class);
            localIntent.putExtra("key_detail_info_id", this.lXu.field_localId);
            localIntent.putExtra("key_detail_data_id", localsp.lUP);
            localIntent.putExtra("key_detail_can_delete", false);
            paramContext.startActivity(localIntent);
            GMTrace.o(6426613252096L, 47882);
            return;
          }
          Intent localIntent = new Intent(paramContext, FavoriteVideoPlayUI.class);
          localIntent.putExtra("key_detail_fav_path", x.g(localsp));
          localIntent.putExtra("key_detail_fav_thumb_path", x.h(localsp));
          localIntent.putExtra("key_detail_fav_video_duration", localsp.duration);
          localIntent.putExtra("key_detail_statExtStr", localsp.fMi);
          localIntent.putExtra("show_share", false);
          paramContext.startActivity(localIntent);
          GMTrace.o(6426613252096L, 47882);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void ayk()
        {
          GMTrace.i(6422049849344L, 47848);
          e.b(this.val$context, paramj, false);
          GMTrace.o(6422049849344L, 47848);
        }
      });
    }
  }
  
  private static void c(Context paramContext, j paramj)
  {
    GMTrace.i(6424197332992L, 47864);
    v.a(v.a.lOW, paramj);
    Intent localIntent = new Intent(paramContext, FavoriteSightDetailUI.class);
    localIntent.putExtra("key_detail_info_id", paramj.field_localId);
    paramContext.startActivity(localIntent);
    GMTrace.o(6424197332992L, 47864);
  }
  
  public static void c(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6423794679808L, 47861);
    Object localObject = x.n(paramj);
    if (x.d((sp)localObject))
    {
      if (x.e((sp)localObject))
      {
        e(paramContext, paramj);
        GMTrace.o(6423794679808L, 47861);
        return;
      }
      if (!com.tencent.mm.pluginsdk.ui.tools.a.a((Activity)paramContext, x.g((sp)localObject), ((sp)localObject).tOM, 2))
      {
        GMTrace.o(6423794679808L, 47861);
        return;
      }
    }
    localObject = new Intent(paramContext, FavoriteFileDetailUI.class);
    ((Intent)localObject).putExtra("key_detail_info_id", paramj.field_localId);
    ((Intent)localObject).putExtra("show_share", paramBoolean);
    paramContext.startActivity((Intent)localObject);
    GMTrace.o(6423794679808L, 47861);
  }
  
  private static void d(Context paramContext, j paramj)
  {
    GMTrace.i(6424331550720L, 47865);
    Object localObject1 = x.n(paramj);
    Object localObject2 = ((sp)localObject1).tPx;
    if ((localObject2 == null) || (bg.mZ(((ss)localObject2).hdc))) {}
    for (int i = 0; i != 0; i = 1)
    {
      GMTrace.o(6424331550720L, 47865);
      return;
      v.a(v.a.lOY, paramj);
      String str = x.h((sp)localObject1);
      Intent localIntent = new Intent();
      localIntent.putExtra("IsAd", false);
      localIntent.putExtra("KStremVideoUrl", ((ss)localObject2).hdc);
      localIntent.putExtra("StreamWording", ((ss)localObject2).hdf);
      localIntent.putExtra("StremWebUrl", ((ss)localObject2).hdg);
      localIntent.putExtra("KThumUrl", ((ss)localObject2).hdh);
      localIntent.putExtra("KSta_StremVideoAduxInfo", ((ss)localObject2).hdi);
      localIntent.putExtra("KSta_StremVideoPublishId", ((ss)localObject2).hdj);
      localIntent.putExtra("KSta_SourceType", 2);
      localIntent.putExtra("KSta_Scene", v.b.lPi.value);
      localIntent.putExtra("KSta_FromUserName", paramj.field_fromUser);
      localIntent.putExtra("KSta_FavID", paramj.field_id);
      localIntent.putExtra("KSta_SnsStatExtStr", ((sp)localObject1).fMi);
      localIntent.putExtra("KBlockFav", true);
      localIntent.putExtra("KMediaId", "fakeid_" + paramj.field_id);
      localIntent.putExtra("KThumbPath", str);
      localIntent.putExtra("KMediaVideoTime", ((ss)localObject2).tQo);
      localIntent.putExtra("KMediaTitle", ((ss)localObject2).hde);
      com.tencent.mm.bi.d.b(paramContext, "sns", ".ui.VideoAdPlayerUI", localIntent);
    }
    if ((bg.mZ(((sp)localObject1).tOO)) || (((sp)localObject1).tOS <= 0L))
    {
      w.w("MicroMsg.FavItemLogic", "full md5[%s], fullsize[%d], start use url", new Object[] { ((sp)localObject1).tOO, Long.valueOf(((sp)localObject1).tOS) });
      localObject2 = x.n(paramj).tOE;
      localObject1 = localObject2;
      if (bg.mZ((String)localObject2)) {
        localObject1 = x.n(paramj).tOI;
      }
      if (bg.mZ((String)localObject1))
      {
        w.w("MicroMsg.FavItemLogic", "onClick video url null, return");
        c(paramContext, paramj);
        GMTrace.o(6424331550720L, 47865);
        return;
      }
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("is_favorite_item", true);
      ((Intent)localObject2).putExtra("fav_local_id", paramj.field_localId);
      ((Intent)localObject2).putExtra("geta8key_scene", 14);
      w.d("MicroMsg.FavItemLogic", "start video webview, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
      com.tencent.mm.plugin.favorite.c.j((Intent)localObject2, paramContext);
      GMTrace.o(6424331550720L, 47865);
      return;
    }
    localObject1 = new Intent(paramContext, FavoriteSightDetailUI.class);
    ((Intent)localObject1).putExtra("key_detail_info_id", paramj.field_localId);
    paramContext.startActivity((Intent)localObject1);
    GMTrace.o(6424331550720L, 47865);
  }
  
  public static void d(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6424063115264L, 47863);
    if (paramj.field_favProto != null) {
      if ((paramj.field_favProto.tPN != null) && (!bg.mZ(paramj.field_favProto.tPN.canvasPageXml))) {
        localObject1 = paramj.field_favProto.tPN.canvasPageXml;
      }
    }
    while (!bg.mZ((String)localObject1))
    {
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("sns_landing_pages_xml", (String)localObject1);
      ((Intent)localObject2).putExtra("sns_landig_pages_from_source", 7);
      ((Intent)localObject2).putExtra("sns_landing_pages_share_thumb_url", A(paramj));
      ((Intent)localObject2).putExtra("sns_landing_favid", m.zF() + "_" + paramj.field_id);
      ((Intent)localObject2).addFlags(268435456);
      com.tencent.mm.bi.d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", (Intent)localObject2);
      GMTrace.o(6424063115264L, 47863);
      return;
      localObject1 = paramj.field_favProto.tQC;
      if ((localObject1 != null) && (((List)localObject1).size() == 1)) {
        localObject1 = ((sp)((List)localObject1).get(0)).canvasPageXml;
      } else {
        localObject1 = null;
      }
    }
    ta localta = paramj.field_favProto.tQA;
    Object localObject2 = "";
    Object localObject1 = "";
    Object localObject3 = "";
    if (paramj.field_favProto.tPN != null)
    {
      localObject3 = paramj.field_favProto.tPN;
      localObject2 = ((tj)localObject3).tRc;
      localObject1 = ((tj)localObject3).title;
      localObject3 = ((tj)localObject3).desc;
    }
    Object localObject5 = localObject2;
    if (localta != null)
    {
      localObject5 = localObject2;
      if (bg.mZ((String)localObject2)) {
        localObject5 = localta.hNh;
      }
    }
    if (bg.mZ((String)localObject5))
    {
      GMTrace.o(6424063115264L, 47863);
      return;
    }
    sp localsp = x.n(paramj);
    Object localObject4 = localObject1;
    if (localsp != null)
    {
      localObject2 = localObject1;
      if (bg.mZ((String)localObject1)) {
        localObject2 = localsp.title;
      }
      localObject4 = localObject2;
      if (!bg.mZ((String)localObject3)) {}
    }
    for (localObject1 = localsp.desc;; localObject1 = localObject3)
    {
      w.d("MicroMsg.FavItemLogic", "start web view, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
      localObject3 = new Intent();
      ((Intent)localObject3).putExtra("rawUrl", (String)localObject5);
      ((Intent)localObject3).putExtra("showShare", paramBoolean);
      ((Intent)localObject3).putExtra("is_favorite_item", true);
      ((Intent)localObject3).putExtra("fav_local_id", paramj.field_localId);
      localObject4 = new Bundle();
      ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_chat", paramj.awJ());
      ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_sns", paramj.awK());
      if ((paramj.field_favProto.tPW & 0x4) != 0)
      {
        paramBoolean = true;
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_weibo", paramBoolean);
        if ((paramj.field_favProto.tPW & 0x8) == 0) {
          break label924;
        }
        paramBoolean = true;
        label529:
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_cplink", paramBoolean);
        if ((paramj.field_favProto.tPW & 0x10) == 0) {
          break label929;
        }
        paramBoolean = true;
        label553:
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_browser", paramBoolean);
        if ((paramj.field_favProto.tPW & 0x20) == 0) {
          break label934;
        }
        paramBoolean = true;
        label577:
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_weiyun", paramBoolean);
        if ((paramj.field_favProto.tPW & 0x40) == 0) {
          break label939;
        }
      }
      label924:
      label929:
      label934:
      label939:
      for (paramBoolean = true;; paramBoolean = false)
      {
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_facebook", paramBoolean);
        w.i("MicroMsg.FavItemInfo", "get ctrl args=[%s]", new Object[] { ((Bundle)localObject4).toString() });
        ((Intent)localObject3).putExtra("favorite_control_argument", (Bundle)localObject4);
        ((Intent)localObject3).putExtra("sentUsername", paramj.field_fromUser);
        if ((localta != null) && (!bg.mZ(localta.ftu))) {
          ((Intent)localObject3).putExtra("srcDisplayname", n.fc(localta.ftu));
        }
        ((Intent)localObject3).putExtra("mode", 1);
        ((Intent)localObject3).putExtra("geta8key_scene", 14);
        localObject4 = new Bundle();
        ((Bundle)localObject4).putString("key_snsad_statextstr", x.n(paramj).fMi);
        ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject4);
        ((Intent)localObject3).putExtra("from_scence", 4);
        localObject4 = "fav_" + m.zF() + "_" + paramj.field_id;
        ((Intent)localObject3).putExtra("KPublisherId", (String)localObject4);
        ((Intent)localObject3).putExtra("pre_username", paramj.field_fromUser);
        ((Intent)localObject3).putExtra("prePublishId", (String)localObject4);
        ((Intent)localObject3).putExtra("preUsername", paramj.field_fromUser);
        ((Intent)localObject3).putExtra("share_report_pre_msg_url", (String)localObject5);
        ((Intent)localObject3).putExtra("share_report_pre_msg_title", (String)localObject2);
        ((Intent)localObject3).putExtra("share_report_pre_msg_desc", (String)localObject1);
        ((Intent)localObject3).putExtra("share_report_pre_msg_icon_url", A(paramj));
        ((Intent)localObject3).putExtra("share_report_pre_msg_appid", "");
        ((Intent)localObject3).putExtra("share_report_from_scene", 4);
        com.tencent.mm.plugin.favorite.c.j((Intent)localObject3, paramContext);
        GMTrace.o(6424063115264L, 47863);
        return;
        paramBoolean = false;
        break;
        paramBoolean = false;
        break label529;
        paramBoolean = false;
        break label553;
        paramBoolean = false;
        break label577;
      }
      localObject2 = localObject4;
    }
  }
  
  public static void e(Context paramContext, j paramj)
  {
    GMTrace.i(6424465768448L, 47866);
    Intent localIntent = new Intent(paramContext, FavoriteImgDetailUI.class);
    localIntent.putExtra("key_detail_info_id", paramj.field_localId);
    paramContext.startActivity(localIntent);
    GMTrace.o(6424465768448L, 47866);
  }
  
  public static boolean l(sp paramsp)
  {
    GMTrace.i(6423526244352L, 47859);
    aol localaol = com.tencent.mm.as.b.JP();
    if ((localaol != null) && (localaol.ukd == 6) && (bg.ap(paramsp.lUP, "").equals(localaol.tIh)) && (com.tencent.mm.as.b.JN()))
    {
      GMTrace.o(6423526244352L, 47859);
      return true;
    }
    GMTrace.o(6423526244352L, 47859);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */