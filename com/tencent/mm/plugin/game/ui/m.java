package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.f;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.game.d.b;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.plugin.game.d.e.b;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.e;
import com.tencent.mm.plugin.game.model.q.f;
import com.tencent.mm.plugin.game.model.q.g;
import com.tencent.mm.plugin.game.model.q.h;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.r.a;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.x.ap;
import java.util.LinkedList;
import java.util.Map;

public final class m
  extends com.tencent.mm.ui.o<q>
{
  private static w mNC;
  private int ftv;
  int hIP;
  int kye;
  private int mBs;
  private Context mContext;
  private View.OnClickListener mND;
  private View.OnClickListener mNE;
  private v mNF;
  private v mNG;
  private long mNH;
  private int mNI;
  private r mNJ;
  private f<String, Bitmap> mNK;
  
  public m(Context paramContext, q paramq, int paramInt)
  {
    super(paramContext, paramq);
    GMTrace.i(12705989656576L, 94667);
    this.kye = 15;
    this.hIP = 0;
    this.ftv = 0;
    this.mNH = 0L;
    this.mBs = 0;
    this.mNI = 0;
    this.mContext = paramContext;
    this.mBs = paramInt;
    paramq = SubCoreGameCenter.aFe();
    String str = u.k(new int[] { 2, 5, 6, 10, 11, 100 });
    paramq = paramq.rawQuery("select count(*) from GameRawMessage where " + str + " and showInMsgList = 1" + " and isHidden = 0", new String[0]);
    if (paramq == null) {}
    for (;;)
    {
      this.hIP = i;
      this.ftv = SubCoreGameCenter.aFe().aEB();
      mNC = new w();
      this.mND = new n(paramContext, paramInt);
      this.mNE = new o(paramContext, paramInt);
      this.mNF = new v(paramContext);
      this.mNF.cj(paramInt, 1);
      this.mNG = new v(paramContext);
      this.mNG.cj(paramInt, 2);
      this.mNJ = new r(paramContext, this.mBs);
      paramInt = com.tencent.mm.plugin.game.d.c.getScreenWidth(this.mContext);
      i = this.mContext.getResources().getDimensionPixelSize(R.f.aRK);
      j = this.mContext.getResources().getDimensionPixelSize(R.f.aRd);
      int k = this.mContext.getResources().getDimensionPixelSize(R.f.aRY);
      this.mNI = (a.X(this.mContext, paramInt - j * 2 - i - k) / 34);
      this.mNK = new f(30);
      GMTrace.o(12705989656576L, 94667);
      return;
      i = j;
      if (paramq.moveToFirst()) {
        i = paramq.getInt(0);
      }
      paramq.close();
    }
  }
  
  private static q a(q paramq, Cursor paramCursor)
  {
    GMTrace.i(12707197616128L, 94676);
    q localq = paramq;
    if (paramq == null) {
      localq = new q();
    }
    localq.b(paramCursor);
    GMTrace.o(12707197616128L, 94676);
    return localq;
  }
  
  private void a(q paramq, a parama)
  {
    GMTrace.i(12706258092032L, 94669);
    LinkedList localLinkedList = new LinkedList();
    int i = 1;
    while (i < paramq.mAo.size())
    {
      localLinkedList.add(paramq.mAo.get(i));
      i += 1;
    }
    parama.mNY.a(paramq, localLinkedList, this.mNI, this.mBs, this.mNK);
    GMTrace.o(12706258092032L, 94669);
  }
  
  private void b(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12706392309760L, 94670);
    if (bg.mZ(paramString))
    {
      a.b.a(paramImageView, paramString);
      GMTrace.o(12706392309760L, 94670);
      return;
    }
    if (!this.mNK.aZ(paramString))
    {
      c(paramImageView, paramString);
      GMTrace.o(12706392309760L, 94670);
      return;
    }
    Bitmap localBitmap = (Bitmap)this.mNK.get(paramString);
    if ((localBitmap == null) || (localBitmap.isRecycled()))
    {
      c(paramImageView, paramString);
      GMTrace.o(12706392309760L, 94670);
      return;
    }
    paramImageView.setImageBitmap(localBitmap);
    GMTrace.o(12706392309760L, 94670);
  }
  
  private void c(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12706526527488L, 94671);
    paramImageView = e.aFP().h(paramImageView, paramString);
    if (paramImageView != null) {
      this.mNK.put(paramString, paramImageView);
    }
    GMTrace.o(12706526527488L, 94671);
  }
  
  private void d(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12706660745216L, 94672);
    if (this.mNK.aZ(paramString))
    {
      Bitmap localBitmap = (Bitmap)this.mNK.get(paramString);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        e(paramImageView, paramString);
        GMTrace.o(12706660745216L, 94672);
        return;
      }
      paramImageView.setImageBitmap(localBitmap);
      GMTrace.o(12706660745216L, 94672);
      return;
    }
    e(paramImageView, paramString);
    GMTrace.o(12706660745216L, 94672);
  }
  
  private void e(ImageView paramImageView, final String paramString)
  {
    GMTrace.i(12706794962944L, 94673);
    e.a.a locala = new e.a.a();
    locala.hCN = false;
    e.aFP().a(paramImageView, paramString, locala.aFQ(), new e.b()
    {
      public final void x(Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(12714982244352L, 94734);
        if ((paramAnonymousBitmap != null) && (!paramAnonymousBitmap.isRecycled())) {
          m.a(m.this).put(paramString, paramAnonymousBitmap);
        }
        GMTrace.o(12714982244352L, 94734);
      }
    });
    GMTrace.o(12706794962944L, 94673);
  }
  
  private q oI(int paramInt)
  {
    GMTrace.i(12707868704768L, 94681);
    if (oH(paramInt))
    {
      localq = (q)this.vom;
      GMTrace.o(12707868704768L, 94681);
      return localq;
    }
    if (this.von != null)
    {
      localq = (q)this.von.get(Integer.valueOf(paramInt));
      if (localq != null)
      {
        GMTrace.o(12707868704768L, 94681);
        return localq;
      }
    }
    if ((this.hIP > this.ftv) && (this.ftv > 0) && (paramInt > this.ftv))
    {
      i = 1;
      if (i == 0) {
        break label144;
      }
    }
    label144:
    for (int i = paramInt - 1;; i = paramInt)
    {
      if ((paramInt >= 0) && (getCursor().moveToPosition(i))) {
        break label149;
      }
      GMTrace.o(12707868704768L, 94681);
      return null;
      i = 0;
      break;
    }
    label149:
    if (this.von == null)
    {
      localq = a((q)this.vom, getCursor());
      GMTrace.o(12707868704768L, 94681);
      return localq;
    }
    q localq = a(null, getCursor());
    this.von.put(Integer.valueOf(paramInt), localq);
    GMTrace.o(12707868704768L, 94681);
    return localq;
  }
  
  public final void QA()
  {
    GMTrace.i(12706929180672L, 94674);
    u localu = SubCoreGameCenter.aFe();
    int i = this.kye;
    String str = u.k(new int[] { 2, 5, 6, 10, 11, 100 });
    setCursor(localu.rawQuery("select * from GameRawMessage where " + str + " and showInMsgList = 1" + " and isHidden = 0" + " order by isRead, createTime desc limit " + i, new String[0]));
    this.kye = getCount();
    if (this.voo != null) {
      this.voo.Qx();
    }
    super.notifyDataSetChanged();
    GMTrace.o(12706929180672L, 94674);
  }
  
  protected final void QB()
  {
    GMTrace.i(12707063398400L, 94675);
    aIb();
    QA();
    GMTrace.o(12707063398400L, 94675);
  }
  
  protected final int aFC()
  {
    GMTrace.i(12707734487040L, 94680);
    if ((this.hIP > this.ftv) && (this.ftv > 0))
    {
      GMTrace.o(12707734487040L, 94680);
      return 1;
    }
    GMTrace.o(12707734487040L, 94680);
    return 0;
  }
  
  public final boolean alk()
  {
    GMTrace.i(12707331833856L, 94677);
    if (this.kye >= this.hIP)
    {
      GMTrace.o(12707331833856L, 94677);
      return true;
    }
    GMTrace.o(12707331833856L, 94677);
    return false;
  }
  
  public final int getCount()
  {
    GMTrace.i(12707466051584L, 94678);
    if (this.count < 0) {
      this.count = getCursor().getCount();
    }
    if (this.count <= 0)
    {
      GMTrace.o(12707466051584L, 94678);
      return 0;
    }
    int i = this.count;
    int j = aFC();
    GMTrace.o(12707466051584L, 94678);
    return i + j;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12706123874304L, 94668);
    a locala;
    View localView;
    q localq;
    if (paramView == null)
    {
      locala = new a();
      localView = View.inflate(this.context, R.i.cWN, null);
      locala.mNN = ((ImageView)localView.findViewById(R.h.bOX));
      locala.mNM = ((LinearLayout)localView.findViewById(R.h.cdE));
      locala.mNO = ((LinearLayout)localView.findViewById(R.h.cdH));
      locala.kfQ = ((TextView)localView.findViewById(R.h.cgr));
      locala.mNP = ((ImageView)localView.findViewById(R.h.bjU));
      locala.jjS = ((TextView)localView.findViewById(R.h.cBu));
      locala.mNQ = ((TextView)localView.findViewById(R.h.cdJ));
      locala.mNR = ((LinearLayout)localView.findViewById(R.h.cdL));
      locala.mNS = ((TextView)localView.findViewById(R.h.cdN));
      locala.mNT = ((ImageView)localView.findViewById(R.h.cdM));
      locala.mNU = ((ImageView)localView.findViewById(R.h.cdK));
      locala.mNV = ((TextView)localView.findViewById(R.h.cdP));
      locala.mNW = ((TextView)localView.findViewById(R.h.cdO));
      locala.mNY = ((GameMessageListContainerView)localView.findViewById(R.h.cdR));
      locala.mNX = ((LinearLayout)localView.findViewById(R.h.cdI));
      localView.setTag(locala);
      localq = oI(paramInt);
      if ((localq == null) || (!localq.mBb)) {
        break label348;
      }
      locala.mNM.setVisibility(8);
      locala.mNX.setVisibility(0);
    }
    label321:
    label348:
    while (localq == null)
    {
      GMTrace.o(12706123874304L, 94668);
      return localView;
      locala = (a)paramView.getTag();
      localView = paramView;
      break;
    }
    localq.aEq();
    locala.mNM.setVisibility(0);
    locala.mNX.setVisibility(8);
    locala.mNV.setText(b.f(this.context, localq.field_createTime * 1000L));
    label524:
    label636:
    label714:
    label723:
    label771:
    label865:
    label936:
    label1027:
    label1154:
    label1167:
    label1227:
    Object localObject1;
    Object localObject2;
    if (localq.field_msgType == 100)
    {
      if (localq.mAS != null)
      {
        d(locala.mNN, localq.mAS.mBj);
        locala.mNN.setVisibility(0);
        if (!bg.mZ(localq.mAS.mBi))
        {
          locala.kfQ.setText(localq.mAS.mBi);
          locala.kfQ.setVisibility(0);
          if (bg.mZ(localq.mAS.mBk)) {
            break label1154;
          }
          d(locala.mNP, localq.mAS.mBk);
          locala.mNP.setVisibility(0);
          if (bg.mZ(localq.mAS.mBe)) {
            break label1167;
          }
          locala.kfQ.setEnabled(true);
          locala.mNN.setEnabled(true);
          paramView = new r.a(localq, localq.mAS.mBe, 1);
          paramViewGroup = new r.a(localq, localq.mAS.mBe, 2);
          locala.kfQ.setTag(paramView);
          locala.kfQ.setOnClickListener(this.mNJ);
          locala.mNN.setTag(paramViewGroup);
          locala.mNN.setOnClickListener(this.mNJ);
          if (bg.mZ(localq.mAO)) {
            break label1600;
          }
          paramInt = localq.mAo.size();
          if (paramInt <= 1) {
            break label1584;
          }
          locala.jjS.setText(this.context.getResources().getString(R.l.edM, new Object[] { Integer.valueOf(paramInt) }) + localq.mAO);
          locala.jjS.setVisibility(0);
          if (bg.mZ(localq.mAP)) {
            break label1613;
          }
          locala.mNQ.setText(h.b(this.context, localq.mAP, locala.mNQ.getTextSize()));
          locala.mNQ.setVisibility(0);
          a(localq, locala);
          if (bg.mZ(localq.mAT.mBh)) {
            break label1651;
          }
          locala.mNR.setVisibility(0);
          if (bg.mZ(localq.mAT.mBe)) {
            break label1626;
          }
          paramView = new r.a(localq, localq.mAT.mBe, 3);
          locala.mNR.setTag(paramView);
          locala.mNR.setOnClickListener(this.mNJ);
          locala.mNR.setEnabled(true);
          locala.mNS.setText(h.b(this.context, localq.mAT.mBh, locala.mNS.getTextSize()));
          if (bg.mZ(localq.mAT.mBd)) {
            break label1638;
          }
          d(locala.mNT, localq.mAT.mBd);
          locala.mNT.setVisibility(0);
          if (bg.mZ(localq.mAQ)) {
            break label1676;
          }
          d(locala.mNU, localq.mAQ);
          locala.mNU.setVisibility(0);
          if (bg.mZ(localq.mAR)) {
            break label1664;
          }
          paramView = new r.a(localq, localq.mAR, 3);
          locala.mNU.setTag(paramView);
          locala.mNU.setOnClickListener(this.mNJ);
          locala.mNU.setEnabled(true);
          if (bg.mZ(localq.mAU.mName)) {
            break label1701;
          }
          locala.mNW.setText(localq.mAU.mName);
          locala.mNW.setVisibility(0);
          if (bg.mZ(localq.mAU.mBe)) {
            break label1689;
          }
          paramView = new r.a(localq, localq.mAU.mBe, 5);
          locala.mNW.setTag(paramView);
          locala.mNW.setOnClickListener(this.mNJ);
          locala.mNW.setEnabled(true);
        }
      }
      for (;;)
      {
        GMTrace.o(12706123874304L, 94668);
        return localView;
        locala.kfQ.setVisibility(8);
        break;
        locala.mNP.setVisibility(8);
        break label524;
        locala.kfQ.setEnabled(false);
        locala.mNN.setEnabled(false);
        break label636;
        if (!bg.bX(localq.mAo))
        {
          paramViewGroup = (q.h)localq.mAo.get(0);
          if (!bg.mZ(paramViewGroup.aDw))
          {
            paramView = paramViewGroup.aDw;
            if (bg.mZ(paramViewGroup.mBp)) {
              break label1488;
            }
            locala.kfQ.setEnabled(true);
            locala.mNN.setEnabled(true);
            localObject1 = new r.a(localq, paramViewGroup.mBp, 1);
            localObject2 = new r.a(localq, paramViewGroup.mBp, 2);
            locala.kfQ.setTag(localObject1);
            locala.kfQ.setOnClickListener(this.mNJ);
            locala.mNN.setTag(localObject2);
            locala.mNN.setOnClickListener(this.mNJ);
            label1331:
            if (bg.mZ(paramView)) {
              break label1509;
            }
            locala.kfQ.setText(h.b(this.context, paramView, locala.kfQ.getTextSize()), TextView.BufferType.SPANNABLE);
            locala.kfQ.setVisibility(0);
            label1374:
            locala.mNN.setVisibility(0);
            if (bg.mZ(paramViewGroup.mBm)) {
              break label1522;
            }
            d(locala.mNN, paramViewGroup.mBm);
          }
          for (;;)
          {
            if (bg.mZ(paramViewGroup.mBo)) {
              break label1538;
            }
            d(locala.mNP, paramViewGroup.mBo);
            locala.mNP.setVisibility(0);
            break;
            ap.AS();
            paramView = com.tencent.mm.x.c.yL().SL(paramViewGroup.userName);
            if ((paramView == null) || (bg.mZ(paramView.vq())))
            {
              paramView = paramViewGroup.userName;
              break label1227;
            }
            paramView = paramView.vq();
            break label1227;
            label1488:
            locala.kfQ.setEnabled(false);
            locala.mNN.setEnabled(false);
            break label1331;
            label1509:
            locala.kfQ.setVisibility(8);
            break label1374;
            label1522:
            b(locala.mNN, paramViewGroup.userName);
          }
          label1538:
          locala.mNP.setVisibility(8);
          break label636;
        }
        locala.mNN.setVisibility(8);
        locala.kfQ.setVisibility(8);
        locala.mNP.setVisibility(8);
        break label636;
        label1584:
        locala.jjS.setText(localq.mAO);
        break label714;
        label1600:
        locala.jjS.setVisibility(8);
        break label723;
        label1613:
        locala.mNQ.setVisibility(8);
        break label771;
        label1626:
        locala.mNR.setEnabled(false);
        break label865;
        label1638:
        locala.mNT.setVisibility(8);
        break label936;
        label1651:
        locala.mNR.setVisibility(8);
        break label936;
        label1664:
        locala.mNU.setEnabled(false);
        break label1027;
        label1676:
        locala.mNU.setVisibility(8);
        break label1027;
        label1689:
        locala.mNW.setEnabled(false);
        continue;
        label1701:
        locala.mNW.setVisibility(8);
      }
    }
    locala.jjS.setVisibility(8);
    locala.mNQ.setVisibility(8);
    locala.mNR.setVisibility(8);
    locala.mNT.setVisibility(8);
    locala.mNU.setVisibility(8);
    locala.mNW.setVisibility(8);
    locala.mNW.setEnabled(false);
    locala.mNU.setEnabled(false);
    locala.mNN.setEnabled(false);
    locala.kfQ.setEnabled(false);
    locala.mNY.setVisibility(8);
    locala.mNP.setVisibility(8);
    paramViewGroup = null;
    paramView = null;
    if (!bg.bX(localq.mAo))
    {
      localObject1 = (q.h)localq.mAo.get(0);
      ap.AS();
      localObject2 = com.tencent.mm.x.c.yL().SL(((q.h)localObject1).userName);
      paramViewGroup = paramView;
      if (localObject2 != null) {
        paramViewGroup = ((x)localObject2).vq();
      }
      paramView = paramViewGroup;
      if (bg.mZ(paramViewGroup)) {
        paramView = ((q.h)localObject1).aDw;
      }
      paramViewGroup = paramView;
      if (!bg.mZ(((q.h)localObject1).mBn)) {
        paramInt = 1;
      }
    }
    for (;;)
    {
      int i = localq.mAo.size();
      int j;
      if ((!bg.mZ(localq.mAm)) && ((localq.mAC & 1L) == 0L))
      {
        locala.mNW.setText(localq.mAm);
        locala.mNW.setVisibility(0);
        if ((localq.mAC & 0x2) > 0L)
        {
          j = this.context.getResources().getColor(R.e.aOu);
          locala.mNW.setTextColor(j);
          locala.mNW.setBackgroundResource(R.g.aYZ);
          locala.mNW.setOnClickListener(this.mND);
          locala.mNW.setTag(localq);
          locala.mNW.setEnabled(true);
        }
      }
      else
      {
        label2057:
        if ((localq.field_msgType != 10) && (localq.field_msgType != 11)) {
          break label2329;
        }
        if (bg.mZ(localq.iTg)) {
          break label2273;
        }
        locala.kfQ.setText(h.b(this.context, localq.iTg, locala.kfQ.getTextSize()), TextView.BufferType.SPANNABLE);
        locala.kfQ.setVisibility(0);
      }
      for (;;)
      {
        switch (localq.field_msgType)
        {
        case 3: 
        case 4: 
        case 7: 
        case 8: 
        case 9: 
        default: 
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageAdapter", "error msgtype: " + localq.field_msgType);
          break label321;
          j = this.context.getResources().getColor(R.e.aOs);
          locala.mNW.setTextColor(j);
          locala.mNW.setBackgroundResource(0);
          locala.mNW.setOnClickListener(null);
          locala.mNW.setEnabled(false);
          break label2057;
          label2273:
          if (!bg.mZ(paramView))
          {
            locala.kfQ.setText(h.b(this.context, paramView, locala.kfQ.getTextSize()));
            locala.kfQ.setVisibility(0);
          }
          else
          {
            locala.kfQ.setVisibility(8);
            continue;
            label2329:
            if (!bg.mZ(paramView))
            {
              locala.kfQ.setText(h.b(this.context, paramView, locala.kfQ.getTextSize()));
              locala.kfQ.setVisibility(0);
              if (paramInt != 0)
              {
                locala.kfQ.setOnClickListener(this.mNF);
                locala.kfQ.setTag(localq);
                locala.kfQ.setEnabled(true);
              }
            }
            else
            {
              locala.kfQ.setVisibility(8);
            }
          }
          break;
        }
      }
      if (!bg.mZ(localq.mAi))
      {
        d(locala.mNN, localq.mAi);
        locala.mNN.setVisibility(0);
        label2454:
        if (!bg.mZ(localq.lbT))
        {
          if (bg.mZ(localq.mAu)) {
            break label2605;
          }
          locala.mNQ.setText(localq.lbT);
          locala.mNQ.setVisibility(0);
        }
      }
      while (!bg.mZ(localq.mAu))
      {
        d(locala.mNU, localq.mAu);
        locala.mNU.setTag(Long.valueOf(localq.field_msgId));
        locala.mNU.setOnTouchListener(mNC);
        locala.mNU.setOnClickListener(this.mNE);
        locala.mNU.setVisibility(0);
        locala.mNU.setEnabled(true);
        break;
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageAdapter", "mAppIcon is null");
        locala.mNN.setVisibility(8);
        break label2454;
        label2605:
        locala.mNR.setVisibility(0);
        locala.mNS.setText(localq.lbT);
        locala.mNR.setOnClickListener(this.mNE);
        locala.mNR.setTag(Long.valueOf(localq.field_msgId));
      }
      if (!bg.bX(localq.mAo))
      {
        locala.mNN.setVisibility(0);
        if (!bg.mZ(((q.h)localq.mAo.get(0)).mBm))
        {
          d(locala.mNN, ((q.h)localq.mAo.get(0)).mBm);
          label2723:
          if (!bg.mZ(((q.h)localq.mAo.get(0)).mBn))
          {
            locala.mNN.setOnClickListener(this.mNG);
            locala.mNN.setTag(localq);
            locala.mNN.setEnabled(true);
          }
        }
      }
      for (;;)
      {
        locala.mNR.setVisibility(0);
        locala.mNR.setOnClickListener(this.mNE);
        locala.mNR.setTag(Long.valueOf(localq.field_msgId));
        if (localq.mAW != 1) {
          break label2914;
        }
        locala.mNQ.setVisibility(0);
        locala.mNQ.setText(h.b(this.context, localq.mAG, locala.mNQ.getTextSize()));
        locala.mNS.setText(localq.mAJ);
        break;
        b(locala.mNN, ((q.h)localq.mAo.get(0)).userName);
        break label2723;
        locala.mNN.setVisibility(8);
      }
      label2914:
      if (localq.mAW == 2)
      {
        locala.mNQ.setVisibility(0);
        locala.mNQ.setText(h.b(this.context, localq.mAG, locala.mNQ.getTextSize()));
        locala.mNS.setText(localq.mAH);
        break;
      }
      if (localq.mAW != 3) {
        break;
      }
      locala.jjS.setVisibility(0);
      if (i > 1)
      {
        locala.jjS.setText(this.context.getResources().getString(R.l.edG, new Object[] { String.valueOf(i) }));
        a(localq, locala);
      }
      for (;;)
      {
        locala.mNS.setText(localq.mAJ);
        break;
        locala.jjS.setText(this.context.getResources().getString(R.l.edH));
      }
      d(locala.mNN, localq.mAi);
      paramView = "礼物";
      if (localq.mAz.contains("爱心"))
      {
        paramView = "爱心";
        label3117:
        if (i <= 1) {
          break label3201;
        }
        locala.jjS.setText(this.context.getResources().getString(R.l.edK, new Object[] { String.valueOf(i), paramView }));
      }
      for (;;)
      {
        locala.jjS.setVisibility(0);
        a(localq, locala);
        break;
        if (!localq.mAz.contains("体力")) {
          break label3117;
        }
        paramView = "体力";
        break label3117;
        label3201:
        locala.jjS.setText(this.context.getResources().getString(R.l.edL, new Object[] { paramView }));
      }
      if (!bg.bX(localq.mAo))
      {
        locala.mNN.setVisibility(0);
        if (!bg.mZ(((q.h)localq.mAo.get(0)).mBm))
        {
          d(locala.mNN, ((q.h)localq.mAo.get(0)).mBm);
          label3298:
          if (!bg.mZ(((q.h)localq.mAo.get(0)).mBn))
          {
            locala.mNN.setOnClickListener(this.mNG);
            locala.mNN.setTag(localq);
            locala.mNN.setEnabled(true);
          }
          label3350:
          if (i <= 1) {
            break label3533;
          }
          locala.jjS.setText(this.context.getResources().getString(R.l.edI, new Object[] { String.valueOf(i) }));
          a(localq, locala);
        }
      }
      for (;;)
      {
        locala.mNR.setVisibility(0);
        locala.jjS.setVisibility(0);
        locala.mNS.setText(localq.mAK);
        locala.mNR.setOnClickListener(this.mNE);
        locala.mNR.setTag(Long.valueOf(localq.field_msgId));
        if (bg.mZ(localq.mAM)) {
          break;
        }
        locala.mNT.setVisibility(0);
        d(locala.mNT, localq.mAM);
        break;
        b(locala.mNN, ((q.h)localq.mAo.get(0)).userName);
        break label3298;
        locala.mNN.setVisibility(8);
        break label3350;
        label3533:
        locala.jjS.setText(this.context.getResources().getString(R.l.edJ));
      }
      paramInt = 0;
      paramView = paramViewGroup;
    }
  }
  
  public final boolean oH(int paramInt)
  {
    GMTrace.i(12707600269312L, 94679);
    if ((this.hIP > this.ftv) && (this.ftv > 0) && (paramInt == this.ftv))
    {
      GMTrace.o(12707600269312L, 94679);
      return true;
    }
    GMTrace.o(12707600269312L, 94679);
    return false;
  }
  
  static final class a
  {
    public TextView jjS;
    public TextView kfQ;
    public LinearLayout mNM;
    public ImageView mNN;
    public LinearLayout mNO;
    public ImageView mNP;
    public TextView mNQ;
    public LinearLayout mNR;
    public TextView mNS;
    public ImageView mNT;
    public ImageView mNU;
    public TextView mNV;
    public TextView mNW;
    public LinearLayout mNX;
    public GameMessageListContainerView mNY;
    
    a()
    {
      GMTrace.i(12684649037824L, 94508);
      GMTrace.o(12684649037824L, 94508);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */