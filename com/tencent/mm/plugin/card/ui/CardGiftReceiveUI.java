package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.k;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.card.b.a.a;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem;
import com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.plugin.card.model.z;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CardGiftReceiveUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ac.e
{
  private int hcb;
  private String hcc;
  private q ikZ;
  private ScrollView kvE;
  private LinearLayout kvF;
  private ImageView kvG;
  private TextView kvH;
  private TextView kvI;
  private ImageView kvJ;
  private ImageView kvK;
  private LinearLayout kvL;
  private RelativeLayout kvM;
  private RelativeLayout kvN;
  private TextView kvO;
  private ImageView kvP;
  private TextView kvQ;
  private TextView kvR;
  private TextView kvS;
  private ImageView kvT;
  private ImageView kvU;
  private View kvV;
  private TextView kvW;
  private LinearLayout kvX;
  private ListView kvY;
  private RelativeLayout kvZ;
  private CardGiftInfo kvo;
  private ProgressBar kvs;
  private ae kvt;
  private LinearLayout kwa;
  private ImageView kwb;
  private TextView kwc;
  private LinearLayout kwd;
  private TextView kwe;
  private RelativeLayout kwf;
  private RelativeLayout kwg;
  private ImageView kwh;
  private ImageView kwi;
  private TextView kwj;
  private TextView kwk;
  private ListView kwl;
  private RelativeLayout kwm;
  private TextView kwn;
  private TextView kwo;
  private View kwp;
  a.a kwq;
  
  public CardGiftReceiveUI()
  {
    GMTrace.i(5022830034944L, 37423);
    this.ikZ = null;
    this.kvt = new ae(Looper.getMainLooper());
    this.kwq = new a.a()
    {
      public final void aI(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(17262010433536L, 128612);
        if (CardGiftReceiveUI.b(CardGiftReceiveUI.this) == null)
        {
          w.e("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress cardGiftInfo is null return!");
          GMTrace.o(17262010433536L, 128612);
          return;
        }
        if ((!bg.mZ(paramAnonymousString)) && (!bg.mZ(CardGiftReceiveUI.b(CardGiftReceiveUI.this).knL)) && (paramAnonymousString.equals(CardGiftReceiveUI.b(CardGiftReceiveUI.this).knL)))
        {
          w.i("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress fromUserContentVideoUrl return!");
          GMTrace.o(17262010433536L, 128612);
          return;
        }
        CardGiftReceiveUI.g(CardGiftReceiveUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17260802473984L, 128603);
            if (CardGiftReceiveUI.f(CardGiftReceiveUI.this).getVisibility() != 0) {
              CardGiftReceiveUI.f(CardGiftReceiveUI.this).setVisibility(0);
            }
            GMTrace.o(17260802473984L, 128603);
          }
        });
        GMTrace.o(17262010433536L, 128612);
      }
      
      public final void bA(final String paramAnonymousString1, final String paramAnonymousString2)
      {
        GMTrace.i(17262278868992L, 128614);
        w.i("MicroMsg.CardGiftReceiveUI", "CDN  download success! fieldId:" + paramAnonymousString1);
        if (CardGiftReceiveUI.b(CardGiftReceiveUI.this) == null)
        {
          w.e("MicroMsg.CardGiftReceiveUI", "CDN  download cardGiftInfo is null return!");
          GMTrace.o(17262278868992L, 128614);
          return;
        }
        if ((!bg.mZ(paramAnonymousString1)) && (!bg.mZ(CardGiftReceiveUI.b(CardGiftReceiveUI.this).knL)) && (paramAnonymousString1.equals(CardGiftReceiveUI.b(CardGiftReceiveUI.this).knL)))
        {
          w.i("MicroMsg.CardGiftReceiveUI", "CDN  download fromUserContentVideoUrl! return");
          GMTrace.o(17262278868992L, 128614);
          return;
        }
        CardGiftReceiveUI.g(CardGiftReceiveUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17258252337152L, 128584);
            if (CardGiftReceiveUI.f(CardGiftReceiveUI.this).getVisibility() != 8) {
              CardGiftReceiveUI.f(CardGiftReceiveUI.this).setVisibility(8);
            }
            if ((!bg.mZ(paramAnonymousString1)) && (!bg.mZ(CardGiftReceiveUI.b(CardGiftReceiveUI.this).knM)) && (paramAnonymousString1.equals(CardGiftReceiveUI.b(CardGiftReceiveUI.this).knM))) {
              CardGiftReceiveUI.h(CardGiftReceiveUI.this).setVisibility(0);
            }
            Bitmap localBitmap;
            for (;;)
            {
              localBitmap = j.mS(paramAnonymousString2);
              if (localBitmap != null) {
                break;
              }
              CardGiftReceiveUI.i(CardGiftReceiveUI.this).setImageResource(R.k.dnU);
              GMTrace.o(17258252337152L, 128584);
              return;
              CardGiftReceiveUI.h(CardGiftReceiveUI.this).setVisibility(8);
            }
            CardGiftReceiveUI.i(CardGiftReceiveUI.this).setImageBitmap(localBitmap);
            GMTrace.o(17258252337152L, 128584);
          }
        });
        GMTrace.o(17262278868992L, 128614);
      }
      
      public final void fail(String paramAnonymousString)
      {
        GMTrace.i(17262144651264L, 128613);
        w.e("MicroMsg.CardGiftReceiveUI", "CDN download pic failure! fieldId:" + paramAnonymousString);
        GMTrace.o(17262144651264L, 128613);
      }
    };
    GMTrace.o(5022830034944L, 37423);
  }
  
  private void G(LinkedList<CardGiftInfo.AcceptedCardItem> paramLinkedList)
  {
    GMTrace.i(17259460296704L, 128593);
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = (CardGiftInfo.AcceptedCardItem)paramLinkedList.next();
      View localView = View.inflate(this, R.i.cOf, null);
      TextView localTextView1 = (TextView)localView.findViewById(R.h.cCy);
      TextView localTextView2 = (TextView)localView.findViewById(R.h.cCx);
      localTextView1.setText(localAcceptedCardItem.kor);
      localTextView2.setText(localAcceptedCardItem.kos + this.vov.voR.getString(R.l.dFp));
      this.kvX.addView(localView);
    }
    GMTrace.o(17259460296704L, 128593);
  }
  
  private void a(ImageView paramImageView)
  {
    GMTrace.i(17259191861248L, 128591);
    if (!bg.mZ(this.kvo.knI))
    {
      int i = com.tencent.mm.bq.a.fromDPToPix(this, 20);
      Object localObject = new c.a();
      ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
      com.tencent.mm.an.n.Jb();
      ((c.a)localObject).hDk = null;
      ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kvo.knI);
      ((c.a)localObject).hCP = true;
      ((c.a)localObject).hDm = true;
      ((c.a)localObject).hDn = 3.0F;
      ((c.a)localObject).hCN = true;
      ((c.a)localObject).hCW = i;
      ((c.a)localObject).hCV = i;
      ((c.a)localObject).hDf = new ColorDrawable(l.uk("#CCCCCC"));
      localObject = ((c.a)localObject).Jk();
      com.tencent.mm.an.n.Ja().a(this.kvo.knI, paramImageView, (c)localObject);
      GMTrace.o(17259191861248L, 128591);
      return;
    }
    w.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is null");
    GMTrace.o(17259191861248L, 128591);
  }
  
  private void akd()
  {
    GMTrace.i(5023366905856L, 37427);
    if (this.kvo == null)
    {
      w.e("MicroMsg.CardGiftReceiveUI", "doUpdate due to cardGiftInfo is null!");
      GMTrace.o(5023366905856L, 37427);
      return;
    }
    w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descLayoutMode:%d", new Object[] { Integer.valueOf(this.kvo.kob) });
    Object localObject;
    if ((this.kvo.kob != 1) && (this.kvo.kob == 2))
    {
      this.kvL.setVisibility(8);
      this.kvF.setVisibility(0);
      this.kvH.setText(this.kvo.knZ);
      this.kvI.setText(this.kvo.knS + "     " + this.kvo.knT + this.vov.voR.getString(R.l.dFp));
      if (!bg.mZ(this.kvo.koa))
      {
        this.kvG.setVisibility(0);
        localObject = new c.a();
        ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
        com.tencent.mm.an.n.Jb();
        ((c.a)localObject).hDk = null;
        ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kvo.koa);
        ((c.a)localObject).hCP = true;
        ((c.a)localObject).hCN = true;
        localObject = ((c.a)localObject).Jk();
        com.tencent.mm.an.n.Ja().a(this.kvo.koa, this.kvG, (c)localObject);
        if (bg.mZ(this.kvo.kod)) {
          break label796;
        }
        this.kvH.setTextColor(bg.aM(this.kvo.kod, getResources().getColor(R.e.black)));
        label305:
        if (bg.mZ(this.kvo.koe)) {
          break label808;
        }
        this.kvI.setTextColor(bg.aM(this.kvo.koe, getResources().getColor(R.e.black)));
        label345:
        if (bg.mZ(this.kvo.knR)) {
          break label820;
        }
        localObject = new c.a();
        ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
        com.tencent.mm.an.n.Jb();
        ((c.a)localObject).hDk = null;
        ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kvo.knR);
        ((c.a)localObject).hDm = true;
        ((c.a)localObject).hCP = true;
        ((c.a)localObject).hCN = true;
        ((c.a)localObject).hDf = new ColorDrawable(l.uk("#CCCCCC"));
        localObject = ((c.a)localObject).Jk();
        com.tencent.mm.an.n.Ja().a(this.kvo.knR, this.kvK, (c)localObject);
        label451:
        if (bg.mZ(this.kvo.knQ)) {
          break label832;
        }
        localObject = new c.a();
        ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
        com.tencent.mm.an.n.Jb();
        ((c.a)localObject).hDk = null;
        ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kvo.knQ);
        ((c.a)localObject).hCP = true;
        ((c.a)localObject).hCN = true;
        ((c.a)localObject).hDf = new ColorDrawable(l.uk("#CCCCCC"));
        ((c.a)localObject).hDm = true;
        ((c.a)localObject).hDn = com.tencent.mm.bq.a.fromDPToPix(this, 8);
        localObject = ((c.a)localObject).Jk();
        com.tencent.mm.an.n.Ja().a(this.kvo.knQ, this.kvJ, (c)localObject);
        label568:
        if (this.kvo.koo != 1) {
          break label1566;
        }
        this.kwa.setVisibility(0);
        this.kwd.setVisibility(8);
        this.kvZ.setVisibility(8);
        this.kwc.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.kvo.fKT, this.kwc.getTextSize()));
        a(this.kwb);
        label638:
        ako();
        if (this.kvo.kom.size() <= 0) {
          break label1866;
        }
        this.kwm.setVisibility(0);
        this.kwl.setVisibility(0);
        localObject = new a();
        this.kwl.setAdapter((ListAdapter)localObject);
        b(this.kwl);
        if (!bg.mZ(this.kvo.kon))
        {
          this.kwk.setVisibility(0);
          this.kwk.setText(this.kvo.kon);
        }
      }
    }
    for (;;)
    {
      if ((bg.mZ(this.kvo.koh)) && (bg.mZ(this.kvo.knU))) {
        break label1928;
      }
      this.kvE.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          GMTrace.i(4970619338752L, 37034);
          int i = com.tencent.mm.bq.a.fromDPToPix(CardGiftReceiveUI.this.vov.voR, 67);
          int j = CardGiftReceiveUI.a(CardGiftReceiveUI.this).getChildAt(0).getHeight() + i;
          int k = CardGiftReceiveUI.this.getWindow().findViewById(16908290).getHeight();
          w.i("MicroMsg.CardGiftReceiveUI", "bottomHeight: %d  totalViewHeight:%d  screenHeight:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
          CardGiftReceiveUI.a(CardGiftReceiveUI.this).setFillViewport(true);
          if (j > k) {
            CardGiftReceiveUI.a(CardGiftReceiveUI.this, true);
          }
          for (;;)
          {
            CardGiftReceiveUI.a(CardGiftReceiveUI.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GMTrace.o(4970619338752L, 37034);
            return;
            CardGiftReceiveUI.a(CardGiftReceiveUI.this, false);
          }
        }
      });
      GMTrace.o(5023366905856L, 37427);
      return;
      this.kvG.setVisibility(8);
      break;
      label796:
      w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
      break label305;
      label808:
      w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
      break label345;
      label820:
      w.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
      break label451;
      label832:
      w.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
      break label568;
      this.kvF.setVisibility(8);
      this.kvL.setVisibility(0);
      this.kvQ.setText(this.kvo.knS);
      if (this.kvo.koo == 1)
      {
        this.kvT.setAlpha(0.5F);
        this.kvR.setVisibility(8);
        this.kvS.setVisibility(8);
        this.kvN.setVisibility(8);
        this.kvM.setVisibility(8);
        label932:
        if (bg.mZ(this.kvo.koa)) {
          break label1476;
        }
        this.kvP.setVisibility(0);
        localObject = new c.a();
        ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
        com.tencent.mm.an.n.Jb();
        ((c.a)localObject).hDk = null;
        ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kvo.koa);
        ((c.a)localObject).hCP = true;
        ((c.a)localObject).hCN = true;
        localObject = ((c.a)localObject).Jk();
        com.tencent.mm.an.n.Ja().a(this.kvo.koa, this.kvP, (c)localObject);
        label1024:
        if (bg.mZ(this.kvo.knZ)) {
          break label1509;
        }
        this.kvO.setVisibility(0);
        this.kvO.setText(this.kvo.knZ);
        if (bg.mZ(this.kvo.kod)) {
          break label1497;
        }
        this.kvO.setTextColor(bg.aM(this.kvo.kod, getResources().getColor(R.e.black)));
        label1099:
        if (bg.mZ(this.kvo.koe)) {
          break label1530;
        }
        this.kvQ.setTextColor(bg.aM(this.kvo.koe, getResources().getColor(R.e.black)));
        label1139:
        if (bg.mZ(this.kvo.knR)) {
          break label1542;
        }
        localObject = new c.a();
        ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
        com.tencent.mm.an.n.Jb();
        ((c.a)localObject).hDk = null;
        ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kvo.knR);
        ((c.a)localObject).hDm = true;
        ((c.a)localObject).hCP = true;
        ((c.a)localObject).hCN = true;
        ((c.a)localObject).hDf = new ColorDrawable(l.uk("#CCCCCC"));
        localObject = ((c.a)localObject).Jk();
        com.tencent.mm.an.n.Ja().a(this.kvo.knR, this.kvU, (c)localObject);
      }
      for (;;)
      {
        if (bg.mZ(this.kvo.knQ)) {
          break label1554;
        }
        localObject = new c.a();
        ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
        com.tencent.mm.an.n.Jb();
        ((c.a)localObject).hDk = null;
        ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(this.kvo.knQ);
        ((c.a)localObject).hCP = true;
        ((c.a)localObject).hCN = true;
        ((c.a)localObject).hDf = new ColorDrawable(l.uk("#CCCCCC"));
        ((c.a)localObject).hDm = true;
        ((c.a)localObject).hDn = com.tencent.mm.bq.a.fromDPToPix(this, 8);
        localObject = ((c.a)localObject).Jk();
        com.tencent.mm.an.n.Ja().a(this.kvo.knQ, this.kvT, (c)localObject);
        break;
        this.kvR.setVisibility(0);
        this.kvS.setVisibility(0);
        this.kvN.setVisibility(0);
        this.kvM.setVisibility(0);
        this.kvR.setText(this.kvo.knT);
        this.kvS.setText(R.l.dFp);
        if (!bg.mZ(this.kvo.kof))
        {
          this.kvR.setTextColor(bg.aM(this.kvo.kof, getResources().getColor(R.e.black)));
          break label932;
        }
        w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardPriceTitleColor is empty");
        break label932;
        label1476:
        this.kvP.setVisibility(8);
        w.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        break label1024;
        label1497:
        w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
        break label1099;
        label1509:
        this.kvO.setVisibility(8);
        w.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        break label1099;
        label1530:
        w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
        break label1139;
        label1542:
        w.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
      }
      label1554:
      w.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
      break label568;
      label1566:
      this.kwa.setVisibility(8);
      this.kwd.setVisibility(0);
      this.kvZ.setVisibility(0);
      a(this.kwi);
      this.kwj.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.kvo.fKT, this.kwj.getTextSize()));
      if (((!bg.mZ(this.kvo.knK)) && (!"undefined".equals(this.kvo.knK))) || ((!bg.mZ(this.kvo.knL)) && (!"undefined".equals(this.kvo.knL))))
      {
        this.kwf.setVisibility(0);
        label1690:
        if ((this.kvo == null) || (bg.mZ(this.kvo.knK))) {
          break label1842;
        }
        com.tencent.mm.plugin.card.b.a.f(this.kvo.knK, this.kvo.knN, this.kvo.knW, 2);
        label1735:
        if ((this.kvo == null) || (bg.mZ(this.kvo.knM))) {
          break label1854;
        }
        com.tencent.mm.plugin.card.b.a.f(this.kvo.knM, this.kvo.knP, this.kvo.knY, 2);
      }
      for (;;)
      {
        if (bg.mZ(this.kvo.knJ)) {
          break label1864;
        }
        this.kwe.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.kvo.knJ, this.kwe.getTextSize()));
        break;
        this.kwf.setVisibility(8);
        w.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is empty");
        break label1690;
        label1842:
        w.e("MicroMsg.CardGiftReceiveUI", "fromUserContentPicUrl is null");
        break label1735;
        label1854:
        w.e("MicroMsg.CardGiftReceiveUI", "fromUserContentThumbPicUrl is null");
      }
      label1864:
      break label638;
      label1866:
      this.kwm.setVisibility(0);
      this.kwl.setVisibility(0);
      this.kwk.setVisibility(0);
      if (!bg.mZ(this.kvo.kon))
      {
        this.kwk.setVisibility(0);
        this.kwk.setText(this.kvo.kon);
      }
    }
    label1928:
    this.kvE.setFillViewport(true);
    GMTrace.o(5023366905856L, 37427);
  }
  
  private void ako()
  {
    int i = 0;
    GMTrace.i(17259326078976L, 128592);
    if (this.kvo.kol.size() > 0)
    {
      this.kvV.setVisibility(0);
      this.kvY.setVisibility(8);
      if (this.kvo.kol.size() <= 2)
      {
        this.kvW.setVisibility(8);
        G(this.kvo.kol);
        GMTrace.o(17259326078976L, 128592);
        return;
      }
      Object localObject = new LinkedList();
      ((LinkedList)localObject).add(this.kvo.kol.get(0));
      ((LinkedList)localObject).add(this.kvo.kol.get(1));
      G((LinkedList)localObject);
      this.kvW.setVisibility(0);
      this.kvW.setOnClickListener(this);
      localObject = new LinkedList();
      while (i < this.kvo.kol.size())
      {
        if ((i != 0) && (i != 1)) {
          ((LinkedList)localObject).add(this.kvo.kol.get(i));
        }
        i += 1;
      }
      localObject = new c((LinkedList)localObject);
      this.kvY.setAdapter((ListAdapter)localObject);
      b(this.kvY);
      GMTrace.o(17259326078976L, 128592);
      return;
    }
    this.kvV.setVisibility(8);
    this.kvW.setVisibility(8);
    this.kvY.setVisibility(8);
    GMTrace.o(17259326078976L, 128592);
  }
  
  private static void b(ListView paramListView)
  {
    GMTrace.i(17259594514432L, 128594);
    ListAdapter localListAdapter = paramListView.getAdapter();
    if (localListAdapter == null)
    {
      GMTrace.o(17259594514432L, 128594);
      return;
    }
    int k = localListAdapter.getCount();
    int i = 0;
    int j = 0;
    while (i < k)
    {
      localObject = localListAdapter.getView(i, null, paramListView);
      ((View)localObject).measure(0, 0);
      j += ((View)localObject).getMeasuredHeight();
      i += 1;
    }
    Object localObject = paramListView.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject).height = (paramListView.getDividerHeight() * (localListAdapter.getCount() - 1) + j);
    paramListView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    GMTrace.o(17259594514432L, 128594);
  }
  
  private int y(int paramInt)
  {
    GMTrace.i(17259057643520L, 128590);
    paramInt = com.tencent.mm.bq.a.fromDPToPix(this.vov.voR, paramInt);
    GMTrace.o(17259057643520L, 128590);
    return paramInt;
  }
  
  protected final void MH()
  {
    GMTrace.i(5023501123584L, 37428);
    this.kvE = ((ScrollView)findViewById(R.h.bpU));
    this.kvF = ((LinearLayout)findViewById(R.h.brs));
    this.kvG = ((ImageView)findViewById(R.h.bSt));
    this.kvH = ((TextView)findViewById(R.h.cCQ));
    this.kvI = ((TextView)findViewById(R.h.cCP));
    this.kvJ = ((ImageView)findViewById(R.h.bSr));
    this.kvK = ((ImageView)findViewById(R.h.bSs));
    this.kvJ.setOnClickListener(this);
    this.kvL = ((LinearLayout)findViewById(R.h.brr));
    this.kvM = ((RelativeLayout)findViewById(R.h.blm));
    this.kvN = ((RelativeLayout)findViewById(R.h.blo));
    this.kvO = ((TextView)findViewById(R.h.cCB));
    this.kvQ = ((TextView)findViewById(R.h.cCO));
    this.kvP = ((ImageView)findViewById(R.h.bSq));
    this.kvR = ((TextView)findViewById(R.h.cCS));
    this.kvS = ((TextView)findViewById(R.h.cCT));
    this.kvT = ((ImageView)findViewById(R.h.bSl));
    this.kvU = ((ImageView)findViewById(R.h.bSm));
    this.kvT.setOnClickListener(this);
    this.kvV = findViewById(R.h.bqp);
    this.kvW = ((TextView)findViewById(R.h.cCR));
    this.kvX = ((LinearLayout)findViewById(R.h.bqo));
    this.kvY = ((ListView)findViewById(R.h.bqq));
    this.kvZ = ((RelativeLayout)findViewById(R.h.bpJ));
    this.kwa = ((LinearLayout)findViewById(R.h.bNR));
    this.kwb = ((ImageView)findViewById(R.h.bSo));
    this.kwc = ((TextView)findViewById(R.h.cCH));
    this.kwd = ((LinearLayout)findViewById(R.h.bNQ));
    this.kwi = ((ImageView)findViewById(R.h.bSn));
    this.kwj = ((TextView)findViewById(R.h.cCG));
    this.kwe = ((TextView)findViewById(R.h.cCF));
    this.kwf = ((RelativeLayout)findViewById(R.h.bqg));
    this.kwg = ((RelativeLayout)findViewById(R.h.bPQ));
    this.kwh = ((ImageView)findViewById(R.h.cCI));
    this.kwf.setOnClickListener(this);
    this.kwg.setOnClickListener(this);
    this.kwk = ((TextView)findViewById(R.h.cCt));
    this.kwl = ((ListView)findViewById(R.h.bgf));
    this.kwm = ((RelativeLayout)findViewById(R.h.bpI));
    this.kvs = ((ProgressBar)findViewById(R.h.bPA));
    com.tencent.mm.plugin.card.b.m.b(this, false);
    rV("");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5022695817216L, 37422);
        CardGiftReceiveUI.this.finish();
        GMTrace.o(5022695817216L, 37422);
        return true;
      }
    });
    GMTrace.o(5023501123584L, 37428);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5023635341312L, 37429);
    if ((this.ikZ != null) && (this.ikZ.isShowing())) {
      this.ikZ.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof z))
      {
        w.i("MicroMsg.CardGiftReceiveUI", "card gift info cgi success!");
        this.kvo = ((z)paramk).kpt;
        akd();
        GMTrace.o(5023635341312L, 37429);
        return;
      }
      if ((paramk instanceof t))
      {
        paramString = new Intent(this, CardDetailUI.class);
        Object localObject = ((t)paramk).kpx;
        if ((localObject == null) || (((LinkedList)localObject).size() == 0))
        {
          w.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardinfo list  size is null or empty!");
          GMTrace.o(5023635341312L, 37429);
          return;
        }
        paramk = (com.tencent.mm.plugin.card.base.b)((LinkedList)localObject).get(0);
        if ((paramk == null) || (!(paramk instanceof CardInfo)))
        {
          w.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardInfo  is null!");
          GMTrace.o(5023635341312L, 37429);
          return;
        }
        ArrayList localArrayList = new ArrayList();
        localObject = ((LinkedList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localArrayList.add((CardInfo)((Iterator)localObject).next());
        }
        paramString.putExtra("key_card_info", (CardInfo)paramk);
        paramString.putExtra("key_previous_scene", 27);
        paramString.putExtra("key_from_scene", 27);
        paramString.putExtra("key_from_appbrand_type", paramString.getIntExtra("key_from_appbrand_type", 0));
        paramString.putExtra("key_card_git_info", this.kvo);
        startActivity(paramString);
        GMTrace.o(5023635341312L, 37429);
      }
    }
    else
    {
      if ((paramk instanceof z))
      {
        w.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        d.a(this, paramString, true);
        GMTrace.o(5023635341312L, 37429);
        return;
      }
      if ((paramk instanceof t))
      {
        w.e("MicroMsg.CardGiftReceiveUI", ", NetSceneBatchGetCardItemByTpInfo onSceneEnd fail return!  errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        GMTrace.o(5023635341312L, 37429);
        return;
      }
    }
    GMTrace.o(5023635341312L, 37429);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5022964252672L, 37424);
    int i = R.i.cOj;
    GMTrace.o(5022964252672L, 37424);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(5023769559040L, 37430);
    if (paramView.getId() == R.h.bPQ)
    {
      if (!bg.mZ(this.kvo.knL))
      {
        paramView = new Intent(this, CardGiftVideoUI.class);
        paramView.putExtra("key_gift_into", this.kvo);
        paramView.putExtra("key_is_mute", false);
        startActivity(paramView);
        overridePendingTransition(0, 0);
        g.paX.i(13866, new Object[] { Integer.valueOf(3), this.hcc, o.getString(this.hcb) });
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else if (paramView.getId() == R.h.bqg)
    {
      if (this.kvs.getVisibility() == 0)
      {
        GMTrace.o(5023769559040L, 37430);
        return;
      }
      if (!bg.mZ(this.kvo.knK))
      {
        paramView = new Intent(this, CardGiftImageUI.class);
        paramView.putExtra("key_gift_into", this.kvo);
        startActivity(paramView);
        overridePendingTransition(0, 0);
        g.paX.i(13866, new Object[] { Integer.valueOf(4), this.hcc, o.getString(this.hcb) });
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else if (paramView.getId() == R.h.cCD)
    {
      if ((this.kvo != null) && (this.kvo.knV))
      {
        g.paX.i(13866, new Object[] { Integer.valueOf(7), this.hcc, o.getString(this.hcb) });
        paramView = new Intent(this, CardHomePageUI.class);
        paramView.putExtra("key_home_page_from_scene", 2);
        startActivity(paramView);
        finish();
        overridePendingTransition(0, 0);
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else if (paramView.getId() == R.h.cCE)
    {
      if ((!TextUtils.isEmpty(this.kvo.kop)) && (!TextUtils.isEmpty(this.kvo.koq)))
      {
        int i = getIntent().getIntExtra("key_from_appbrand_type", 0);
        com.tencent.mm.plugin.card.b.b.c(this.kvo.kog, this.kvo.kop, this.kvo.koq, 1062, i);
        g.paX.i(13866, new Object[] { Integer.valueOf(8), this.hcc, o.getString(this.hcb) });
        GMTrace.o(5023769559040L, 37430);
        return;
      }
      if (!bg.mZ(this.kvo.koi))
      {
        com.tencent.mm.plugin.card.b.b.a(this, this.kvo.koi, 0);
        g.paX.i(13866, new Object[] { Integer.valueOf(8), this.hcc, o.getString(this.hcb) });
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else
    {
      if ((paramView.getId() == R.h.bSl) || (paramView.getId() == R.h.bSr))
      {
        if ((!bg.mZ(this.kvo.koj)) && (!bg.mZ(this.kvo.kok)))
        {
          paramView = new LinkedList();
          Object localObject = new jo();
          ((jo)localObject).knp = this.kvo.koj;
          ((jo)localObject).code = this.kvo.kok;
          paramView.add(localObject);
          localObject = getIntent().getStringExtra("key_template_id");
          bfe localbfe = new bfe();
          localbfe.uxn = ((String)localObject);
          w.i("MicroMsg.CardGiftReceiveUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { localObject });
          paramView = new t(paramView, localbfe, 27);
          ap.wT().a(paramView, 0);
          g.paX.i(13866, new Object[] { Integer.valueOf(9), this.hcc, o.getString(this.hcb) });
          GMTrace.o(5023769559040L, 37430);
          return;
        }
        w.e("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.userCardId is null");
        GMTrace.o(5023769559040L, 37430);
        return;
      }
      if (paramView.getId() == R.h.cCR)
      {
        if (this.kvY.getVisibility() == 0)
        {
          this.kvY.setVisibility(8);
          this.kvW.setText("查看全部");
          GMTrace.o(5023769559040L, 37430);
          return;
        }
        this.kvY.setVisibility(0);
        this.kvW.setText("收起");
      }
    }
    GMTrace.o(5023769559040L, 37430);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5023098470400L, 37425);
    super.onCreate(paramBundle);
    this.hcc = getIntent().getStringExtra("key_order_id");
    this.hcb = getIntent().getIntExtra("key_biz_uin", -1);
    this.kvo = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    w.i("MicroMsg.CardGiftReceiveUI", "onCreate, orderId:%s, bizUin:%s", new Object[] { this.hcc, Integer.valueOf(this.hcb) });
    MH();
    ap.wT().a(1165, this);
    ap.wT().a(699, this);
    com.tencent.mm.plugin.card.b.a.a(this.kwq);
    if (this.kvo == null)
    {
      w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo is null, sync GiftCard from serve");
      if (this.hcb == -1)
      {
        w.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, bizUin is -1, fail!");
        GMTrace.o(5023098470400L, 37425);
        return;
      }
      if (this.hcc == null) {
        w.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, orderId is null, fail");
      }
      w.e("MicroMsg.CardGiftReceiveUI", "doNetSceneGetCardGiftInfo");
      paramBundle = new z(this.hcb, this.hcc);
      ap.wT().a(paramBundle, 0);
      this.ikZ = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.bUo), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(4960955662336L, 36962);
          if ((CardGiftReceiveUI.c(CardGiftReceiveUI.this) != null) && (CardGiftReceiveUI.c(CardGiftReceiveUI.this).isShowing())) {
            CardGiftReceiveUI.c(CardGiftReceiveUI.this).dismiss();
          }
          if ((CardGiftReceiveUI.d(CardGiftReceiveUI.this).getVisibility() == 8) || (CardGiftReceiveUI.e(CardGiftReceiveUI.this).getVisibility() == 4))
          {
            w.i("MicroMsg.CardGiftReceiveUI", "user cancel & finish");
            CardGiftReceiveUI.this.finish();
          }
          GMTrace.o(4960955662336L, 36962);
        }
      });
      if (this.ikZ != null) {
        this.ikZ.show();
      }
      GMTrace.o(5023098470400L, 37425);
      return;
    }
    akd();
    GMTrace.o(5023098470400L, 37425);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5023232688128L, 37426);
    super.onDestroy();
    ap.wT().b(1165, this);
    ap.wT().b(699, this);
    com.tencent.mm.plugin.card.b.a.b(this.kwq);
    GMTrace.o(5023232688128L, 37426);
  }
  
  final class a
    extends BaseAdapter
  {
    a()
    {
      GMTrace.i(17261205127168L, 128606);
      GMTrace.o(17261205127168L, 128606);
    }
    
    public final int getCount()
    {
      GMTrace.i(17261339344896L, 128607);
      int i = CardGiftReceiveUI.b(CardGiftReceiveUI.this).kom.size();
      GMTrace.o(17261339344896L, 128607);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(17261473562624L, 128608);
      long l = paramInt;
      GMTrace.o(17261473562624L, 128608);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(17261607780352L, 128609);
      CardGiftInfo.AccepterItem localAccepterItem = (CardGiftInfo.AccepterItem)CardGiftReceiveUI.b(CardGiftReceiveUI.this).kom.get(paramInt);
      ImageView localImageView;
      String str;
      if (paramView == null)
      {
        paramView = View.inflate(CardGiftReceiveUI.this, R.i.cOg, null);
        paramViewGroup = new CardGiftReceiveUI.b(CardGiftReceiveUI.this);
        paramViewGroup.kwt = ((ImageView)paramView.findViewById(R.h.bPP));
        paramViewGroup.kwu = ((TextView)paramView.findViewById(R.h.cCu));
        paramViewGroup.jaE = ((TextView)paramView.findViewById(R.h.cCw));
        paramViewGroup.kwv = ((TextView)paramView.findViewById(R.h.cCv));
        paramView.setTag(paramViewGroup);
        if (localAccepterItem != null) {
          if (localAccepterItem.kou != null)
          {
            localImageView = paramViewGroup.kwt;
            str = localAccepterItem.kou;
            paramInt = R.g.baR;
            if ((localImageView != null) && (!TextUtils.isEmpty(str))) {
              break label248;
            }
          }
        }
      }
      for (;;)
      {
        paramViewGroup.kwu.setText(localAccepterItem.kot);
        paramViewGroup.jaE.setText(localAccepterItem.kor);
        paramViewGroup.kwv.setText(localAccepterItem.kos + CardGiftReceiveUI.this.vov.voR.getString(R.l.dFp));
        GMTrace.o(17261607780352L, 128609);
        return paramView;
        paramViewGroup = (CardGiftReceiveUI.b)paramView.getTag();
        break;
        label248:
        if (!TextUtils.isEmpty(str))
        {
          Object localObject = new c.a();
          ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
          com.tencent.mm.an.n.Jb();
          ((c.a)localObject).hDk = null;
          ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(str);
          ((c.a)localObject).hCP = true;
          ((c.a)localObject).hDm = true;
          ((c.a)localObject).hDn = 3.0F;
          ((c.a)localObject).hCN = true;
          ((c.a)localObject).hCW = 34;
          ((c.a)localObject).hCV = 34;
          ((c.a)localObject).hDe = paramInt;
          localObject = ((c.a)localObject).Jk();
          com.tencent.mm.an.n.Ja().a(str, localImageView, (c)localObject);
        }
        else
        {
          localImageView.setImageResource(paramInt);
        }
      }
    }
  }
  
  final class b
  {
    public TextView jaE;
    public ImageView kwt;
    public TextView kwu;
    public TextView kwv;
    
    b()
    {
      GMTrace.i(17260534038528L, 128601);
      GMTrace.o(17260534038528L, 128601);
    }
  }
  
  final class c
    extends BaseAdapter
  {
    private LinkedList<CardGiftInfo.AcceptedCardItem> kww;
    
    c()
    {
      GMTrace.i(17257312813056L, 128577);
      LinkedList localLinkedList;
      this.kww = localLinkedList;
      GMTrace.o(17257312813056L, 128577);
    }
    
    private CardGiftInfo.AcceptedCardItem lH(int paramInt)
    {
      GMTrace.i(17257581248512L, 128579);
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = (CardGiftInfo.AcceptedCardItem)this.kww.get(paramInt);
      GMTrace.o(17257581248512L, 128579);
      return localAcceptedCardItem;
    }
    
    public final int getCount()
    {
      GMTrace.i(17257447030784L, 128578);
      int i = this.kww.size();
      GMTrace.o(17257447030784L, 128578);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(17257715466240L, 128580);
      long l = paramInt;
      GMTrace.o(17257715466240L, 128580);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(17257849683968L, 128581);
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = lH(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(CardGiftReceiveUI.this, R.i.cOf, null);
        paramView = new CardGiftReceiveUI.d(CardGiftReceiveUI.this);
        paramView.jaE = ((TextView)localView.findViewById(R.h.cCy));
        paramView.kwv = ((TextView)localView.findViewById(R.h.cCx));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        paramViewGroup.jaE.setText(localAcceptedCardItem.kor);
        paramViewGroup.kwv.setText(localAcceptedCardItem.kos + CardGiftReceiveUI.this.vov.voR.getString(R.l.dFp));
        GMTrace.o(17257849683968L, 128581);
        return localView;
        paramViewGroup = (CardGiftReceiveUI.d)paramView.getTag();
        localView = paramView;
      }
    }
  }
  
  final class d
  {
    public TextView jaE;
    public TextView kwv;
    
    d()
    {
      GMTrace.i(17258386554880L, 128585);
      GMTrace.o(17258386554880L, 128585);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardGiftReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */