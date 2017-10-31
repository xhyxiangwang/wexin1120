package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.h;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.g.a;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.protocal.c.sn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.e.d;
import com.tencent.mm.ui.widget.QFadeImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public final class at
  extends BaseAdapter
{
  private String country;
  boolean fAk;
  private Activity fGo;
  List<com.tencent.mm.plugin.sns.storage.m> fIU;
  String lBB;
  private String nkl;
  String qEP;
  private ar qHw;
  private an qMD;
  Map<Integer, Integer> qME;
  private f qMF;
  boolean qMG;
  au qMH;
  private c qMI;
  int qMJ;
  int qMK;
  private long qML;
  private long qMM;
  int qMN;
  protected View.OnClickListener qMO;
  Map<Integer, Integer> qwH;
  Map<Integer, Integer> qwI;
  int qwJ;
  int qwK;
  private String userName;
  
  public at(Activity paramActivity, f paramf, String paramString, final c paramc)
  {
    GMTrace.i(8351429689344L, 62223);
    this.userName = "";
    this.fIU = new ArrayList();
    this.qwH = new HashMap();
    this.qwI = new HashMap();
    this.qME = new HashMap();
    this.qwJ = 0;
    this.qwK = 0;
    this.fAk = false;
    this.qEP = "";
    this.qMG = false;
    this.lBB = "";
    this.qHw = null;
    this.nkl = "";
    this.qMJ = Integer.MAX_VALUE;
    this.qMK = 0;
    this.qML = 0L;
    this.qMM = 0L;
    this.qMN = 0;
    this.qMO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8450616590336L, 62962);
        if ((paramAnonymousView.getTag() instanceof bhc))
        {
          paramAnonymousView = (bhc)paramAnonymousView.getTag();
          if (at.Iq(paramAnonymousView.nas)) {
            break label124;
          }
          com.tencent.mm.plugin.report.service.g.paX.z(10090, "1,0");
          if ((!com.tencent.mm.p.a.aQ(at.a(at.this))) && (!com.tencent.mm.p.a.aO(at.a(at.this))))
          {
            paramAnonymousView = ((com.tencent.mm.as.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.as.a.a.class)).a(ae.zp(), paramAnonymousView, 8);
            paramAnonymousView.ukt = at.b(at.this);
            com.tencent.mm.as.b.b(paramAnonymousView);
          }
        }
        for (;;)
        {
          at.this.notifyDataSetChanged();
          GMTrace.o(8450616590336L, 62962);
          return;
          label124:
          com.tencent.mm.plugin.report.service.g.paX.z(10231, "1");
          com.tencent.mm.as.b.JL();
        }
      }
    };
    this.userName = paramString;
    this.fGo = paramActivity;
    this.qMF = paramf;
    this.qMI = paramc;
    this.qHw = ae.bhd();
    paramf = com.tencent.mm.sdk.platformtools.v.d(this.fGo.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bNa(), 0));
    w.d("MicroMsg.SnsphotoAdapter", "filterLan temp " + paramf);
    paramActivity = paramf;
    if (!paramf.equals("zh_CN"))
    {
      paramActivity = paramf;
      if (!paramf.equals("en"))
      {
        if (!paramf.equals("zh_TW")) {
          break label393;
        }
        paramActivity = paramf;
      }
    }
    this.nkl = paramActivity;
    this.country = com.tencent.mm.sdk.platformtools.v.d(this.fGo.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bNa(), 0));
    com.tencent.mm.kernel.h.xA();
    paramActivity = (String)com.tencent.mm.kernel.h.xz().xi().get(2, null);
    if (this.userName.equals(paramActivity)) {
      this.fAk = true;
    }
    w.d("MicroMsg.SnsphotoAdapter", "SnsphotoAdapter : userName : " + this.userName + " country: " + this.country);
    if (this.fAk) {
      this.qMD = an.bQw();
    }
    for (;;)
    {
      this.qMH = new au(new au.b()
      {
        public final void a(List<com.tencent.mm.plugin.sns.storage.m> paramAnonymousList, Map<Integer, Integer> paramAnonymousMap1, Map<Integer, Integer> paramAnonymousMap2, Map<Integer, Integer> paramAnonymousMap3, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(8713683337216L, 64922);
          w.d("MicroMsg.SnsphotoAdapter", "onFinishFixPos");
          at localat = at.this;
          w.d("MicroMsg.SnsphotoAdapter", "setSnsList the thread id is " + Thread.currentThread().getId());
          if ((paramAnonymousList == null) || (paramAnonymousList.size() <= 0))
          {
            GMTrace.o(8713683337216L, 64922);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "copy list info");
          int j = paramAnonymousList.size();
          localat.fIU.clear();
          localat.qwH.clear();
          localat.qwI.clear();
          localat.qME.clear();
          int i = 0;
          while (i < j)
          {
            com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.storage.m.x((com.tencent.mm.plugin.sns.storage.m)paramAnonymousList.get(i));
            localat.fIU.add(localm);
            i += 1;
          }
          paramAnonymousList = paramAnonymousMap1.keySet().iterator();
          while (paramAnonymousList.hasNext())
          {
            i = ((Integer)paramAnonymousList.next()).intValue();
            j = ((Integer)paramAnonymousMap1.get(Integer.valueOf(i))).intValue();
            localat.qwH.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousList = paramAnonymousMap2.keySet().iterator();
          while (paramAnonymousList.hasNext())
          {
            i = ((Integer)paramAnonymousList.next()).intValue();
            j = ((Integer)paramAnonymousMap2.get(Integer.valueOf(i))).intValue();
            localat.qwI.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousList = paramAnonymousMap3.keySet().iterator();
          while (paramAnonymousList.hasNext())
          {
            i = ((Integer)paramAnonymousList.next()).intValue();
            j = ((Integer)paramAnonymousMap3.get(Integer.valueOf(i))).intValue();
            localat.qME.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousMap1.clear();
          paramAnonymousMap2.clear();
          if (localat.fAk)
          {
            if (localat.fIU.size() <= 1) {}
            for (i = Integer.MAX_VALUE;; i = ((com.tencent.mm.plugin.sns.storage.m)localat.fIU.get(1)).field_head)
            {
              localat.qMJ = 0;
              j = 0;
              while (j < localat.fIU.size())
              {
                if ((!localat.fAk) || (j != 0))
                {
                  if (i != ((com.tencent.mm.plugin.sns.storage.m)localat.fIU.get(j)).field_head) {
                    break;
                  }
                  localat.qMJ = Math.max(localat.qMJ, ((com.tencent.mm.plugin.sns.storage.m)localat.fIU.get(j)).field_createTime);
                }
                j += 1;
              }
            }
          }
          if (localat.fIU.isEmpty()) {}
          for (i = Integer.MAX_VALUE;; i = ((com.tencent.mm.plugin.sns.storage.m)localat.fIU.get(0)).field_head) {
            break;
          }
          if ((localat.fIU.isEmpty()) || ((localat.fAk) && (localat.fIU.size() == 1))) {
            localat.qMJ = Integer.MAX_VALUE;
          }
          if (localat.fIU.isEmpty()) {}
          for (i = 0;; i = ((com.tencent.mm.plugin.sns.storage.m)localat.fIU.get(localat.fIU.size() - 1)).field_head)
          {
            localat.qMK = Integer.MAX_VALUE;
            j = localat.fIU.size() - 1;
            while ((j >= 0) && (i != 0) && (i == ((com.tencent.mm.plugin.sns.storage.m)localat.fIU.get(j)).field_head))
            {
              localat.qMK = Math.min(localat.qMK, ((com.tencent.mm.plugin.sns.storage.m)localat.fIU.get(j)).field_createTime);
              j -= 1;
            }
          }
          if (localat.fIU.isEmpty()) {
            localat.qMK = 0;
          }
          localat.qwK = paramAnonymousInt1;
          localat.qwJ = paramAnonymousInt2;
          w.d("MicroMsg.SnsphotoAdapter", "reallyCount " + paramAnonymousInt1 + " icount " + paramAnonymousInt2 + " stTime " + localat.qMJ + " edTIme " + localat.qMK);
          localat.notifyDataSetChanged();
          GMTrace.o(8713683337216L, 64922);
        }
        
        public final void bnu()
        {
          GMTrace.i(8713817554944L, 64923);
          at.this.notifyDataSetChanged();
          GMTrace.o(8713817554944L, 64923);
        }
      }, paramString, this.fAk);
      dV(0L);
      ib(false);
      GMTrace.o(8351429689344L, 62223);
      return;
      label393:
      if (paramf.equals("zh_HK"))
      {
        paramActivity = "zh_TW";
        break;
      }
      paramActivity = "en";
      break;
      com.tencent.mm.kernel.h.xA();
      paramActivity = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(paramString);
      if ((paramActivity != null) && (com.tencent.mm.l.a.eE(paramActivity.field_type))) {
        this.qMD = an.bQv();
      } else {
        this.qMD = an.bQx();
      }
    }
  }
  
  protected static boolean Iq(String paramString)
  {
    GMTrace.i(8353442955264L, 62238);
    aol localaol = com.tencent.mm.as.b.JP();
    if ((localaol != null) && (com.tencent.mm.as.b.d(localaol)) && (paramString.equals(localaol.tIh)) && (com.tencent.mm.as.b.JN()))
    {
      GMTrace.o(8353442955264L, 62238);
      return true;
    }
    GMTrace.o(8353442955264L, 62238);
    return false;
  }
  
  private void a(int paramInt1, QFadeImageView paramQFadeImageView, TextView paramTextView1, TextView paramTextView2, TextView paramTextView3, TextView paramTextView4, int paramInt2, d paramd, int paramInt3)
  {
    GMTrace.i(8352234995712L, 62229);
    com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)getItem(paramInt1);
    bhc localbhc = localm.bjL();
    bdk localbdk = ai.n(localm);
    int i = 0;
    paramInt1 = i;
    if (localbdk != null) {
      if (((localbdk.ujv & 0x2) != 2) || (localbdk.uvt == null))
      {
        paramInt1 = i;
        if ((localbdk.ujv & 0x4) == 4)
        {
          paramInt1 = i;
          if (localbdk.uij == null) {}
        }
      }
      else
      {
        paramInt1 = 1;
      }
    }
    if ((this.fAk) && (localbdk != null) && (paramInt1 != 0) && (this.userName != null) && (this.userName.equals(localm.field_userName)))
    {
      paramTextView3.setBackgroundResource(i.e.pHr);
      paramTextView3.setVisibility(0);
    }
    Object localObject;
    if (paramInt2 == 1)
    {
      if (ai.F(localm.field_localPrivate, this.fAk))
      {
        paramTextView3.setVisibility(0);
        paramTextView3.setBackgroundResource(i.e.pHl);
        localObject = this.qHw.SL(localm.field_userName);
        if (localObject != null) {
          break label569;
        }
        localObject = "";
        if ((!((String)localObject).equals("")) && (!this.userName.equals(localm.field_userName)))
        {
          paramTextView1.setVisibility(0);
          paramTextView1.setText((CharSequence)localObject);
        }
      }
      label238:
      paramInt1 = localm.quQ;
      paramTextView1 = new at.f.a();
      paramTextView1.pYt = paramInt1;
      if (this.qME.get(Integer.valueOf(paramInt3)) == null) {
        break label687;
      }
      paramTextView1.position = ((Integer)this.qME.get(Integer.valueOf(paramInt3))).intValue();
      label298:
      paramQFadeImageView.setTag(paramTextView1);
      paramTextView1 = new an(this.qMD.tag);
      paramTextView1.time = localm.field_createTime;
      if (localbhc.uyu.tKc != 1) {
        break label695;
      }
      paramQFadeImageView.setVisibility(0);
      ae.bhm().a(localbhc.uyu.tKd, paramQFadeImageView, this.fGo.hashCode(), g.a.qaQ, paramTextView1);
      label370:
      if ((localm.bgY()) && (localm.bki()))
      {
        paramTextView3.setVisibility(0);
        paramTextView3.setBackgroundResource(i.e.pHk);
      }
      if (paramInt2 == 1)
      {
        if ((localbhc.uyu.tKd == null) || (localbhc.uyu.tKd.size() <= 1)) {
          break label818;
        }
        paramd.qNk.setVisibility(0);
        paramTextView2.setVisibility(0);
        paramInt1 = localbhc.uyu.tKd.size();
        paramTextView2.setText(this.fGo.getResources().getQuantityString(i.h.pPX, paramInt1, new Object[] { Integer.valueOf(paramInt1) }));
      }
    }
    for (;;)
    {
      paramQFadeImageView = localbhc.uyr;
      if ((paramQFadeImageView != null) && (!paramQFadeImageView.equals("")))
      {
        paramd.qNk.setVisibility(0);
        paramd.qpt.setVisibility(0);
        paramd.qpt.setText(paramQFadeImageView);
        paramd.qpt.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.fGo, paramQFadeImageView, paramd.qpt.getTextSize()));
      }
      GMTrace.o(8352234995712L, 62229);
      return;
      label569:
      localObject = ((com.tencent.mm.l.a)localObject).vq();
      break;
      if (!ai.F(localm.field_localPrivate, this.fAk)) {
        break label238;
      }
      paramTextView3.setVisibility(0);
      paramTextView3.setBackgroundResource(i.e.pHl);
      localObject = this.qHw.SL(localm.field_userName);
      if (localObject == null) {}
      for (localObject = "";; localObject = ((com.tencent.mm.l.a)localObject).vq())
      {
        if ((localObject == null) || (((String)localObject).equals("")) || (this.userName.equals(localm.field_userName))) {
          break label685;
        }
        paramTextView1.setVisibility(0);
        paramTextView1.setText((CharSequence)localObject);
        break;
      }
      label685:
      break label238;
      label687:
      paramTextView1.position = 0;
      break label298;
      label695:
      if (localbhc.uyu.tKc == 2)
      {
        paramTextView4.setText(bg.ap(localbhc.uyu.mCK, ""));
        paramTextView4.setVisibility(0);
        break label370;
      }
      if (localbhc.uyu.tKc != 21) {
        break label370;
      }
      localm.bjY();
      boolean bool = true;
      if (this.fAk) {
        bool = true;
      }
      for (;;)
      {
        paramQFadeImageView.setVisibility(0);
        ae.bhm().a(localbhc.uyu.tKd, paramQFadeImageView, this.fGo.hashCode(), g.a.qaQ, paramTextView1, bool);
        break;
        if (com.tencent.mm.plugin.sns.lucky.a.m.a(localm, localbdk)) {
          bool = false;
        }
      }
      label818:
      paramTextView2.setVisibility(8);
    }
  }
  
  private void a(TextView paramTextView1, TextView paramTextView2, long paramLong)
  {
    GMTrace.i(8351832342528L, 62226);
    Object localObject = this.fGo;
    if (!this.nkl.equals("en")) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = (String)az.a((Context)localObject, 1000L * paramLong, bool);
      if (((String)localObject).indexOf(":") <= 0) {
        break;
      }
      localObject = ((String)localObject).split(":");
      if (localObject[1].length() < 2) {
        localObject[1] = ("0" + localObject[1]);
      }
      paramTextView1.setText(localObject[0]);
      paramTextView2.setText(localObject[1]);
      paramTextView2.setVisibility(0);
      paramTextView1.setVisibility(0);
      GMTrace.o(8351832342528L, 62226);
      return;
    }
    if (((String)localObject).indexOf("/") > 0)
    {
      localObject = ((String)localObject).split("/");
      if (localObject[1].length() < 2) {
        localObject[1] = ("0" + localObject[1]);
      }
      localObject[0] = az.s(this.fGo, localObject[0], this.nkl);
      paramTextView1.setText(localObject[0]);
      paramTextView2.setText(localObject[1]);
      paramTextView2.setVisibility(0);
      paramTextView1.setVisibility(0);
      GMTrace.o(8351832342528L, 62226);
      return;
    }
    paramTextView2.setVisibility(0);
    paramTextView2.setText((CharSequence)localObject);
    GMTrace.o(8351832342528L, 62226);
  }
  
  private void dV(long paramLong)
  {
    GMTrace.i(8352906084352L, 62234);
    Object localObject = i.dp(ae.bhp().a(paramLong, ae.bhf().GH(this.userName), this.userName, this.fAk));
    if (this.qEP.equals("")) {}
    for (;;)
    {
      this.lBB = ((String)localObject);
      localObject = ae.bhs().HE(this.userName).bjX();
      if (((sn)localObject).tOl != 0L) {
        break;
      }
      GMTrace.o(8352906084352L, 62234);
      return;
      if (((String)localObject).compareTo(this.qEP) >= 0) {
        localObject = this.qEP;
      }
    }
    localObject = i.dp(((sn)localObject).tOl);
    if (this.lBB.equals(""))
    {
      this.lBB = ((String)localObject);
      GMTrace.o(8352906084352L, 62234);
      return;
    }
    if (((String)localObject).compareTo(this.lBB) > 0) {}
    for (;;)
    {
      this.lBB = ((String)localObject);
      GMTrace.o(8352906084352L, 62234);
      return;
      localObject = this.lBB;
    }
  }
  
  private void ib(boolean paramBoolean)
  {
    GMTrace.i(8352369213440L, 62230);
    w.d("MicroMsg.SnsphotoAdapter", "limitSeq " + this.lBB);
    if (this.qMH != null) {
      this.qMH.e(this.lBB, this.qMG, paramBoolean);
    }
    GMTrace.o(8352369213440L, 62230);
  }
  
  public final void blG()
  {
    GMTrace.i(8352637648896L, 62232);
    ib(true);
    notifyDataSetChanged();
    GMTrace.o(8352637648896L, 62232);
  }
  
  public final void bnt()
  {
    GMTrace.i(8352771866624L, 62233);
    w.d("MicroMsg.SnsphotoAdapter", "i addSize ");
    if (this.fIU.isEmpty()) {}
    for (long l = 0L;; l = ((com.tencent.mm.plugin.sns.storage.m)this.fIU.get(this.fIU.size() - 1)).field_snsId)
    {
      dV(l);
      GMTrace.o(8352771866624L, 62233);
      return;
    }
  }
  
  public final void dU(long paramLong)
  {
    GMTrace.i(8351295471616L, 62222);
    if (0L != this.qML)
    {
      GMTrace.o(8351295471616L, 62222);
      return;
    }
    this.qML = paramLong;
    this.qMM = 0L;
    GMTrace.o(8351295471616L, 62222);
  }
  
  public final ArrayList<com.tencent.mm.plugin.sns.g.b> dd(int paramInt1, int paramInt2)
  {
    GMTrace.i(8353308737536L, 62237);
    ArrayList localArrayList = new ArrayList();
    this.qMN = paramInt2;
    paramInt2 = 0;
    while (paramInt2 < this.fIU.size())
    {
      com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)this.fIU.get(paramInt2);
      int j = localm.quQ;
      if ((localm.bjL() != null) && (localm.bjL().uyu != null) && (localm.bjL().uyu.tKd.size() != 0) && ((localm.bjL().uyu.tKc == 1) || (localm.bjL().uyu.tKc == 15)))
      {
        if (j == paramInt1) {
          this.qMN = localArrayList.size();
        }
        Iterator localIterator = localm.bjL().uyu.tKd.iterator();
        int i = 0;
        while (localIterator.hasNext())
        {
          amn localamn = (amn)localIterator.next();
          com.tencent.mm.plugin.sns.g.b localb = new com.tencent.mm.plugin.sns.g.b();
          localb.fNf = localamn;
          localb.qhV = u.W("sns_table_", j);
          localb.hzl = localm.field_createTime;
          localb.qhW = i;
          localArrayList.add(localb);
          i += 1;
        }
      }
      paramInt2 += 1;
    }
    GMTrace.o(8353308737536L, 62237);
    return localArrayList;
  }
  
  public final int getCount()
  {
    GMTrace.i(8351698124800L, 62225);
    int i = this.qwJ;
    GMTrace.o(8351698124800L, 62225);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(8353040302080L, 62235);
    Object localObject = this.fIU.get(paramInt);
    GMTrace.o(8353040302080L, 62235);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8353174519808L, 62236);
    GMTrace.o(8353174519808L, 62236);
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(8351966560256L, 62227);
    if ((this.fAk) && (paramInt == 0))
    {
      w.d("MicroMsg.SnsphotoAdapter", "position isSelf " + paramInt + " - 0");
      GMTrace.o(8351966560256L, 62227);
      return 0;
    }
    if (this.qwH.get(Integer.valueOf(paramInt)) != null) {}
    for (int i = ((Integer)this.qwH.get(Integer.valueOf(paramInt))).intValue();; i = -1)
    {
      if (i == -1)
      {
        w.e("MicroMsg.SnsphotoAdapter", "unknow error " + i);
        GMTrace.o(8351966560256L, 62227);
        return 0;
      }
      com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
      if (localm.bjL().uyu.tKc == 1)
      {
        w.d("MicroMsg.SnsphotoAdapter", "position " + paramInt + " - 0");
        GMTrace.o(8351966560256L, 62227);
        return 0;
      }
      if (localm.bjL().uyu.tKc == 15)
      {
        w.d("MicroMsg.SnsphotoAdapter", "position " + paramInt + " - 2");
        GMTrace.o(8351966560256L, 62227);
        return 2;
      }
      if (localm.bjL().uyu.tKc == 21)
      {
        GMTrace.o(8351966560256L, 62227);
        return 3;
      }
      GMTrace.o(8351966560256L, 62227);
      return 1;
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8351563907072L, 62224);
    int i = getItemViewType(paramInt);
    w.i("MicroMsg.SnsphotoAdapter", "position " + i);
    Object localObject1;
    int j;
    if (i == 0)
    {
      if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof d)))
      {
        paramViewGroup = new d();
        paramView = com.tencent.mm.ui.v.fa(this.fGo).inflate(i.g.pPi, null);
        paramViewGroup.qMT = ((TextView)paramView.findViewById(i.f.pLX));
        paramViewGroup.qMS = ((TextView)paramView.findViewById(i.f.pMu));
        paramViewGroup.qNc = ((MaskImageView)paramView.findViewById(i.f.pKb));
        paramViewGroup.qNd = ((QFadeImageView)paramView.findViewById(i.f.pNt));
        paramViewGroup.qNe = ((MaskImageView)paramView.findViewById(i.f.pKc));
        paramViewGroup.qNf = ((MaskImageView)paramView.findViewById(i.f.pKd));
        paramViewGroup.qpt = ((TextView)paramView.findViewById(i.f.bAw));
        paramViewGroup.qNg = ((TextView)paramView.findViewById(i.f.pNN));
        paramViewGroup.qNh = ((TextView)paramView.findViewById(i.f.pNO));
        paramViewGroup.qNi = ((TextView)paramView.findViewById(i.f.pNP));
        paramViewGroup.qNj = ((TextView)paramView.findViewById(i.f.pKf));
        paramViewGroup.qNk = paramView.findViewById(i.f.pJC);
        paramViewGroup.qMW = ((TextView)paramView.findViewById(i.f.cMc));
        paramViewGroup.qMU = ((LinearLayout)paramView.findViewById(i.f.pKr));
        paramViewGroup.qMV = ((ImageView)paramView.findViewById(i.f.pKz));
        paramViewGroup.qwY = ((LinearLayout)paramView.findViewById(i.f.pKt));
        paramViewGroup.qwZ = paramView.findViewById(i.f.pKq);
        paramViewGroup.qNd.setOnClickListener(this.qMF.qwP);
        paramViewGroup.qNc.setOnClickListener(this.qMF.qwP);
        paramViewGroup.qNe.setOnClickListener(this.qMF.qwQ);
        paramViewGroup.qNf.setOnClickListener(this.qMF.qwR);
        paramViewGroup.qNl = ((TextView)paramView.findViewById(i.f.pNH));
        paramViewGroup.qNm = ((TextView)paramView.findViewById(i.f.pNI));
        paramViewGroup.qNn = ((TextView)paramView.findViewById(i.f.pNJ));
        paramViewGroup.qNo = ((TextView)paramView.findViewById(i.f.pNz));
        paramViewGroup.qNp = ((TextView)paramView.findViewById(i.f.pNA));
        paramViewGroup.qNq = ((TextView)paramView.findViewById(i.f.pNB));
        paramViewGroup.qNr = ((MaskLinearLayout)paramView.findViewById(i.f.pMr));
        paramViewGroup.qNr.b(paramViewGroup.qNc);
        paramViewGroup.qMX = ((LinearLayout)paramView.findViewById(i.f.pJO));
        paramViewGroup.qMY = ((TextView)paramView.findViewById(i.f.pMH));
        paramViewGroup.qMY.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8470883467264L, 63113);
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("enter_scene", e.d.vkD);
            d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
            com.tencent.mm.plugin.report.service.g.paX.i(14098, new Object[] { Integer.valueOf(8) });
            GMTrace.o(8470883467264L, 63113);
          }
        });
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        ae.bhm().cp(paramViewGroup.qNc);
        ae.bhm().cp(paramViewGroup.qNe);
        ae.bhm().cp(paramViewGroup.qNf);
        i = -1;
        if (this.qwH.get(Integer.valueOf(paramInt)) != null) {
          i = ((Integer)this.qwH.get(Integer.valueOf(paramInt))).intValue();
        }
        paramViewGroup.init();
        paramViewGroup.qNr.fwS = false;
        paramViewGroup.qNr.setBackgroundResource(0);
        paramViewGroup.qNr.setDescendantFocusability(131072);
        paramViewGroup.qNr.setClickable(false);
        paramViewGroup.qNc.fwS = true;
        paramViewGroup.qNc.setClickable(true);
        paramViewGroup.qNr.setOnClickListener(null);
        if ((i < this.qwK) && (i != -1)) {
          break;
        }
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
        paramView.setVisibility(8);
        GMTrace.o(8351563907072L, 62224);
        return paramView;
        paramViewGroup = (d)paramView.getTag();
      }
      if (i - 1 < 0) {
        break label5826;
      }
      localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
      j = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head;
      ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.fAk);
    }
    for (;;)
    {
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      paramView.setVisibility(0);
      if (this.qwI.get(Integer.valueOf(paramInt)) != null) {}
      for (int k = ((Integer)this.qwI.get(Integer.valueOf(paramInt))).intValue();; k = 1)
      {
        localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
        Object localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
        long l;
        if (((this.fAk) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
        {
          l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
          a(paramViewGroup.qMS, paramViewGroup.qMT, l);
          if (((bhc)localObject2).uys != null)
          {
            localObject2 = ((bhc)localObject2).uys.huL;
            if ((localObject2 != null) && (!((String)localObject2).equals("")))
            {
              paramViewGroup.qMW.setText((CharSequence)localObject2);
              paramViewGroup.qMW.setVisibility(0);
            }
          }
          paramViewGroup.qwZ.setVisibility(0);
        }
        if ((this.qMM != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qMM))
        {
          paramViewGroup.qMX.setVisibility(0);
          paramViewGroup.qMU.setVisibility(0);
          if ((!this.fAk) || (paramInt != 0)) {
            break label1218;
          }
          paramViewGroup.qNd.setVisibility(0);
          paramViewGroup.qNd.setContentDescription(this.fGo.getString(i.j.pTW));
          paramViewGroup.qNc.setVisibility(8);
          localObject2 = paramViewGroup.qpt;
          if (this.qwJ != 1) {
            break label1211;
          }
        }
        label1211:
        for (localObject1 = this.fGo.getString(i.j.pUn);; localObject1 = "")
        {
          ((TextView)localObject2).setText((CharSequence)localObject1);
          paramViewGroup.qpt.setVisibility(0);
          paramViewGroup.qNk.setVisibility(0);
          paramViewGroup.qNj.setVisibility(8);
          ae.bhm().b(paramViewGroup.qNd, i.c.gUI, i.e.pHD, this.fGo.hashCode());
          localObject1 = new at.f.a();
          ((at.f.a)localObject1).pYt = -1;
          ((at.f.a)localObject1).position = -1;
          paramViewGroup.qNd.setTag(localObject1);
          GMTrace.o(8351563907072L, 62224);
          return paramView;
          if ((this.qMM == 0L) && (this.qML != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qML))
          {
            paramViewGroup.qMX.setVisibility(0);
            this.qMM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
            break;
          }
          paramViewGroup.qMX.setVisibility(8);
          break;
        }
        label1218:
        if (k > 0) {
          a(i, paramViewGroup.qNc, paramViewGroup.qNg, paramViewGroup.qNj, paramViewGroup.qNl, paramViewGroup.qNo, 1, paramViewGroup, paramInt);
        }
        if (k >= 2) {
          a(i + 1, paramViewGroup.qNe, paramViewGroup.qNh, paramViewGroup.qNj, paramViewGroup.qNm, paramViewGroup.qNp, 2, paramViewGroup, paramInt);
        }
        if (k >= 3) {
          a(i + 2, paramViewGroup.qNf, paramViewGroup.qNi, paramViewGroup.qNj, paramViewGroup.qNn, paramViewGroup.qNq, 3, paramViewGroup, paramInt);
        }
        if (k == 1)
        {
          localObject2 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
          if ((!bg.mZ(((com.tencent.mm.plugin.sns.storage.m)localObject2).bjL().uyr)) && (((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type == 1))
          {
            paramViewGroup.qNr.setDescendantFocusability(393216);
            paramViewGroup.qNr.setClickable(true);
            paramViewGroup.qNc.setClickable(false);
            paramViewGroup.qNc.fwS = false;
            paramViewGroup.qNr.setOnClickListener(this.qMF.qwP);
            paramViewGroup.qNr.fwS = true;
            i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).quQ;
            localObject1 = new at.f.a();
            ((at.f.a)localObject1).pYt = i;
            if (this.qME.get(Integer.valueOf(paramInt)) == null) {
              break label1510;
            }
          }
        }
        label1510:
        for (((at.f.a)localObject1).position = ((Integer)this.qME.get(Integer.valueOf(paramInt))).intValue();; ((at.f.a)localObject1).position = 0)
        {
          paramViewGroup.qNr.setTag(localObject1);
          paramView.setDrawingCacheEnabled(false);
          GMTrace.o(8351563907072L, 62224);
          return paramView;
        }
        if (i == 2) {
          if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof e)))
          {
            paramViewGroup = new e();
            paramView = com.tencent.mm.ui.v.fa(this.fGo).inflate(i.g.pPs, null);
            paramViewGroup.qMT = ((TextView)paramView.findViewById(i.f.pLX));
            paramViewGroup.qMS = ((TextView)paramView.findViewById(i.f.pMu));
            paramViewGroup.qNc = ((MaskImageView)paramView.findViewById(i.f.pKb));
            paramViewGroup.qMW = ((TextView)paramView.findViewById(i.f.cMc));
            paramViewGroup.qMU = ((LinearLayout)paramView.findViewById(i.f.pKr));
            paramViewGroup.qMV = ((ImageView)paramView.findViewById(i.f.pKz));
            paramViewGroup.qwY = ((LinearLayout)paramView.findViewById(i.f.pKt));
            paramViewGroup.qwZ = paramView.findViewById(i.f.pKq);
            paramViewGroup.qNc.setOnClickListener(this.qMF.qNu);
            paramViewGroup.qNl = ((TextView)paramView.findViewById(i.f.pNH));
            paramViewGroup.qNr = ((MaskLinearLayout)paramView.findViewById(i.f.pMr));
            paramViewGroup.qNr.b(paramViewGroup.qNc);
            paramViewGroup.qpt = ((TextView)paramView.findViewById(i.f.bAw));
            paramViewGroup.qNk = paramView.findViewById(i.f.pJC);
            paramViewGroup.qMX = ((LinearLayout)paramView.findViewById(i.f.pJO));
            paramViewGroup.qMY = ((TextView)paramView.findViewById(i.f.pMH));
            paramViewGroup.qMY.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(8751666954240L, 65205);
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("enter_scene", e.d.vkD);
                d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
                com.tencent.mm.plugin.report.service.g.paX.i(14098, new Object[] { Integer.valueOf(8) });
                GMTrace.o(8751666954240L, 65205);
              }
            });
            paramView.setTag(paramViewGroup);
            ae.bhm().cp(paramViewGroup.qNc);
            if (this.qwH.get(Integer.valueOf(paramInt)) == null) {
              break label5814;
            }
          }
        }
        label2645:
        label3762:
        label3769:
        label3976:
        label4326:
        label4679:
        label4735:
        label4990:
        label4998:
        label5011:
        label5163:
        label5314:
        label5326:
        label5383:
        label5399:
        label5585:
        label5610:
        label5689:
        label5736:
        label5749:
        label5761:
        label5774:
        label5787:
        label5796:
        label5802:
        label5814:
        for (i = ((Integer)this.qwH.get(Integer.valueOf(paramInt))).intValue();; i = -1)
        {
          paramViewGroup.init();
          paramViewGroup.qNr.fwS = false;
          paramViewGroup.qNr.setBackgroundResource(0);
          paramViewGroup.qNr.setDescendantFocusability(131072);
          paramViewGroup.qNr.setClickable(false);
          paramViewGroup.qNc.fwS = true;
          paramViewGroup.qNc.setClickable(true);
          paramViewGroup.qNr.setOnClickListener(null);
          if ((i >= this.qwK) || (i == -1))
          {
            paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            paramView.setVisibility(8);
            GMTrace.o(8351563907072L, 62224);
            return paramView;
            paramViewGroup = (e)paramView.getTag();
            break;
          }
          if (i - 1 >= 0)
          {
            localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
            j = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head;
            ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.fAk);
          }
          for (;;)
          {
            paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            paramView.setVisibility(0);
            if (this.qwI.get(Integer.valueOf(paramInt)) != null) {
              ((Integer)this.qwI.get(Integer.valueOf(paramInt))).intValue();
            }
            localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
            localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
            Object localObject3;
            if (((this.fAk) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
            {
              l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
              a(paramViewGroup.qMS, paramViewGroup.qMT, l);
              if (((bhc)localObject2).uys != null)
              {
                localObject3 = ((bhc)localObject2).uys.huL;
                if ((localObject3 != null) && (!((String)localObject3).equals("")))
                {
                  paramViewGroup.qMW.setText((CharSequence)localObject3);
                  paramViewGroup.qMW.setVisibility(0);
                }
              }
              paramViewGroup.qwZ.setVisibility(0);
            }
            if ((this.qMM != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qMM))
            {
              paramViewGroup.qMX.setVisibility(0);
              paramViewGroup.qMU.setVisibility(0);
              ai.n((com.tencent.mm.plugin.sns.storage.m)localObject1);
              localObject3 = new an(this.qMD.tag);
              ((an)localObject3).time = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
              paramViewGroup.qNc.setVisibility(0);
              ae.bhm().a(((bhc)localObject2).uyu.tKd, paramViewGroup.qNc, this.fGo.hashCode(), g.a.qaQ, (an)localObject3);
              if (ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.fAk))
              {
                paramViewGroup.qNl.setVisibility(0);
                paramViewGroup.qNl.setBackgroundResource(i.e.pHl);
                localObject2 = this.qHw.SL(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
                if (localObject2 != null) {
                  ((com.tencent.mm.l.a)localObject2).vq();
                }
              }
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)getItem(i)).bjL().uyr;
              if ((localObject2 != null) && (!((String)localObject2).equals("")))
              {
                paramViewGroup.qNk.setVisibility(0);
                paramViewGroup.qpt.setVisibility(0);
                paramViewGroup.qpt.setText((CharSequence)localObject2);
                paramViewGroup.qpt.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.fGo, (CharSequence)localObject2, paramViewGroup.qpt.getTextSize()));
              }
              paramViewGroup.qNr.setDescendantFocusability(393216);
              paramViewGroup.qNr.setClickable(true);
              paramViewGroup.qNc.setClickable(false);
              paramViewGroup.qNc.fwS = false;
              paramViewGroup.qNr.setOnClickListener(this.qMF.qNu);
              paramViewGroup.qNr.fwS = true;
              i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).quQ;
              localObject1 = new at.f.a();
              ((at.f.a)localObject1).pYt = i;
              if (this.qME.get(Integer.valueOf(paramInt)) == null) {
                break label2645;
              }
            }
            for (((at.f.a)localObject1).position = ((Integer)this.qME.get(Integer.valueOf(paramInt))).intValue();; ((at.f.a)localObject1).position = 0)
            {
              paramViewGroup.qNr.setTag(localObject1);
              paramView.setDrawingCacheEnabled(false);
              GMTrace.o(8351563907072L, 62224);
              return paramView;
              if ((this.qMM == 0L) && (this.qML != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qML))
              {
                paramViewGroup.qMX.setVisibility(0);
                this.qMM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
                break;
              }
              paramViewGroup.qMX.setVisibility(8);
              break;
            }
            if (i == 3)
            {
              if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof d)))
              {
                paramViewGroup = new d();
                paramView = com.tencent.mm.ui.v.fa(this.fGo).inflate(i.g.pPi, null);
                paramViewGroup.qMT = ((TextView)paramView.findViewById(i.f.pLX));
                paramViewGroup.qMS = ((TextView)paramView.findViewById(i.f.pMu));
                paramViewGroup.qNc = ((MaskImageView)paramView.findViewById(i.f.pKb));
                paramViewGroup.qNd = ((QFadeImageView)paramView.findViewById(i.f.pNt));
                paramViewGroup.qNe = ((MaskImageView)paramView.findViewById(i.f.pKc));
                paramViewGroup.qNf = ((MaskImageView)paramView.findViewById(i.f.pKd));
                paramViewGroup.qpt = ((TextView)paramView.findViewById(i.f.bAw));
                paramViewGroup.qNg = ((TextView)paramView.findViewById(i.f.pNN));
                paramViewGroup.qNh = ((TextView)paramView.findViewById(i.f.pNO));
                paramViewGroup.qNi = ((TextView)paramView.findViewById(i.f.pNP));
                paramViewGroup.qNj = ((TextView)paramView.findViewById(i.f.pKf));
                paramViewGroup.qNk = paramView.findViewById(i.f.pJC);
                paramViewGroup.qMW = ((TextView)paramView.findViewById(i.f.cMc));
                paramViewGroup.qMU = ((LinearLayout)paramView.findViewById(i.f.pKr));
                paramViewGroup.qMV = ((ImageView)paramView.findViewById(i.f.pKz));
                paramViewGroup.qwY = ((LinearLayout)paramView.findViewById(i.f.pKt));
                paramViewGroup.qwZ = paramView.findViewById(i.f.pKq);
                paramViewGroup.qNd.setOnClickListener(this.qMF.qNt);
                paramViewGroup.qNc.setOnClickListener(this.qMF.qNt);
                paramViewGroup.qNl = ((TextView)paramView.findViewById(i.f.pNH));
                paramViewGroup.qNm = ((TextView)paramView.findViewById(i.f.pNI));
                paramViewGroup.qNn = ((TextView)paramView.findViewById(i.f.pNJ));
                paramViewGroup.qNo = ((TextView)paramView.findViewById(i.f.pNz));
                paramViewGroup.qNp = ((TextView)paramView.findViewById(i.f.pNA));
                paramViewGroup.qNq = ((TextView)paramView.findViewById(i.f.pNB));
                paramViewGroup.qNr = ((MaskLinearLayout)paramView.findViewById(i.f.pMr));
                paramViewGroup.qNr.b(paramViewGroup.qNc);
                paramViewGroup.qMX = ((LinearLayout)paramView.findViewById(i.f.pJO));
                paramViewGroup.qMY = ((TextView)paramView.findViewById(i.f.pMH));
                paramViewGroup.qMY.setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(8616241266688L, 64196);
                    paramAnonymousView = new Intent();
                    paramAnonymousView.putExtra("enter_scene", e.d.vkD);
                    d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
                    com.tencent.mm.plugin.report.service.g.paX.i(14098, new Object[] { Integer.valueOf(8) });
                    GMTrace.o(8616241266688L, 64196);
                  }
                });
                paramView.setTag(paramViewGroup);
              }
              for (;;)
              {
                ae.bhm().cp(paramViewGroup.qNc);
                ae.bhm().cp(paramViewGroup.qNe);
                ae.bhm().cp(paramViewGroup.qNf);
                i = -1;
                if (this.qwH.get(Integer.valueOf(paramInt)) != null) {
                  i = ((Integer)this.qwH.get(Integer.valueOf(paramInt))).intValue();
                }
                paramViewGroup.init();
                paramViewGroup.qNr.fwS = false;
                paramViewGroup.qNr.setBackgroundResource(0);
                paramViewGroup.qNr.setDescendantFocusability(131072);
                paramViewGroup.qNr.setClickable(false);
                paramViewGroup.qNc.fwS = true;
                paramViewGroup.qNc.setClickable(true);
                paramViewGroup.qNr.setOnClickListener(null);
                if ((i < this.qwK) && (i != -1)) {
                  break;
                }
                paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
                paramView.setVisibility(8);
                GMTrace.o(8351563907072L, 62224);
                return paramView;
                paramViewGroup = (d)paramView.getTag();
              }
              if (i - 1 < 0) {
                break label5802;
              }
              localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
              j = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head;
              ai.F(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_localPrivate, this.fAk);
            }
            for (;;)
            {
              paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
              paramView.setVisibility(0);
              localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
              if (((this.fAk) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
              {
                l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
                a(paramViewGroup.qMS, paramViewGroup.qMT, l);
                if (((bhc)localObject2).uys != null)
                {
                  localObject2 = ((bhc)localObject2).uys.huL;
                  if ((localObject2 != null) && (!((String)localObject2).equals("")))
                  {
                    paramViewGroup.qMW.setText((CharSequence)localObject2);
                    paramViewGroup.qMW.setVisibility(0);
                  }
                }
                paramViewGroup.qwZ.setVisibility(0);
              }
              if ((this.qMM != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qMM))
              {
                paramViewGroup.qMX.setVisibility(0);
                paramViewGroup.qMU.setVisibility(0);
                if ((!this.fAk) || (paramInt != 0)) {
                  break label3769;
                }
                paramViewGroup.qNd.setVisibility(0);
                paramViewGroup.qNd.setContentDescription(this.fGo.getString(i.j.pTW));
                paramViewGroup.qNc.setVisibility(8);
                localObject2 = paramViewGroup.qpt;
                if (this.qwJ != 1) {
                  break label3762;
                }
              }
              for (localObject1 = this.fGo.getString(i.j.pUn);; localObject1 = "")
              {
                ((TextView)localObject2).setText((CharSequence)localObject1);
                paramViewGroup.qpt.setVisibility(0);
                paramViewGroup.qNk.setVisibility(0);
                paramViewGroup.qNj.setVisibility(8);
                ae.bhm().b(paramViewGroup.qNd, i.c.gUI, i.e.pHD, this.fGo.hashCode());
                localObject1 = new at.f.a();
                ((at.f.a)localObject1).pYt = -1;
                ((at.f.a)localObject1).position = -1;
                paramViewGroup.qNd.setTag(localObject1);
                GMTrace.o(8351563907072L, 62224);
                return paramView;
                if ((this.qMM == 0L) && (this.qML != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qML))
                {
                  paramViewGroup.qMX.setVisibility(0);
                  this.qMM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
                  break;
                }
                paramViewGroup.qMX.setVisibility(8);
                break;
              }
              a(i, paramViewGroup.qNc, paramViewGroup.qNg, paramViewGroup.qNj, paramViewGroup.qNl, paramViewGroup.qNo, 1, paramViewGroup, paramInt);
              localObject2 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
              if ((!bg.mZ(((com.tencent.mm.plugin.sns.storage.m)localObject2).bjL().uyr)) && (((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type == 1))
              {
                paramViewGroup.qNr.setDescendantFocusability(393216);
                paramViewGroup.qNr.setClickable(true);
                paramViewGroup.qNc.setClickable(false);
                paramViewGroup.qNc.fwS = false;
                paramViewGroup.qNr.setOnClickListener(this.qMF.qNt);
                paramViewGroup.qNr.fwS = true;
                i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).quQ;
                localObject1 = new at.f.a();
                ((at.f.a)localObject1).pYt = i;
                if (this.qME.get(Integer.valueOf(paramInt)) == null) {
                  break label3976;
                }
              }
              for (((at.f.a)localObject1).position = ((Integer)this.qME.get(Integer.valueOf(paramInt))).intValue();; ((at.f.a)localObject1).position = 0)
              {
                paramViewGroup.qNr.setTag(localObject1);
                paramView.setDrawingCacheEnabled(false);
                GMTrace.o(8351563907072L, 62224);
                return paramView;
              }
              if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof b)))
              {
                localObject2 = new b();
                paramView = com.tencent.mm.ui.v.fa(this.fGo).inflate(i.g.pPh, null);
                ((b)localObject2).qMR = paramView.findViewById(i.f.gVz);
                ((b)localObject2).qMT = ((TextView)paramView.findViewById(i.f.pLX));
                ((b)localObject2).qMS = ((TextView)paramView.findViewById(i.f.pMu));
                ((b)localObject2).qMW = ((TextView)paramView.findViewById(i.f.cMc));
                ((b)localObject2).qwZ = paramView.findViewById(i.f.pKq);
                ((b)localObject2).qMW = ((TextView)paramView.findViewById(i.f.cMc));
                ((b)localObject2).qMU = ((LinearLayout)paramView.findViewById(i.f.pKr));
                ((b)localObject2).qMV = ((ImageView)paramView.findViewById(i.f.pKz));
                ((b)localObject2).qwY = ((LinearLayout)paramView.findViewById(i.f.pKt));
                ((b)localObject2).neZ = ((TextView)paramView.findViewById(i.f.bAy));
                ((b)localObject2).qMZ = ((TagImageView)paramView.findViewById(i.f.pJY));
                ((b)localObject2).qxB = ((ImageView)paramView.findViewById(i.f.state));
                ((b)localObject2).iin = ((TextView)paramView.findViewById(i.f.pNx));
                ((b)localObject2).qNa = ((TextView)paramView.findViewById(i.f.pKS));
                ((b)localObject2).qMR.setOnClickListener(this.qMF.qNs);
                ((b)localObject2).qNb = paramView.findViewById(i.f.pKB);
                ((b)localObject2).qMX = ((LinearLayout)paramView.findViewById(i.f.pJO));
                ((b)localObject2).qMY = ((TextView)paramView.findViewById(i.f.pMH));
                ((b)localObject2).qMY.setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(8566178054144L, 63823);
                    paramAnonymousView = new Intent();
                    paramAnonymousView.putExtra("enter_scene", e.d.vkD);
                    d.b(at.a(at.this), "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
                    com.tencent.mm.plugin.report.service.g.paX.i(14098, new Object[] { Integer.valueOf(8) });
                    GMTrace.o(8566178054144L, 63823);
                  }
                });
                paramView.setTag(localObject2);
                i.b(((b)localObject2).qMZ, this.fGo);
                if (this.qwH.get(Integer.valueOf(paramInt)) == null) {
                  break label5796;
                }
              }
              for (i = ((Integer)this.qwH.get(Integer.valueOf(paramInt))).intValue();; i = -1)
              {
                ((b)localObject2).init();
                if ((i >= this.qwK) || (i == -1))
                {
                  paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
                  paramView.setVisibility(8);
                  GMTrace.o(8351563907072L, 62224);
                  return paramView;
                  localObject2 = (b)paramView.getTag();
                  break label4326;
                }
                paramView.setVisibility(0);
                if (i - 1 >= 0)
                {
                  paramViewGroup = (com.tencent.mm.plugin.sns.storage.m)getItem(i - 1);
                  j = paramViewGroup.field_head;
                  ai.F(paramViewGroup.field_localPrivate, this.fAk);
                }
                for (;;)
                {
                  paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                  paramView.setVisibility(0);
                  if (this.qwI.get(Integer.valueOf(paramInt)) != null) {
                    ((Integer)this.qwI.get(Integer.valueOf(paramInt))).intValue();
                  }
                  localObject1 = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
                  localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
                  if (((this.fAk) && (paramInt == 0)) || (j == -1) || (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_head != j))
                  {
                    l = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
                    a(((b)localObject2).qMS, ((b)localObject2).qMT, l);
                    if (((bhc)localObject3).uys != null)
                    {
                      paramViewGroup = ((bhc)localObject3).uys.huL;
                      if ((paramViewGroup != null) && (!paramViewGroup.equals("")))
                      {
                        ((b)localObject2).qMW.setText(paramViewGroup);
                        ((b)localObject2).qMW.setVisibility(0);
                      }
                    }
                    ((b)localObject2).qwZ.setVisibility(0);
                  }
                  if ((this.qMM != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId == this.qMM))
                  {
                    ((b)localObject2).qMX.setVisibility(0);
                    paramViewGroup = new at.f.a();
                    paramViewGroup.pYt = ((com.tencent.mm.plugin.sns.storage.m)localObject1).quQ;
                    if (this.qME.get(Integer.valueOf(paramInt)) == null) {
                      break label4990;
                    }
                    paramViewGroup.position = ((Integer)this.qME.get(Integer.valueOf(paramInt))).intValue();
                    ((b)localObject2).qMR.setTag(paramViewGroup);
                    if (bg.mZ(((bhc)localObject3).uyr)) {
                      break label4998;
                    }
                    ((b)localObject2).neZ.setVisibility(0);
                    ((b)localObject2).neZ.setText(((bhc)localObject3).uyr);
                    ((b)localObject2).neZ.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.fGo, ((bhc)localObject3).uyr, ((b)localObject2).neZ.getTextSize()));
                  }
                  an localan;
                  for (;;)
                  {
                    ((b)localObject2).qMU.setVisibility(0);
                    ((b)localObject2).neZ.setSingleLine(true);
                    ((b)localObject2).qNb.setVisibility(0);
                    paramInt = ((bhc)localObject3).uyu.tKc;
                    localan = new an(this.qMD.tag);
                    localan.time = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime;
                    if (paramInt != 2) {
                      break label5011;
                    }
                    ((b)localObject2).neZ.setVisibility(0);
                    ((b)localObject2).neZ.setSingleLine(false);
                    ((b)localObject2).neZ.setMaxLines(2);
                    ((b)localObject2).qNb.setVisibility(8);
                    break;
                    if ((this.qMM == 0L) && (this.qML != 0L) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId <= this.qML))
                    {
                      ((b)localObject2).qMX.setVisibility(0);
                      this.qMM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId;
                      break label4679;
                    }
                    ((b)localObject2).qMX.setVisibility(8);
                    break label4679;
                    paramViewGroup.position = 0;
                    break label4735;
                    ((b)localObject2).neZ.setVisibility(8);
                  }
                  amn localamn;
                  if (paramInt == 4)
                  {
                    if (!((bhc)localObject3).uyu.tKd.isEmpty())
                    {
                      ((b)localObject2).qMZ.setVisibility(0);
                      ((b)localObject2).qxB.setVisibility(0);
                      ((b)localObject2).qNb.setVisibility(0);
                      ((b)localObject2).iin.setMaxLines(1);
                      ((b)localObject2).iin.setTextColor(this.fGo.getResources().getColor(i.c.aQn));
                      localamn = (amn)((bhc)localObject3).uyu.tKd.get(0);
                      ae.bhm().a(localamn, ((b)localObject2).qMZ, i.i.dkW, this.fGo.hashCode(), g.a.qaQ, localan);
                      ((b)localObject2).qxB.setPressed(false);
                      if (Iq(((bhc)localObject3).nas))
                      {
                        ((b)localObject2).qxB.setImageResource(i.e.baP);
                        ((b)localObject2).qMZ.setTag(localObject3);
                        ((b)localObject2).qMZ.setOnClickListener(this.qMO);
                        localamn.pYt = ((com.tencent.mm.plugin.sns.storage.m)localObject1).quQ;
                        ((b)localObject2).qNb.setTag(localObject3);
                        localObject1 = localamn.mCK;
                        if (bg.mZ((String)localObject1)) {
                          break label5314;
                        }
                        ((b)localObject2).qNa.setVisibility(0);
                        ((b)localObject2).qNa.setText((CharSequence)localObject1);
                      }
                      for (;;)
                      {
                        localObject1 = localamn.fuw;
                        if (bg.mZ((String)localObject1)) {
                          break label5326;
                        }
                        ((b)localObject2).iin.setVisibility(0);
                        ((b)localObject2).iin.setTag(paramViewGroup);
                        ((b)localObject2).iin.setOnTouchListener(new ab());
                        ((b)localObject2).iin.setText((CharSequence)localObject1);
                        break;
                        ((b)localObject2).qxB.setImageResource(i.e.baQ);
                        break label5163;
                        ((b)localObject2).qNa.setVisibility(4);
                      }
                      ((b)localObject2).iin.setVisibility(8);
                      break;
                    }
                    ((b)localObject2).qNb.setVisibility(8);
                    break;
                  }
                  ((b)localObject2).iin.setTextColor(this.fGo.getResources().getColor(i.c.pGj));
                  if ((al.a.bhO() & 0x1) <= 0)
                  {
                    paramInt = 1;
                    if (paramInt == 0) {
                      break label5689;
                    }
                    paramViewGroup = av.Ix(((bhc)localObject3).uyu.mDo);
                    localObject1 = ((bhc)localObject3).uyu.fuw;
                    if ((localObject1 == null) || (((String)localObject1).length() <= 40)) {
                      break label5787;
                    }
                    localObject1 = ((String)localObject1).substring(0, 40) + "...";
                  }
                  for (;;)
                  {
                    if (((b)localObject2).qMZ != null) {
                      ((b)localObject2).qMZ.setOnClickListener(null);
                    }
                    ((b)localObject2).qxB.setVisibility(8);
                    if (!((bhc)localObject3).uyu.tKd.isEmpty())
                    {
                      ((b)localObject2).qMZ.setVisibility(0);
                      localamn = (amn)((bhc)localObject3).uyu.tKd.get(0);
                      if (((bhc)localObject3).uyu.tKc == 5)
                      {
                        paramViewGroup = av.Ix(localamn.mDo);
                        localObject1 = localamn.fuw;
                        ((b)localObject2).qxB.setVisibility(0);
                        ae.bhm().a(localamn, ((b)localObject2).qMZ, i.i.dlh, this.fGo.hashCode(), g.a.qaQ, localan);
                        if (bg.mZ(paramViewGroup)) {
                          break label5736;
                        }
                        ((b)localObject2).qNa.setVisibility(0);
                        ((b)localObject2).qNa.setText(paramViewGroup);
                        if (bg.mZ((String)localObject1)) {
                          break label5774;
                        }
                        if (((b)localObject2).qNa.getVisibility() != 8) {
                          break label5749;
                        }
                        ((b)localObject2).iin.setMaxLines(2);
                      }
                    }
                    for (;;)
                    {
                      ((b)localObject2).iin.setVisibility(0);
                      if ((((bhc)localObject3).haU & 0x1) <= 0) {
                        break label5761;
                      }
                      ((b)localObject2).iin.setText(i.a((String)localObject1, this.fGo, ((b)localObject2).iin));
                      break;
                      paramInt = 0;
                      break label5383;
                      paramViewGroup = "";
                      break label5399;
                      ae.bhm().a(localamn, ((b)localObject2).qMZ, this.fGo.hashCode(), g.a.qaQ, localan);
                      break label5585;
                      ((b)localObject2).qMZ.setVisibility(8);
                      break label5585;
                      ((b)localObject2).qNa.setVisibility(8);
                      break label5610;
                      ((b)localObject2).iin.setMaxLines(1);
                    }
                    ((b)localObject2).iin.setText((CharSequence)localObject1);
                    break;
                    ((b)localObject2).iin.setVisibility(8);
                    break;
                  }
                  j = -1;
                }
              }
              j = -1;
            }
            j = -1;
          }
        }
      }
      label5826:
      j = -1;
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(8352100777984L, 62228);
    GMTrace.o(8352100777984L, 62228);
    return 4;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(8352503431168L, 62231);
    super.notifyDataSetChanged();
    GMTrace.o(8352503431168L, 62231);
  }
  
  class a
  {
    View qMR;
    TextView qMS;
    TextView qMT;
    LinearLayout qMU;
    ImageView qMV;
    TextView qMW;
    LinearLayout qMX;
    TextView qMY;
    LinearLayout qwY;
    View qwZ;
    
    a()
    {
      GMTrace.i(8583626358784L, 63953);
      GMTrace.o(8583626358784L, 63953);
    }
    
    public void init()
    {
      GMTrace.i(8583760576512L, 63954);
      this.qMS.setVisibility(8);
      this.qMT.setVisibility(8);
      this.qMU.setVisibility(4);
      this.qMV.setVisibility(4);
      this.qwZ.setVisibility(8);
      this.qMW.setVisibility(8);
      this.qMX.setVisibility(8);
      GMTrace.o(8583760576512L, 63954);
    }
  }
  
  final class b
    extends at.a
  {
    TextView iin;
    TextView neZ;
    TagImageView qMZ;
    TextView qNa;
    View qNb;
    ImageView qxB;
    
    b()
    {
      super();
      GMTrace.i(8738782052352L, 65109);
      GMTrace.o(8738782052352L, 65109);
    }
    
    public final void init()
    {
      GMTrace.i(8738916270080L, 65110);
      super.init();
      this.neZ.setVisibility(8);
      this.qMZ.setVisibility(8);
      this.qxB.setVisibility(8);
      this.iin.setVisibility(8);
      this.qNa.setVisibility(8);
      GMTrace.o(8738916270080L, 65110);
    }
  }
  
  public static abstract interface c {}
  
  final class d
    extends at.a
  {
    MaskImageView qNc;
    QFadeImageView qNd;
    QFadeImageView qNe;
    QFadeImageView qNf;
    TextView qNg;
    TextView qNh;
    TextView qNi;
    TextView qNj;
    View qNk;
    TextView qNl;
    TextView qNm;
    TextView qNn;
    TextView qNo;
    TextView qNp;
    TextView qNq;
    MaskLinearLayout qNr;
    TextView qpt;
    
    d()
    {
      super();
      GMTrace.i(8385118339072L, 62474);
      GMTrace.o(8385118339072L, 62474);
    }
    
    public final void init()
    {
      GMTrace.i(8385252556800L, 62475);
      super.init();
      this.qNc.setVisibility(8);
      this.qNe.setVisibility(8);
      this.qNf.setVisibility(8);
      this.qpt.setVisibility(8);
      this.qNg.setVisibility(8);
      this.qNh.setVisibility(8);
      this.qNi.setVisibility(8);
      this.qNj.setVisibility(8);
      this.qNk.setVisibility(8);
      this.qNd.setVisibility(8);
      this.qNl.setVisibility(8);
      this.qNm.setVisibility(8);
      this.qNn.setVisibility(8);
      this.qNo.setVisibility(8);
      this.qNp.setVisibility(8);
      this.qNq.setVisibility(8);
      if (com.tencent.mm.ui.ab.dZ(at.a(at.this)) > 1.0F) {
        this.qpt.setMaxLines(2);
      }
      GMTrace.o(8385252556800L, 62475);
    }
  }
  
  final class e
    extends at.a
  {
    MaskImageView qNc;
    View qNk;
    TextView qNl;
    MaskLinearLayout qNr;
    TextView qpt;
    
    e()
    {
      super();
      GMTrace.i(8424846786560L, 62770);
      GMTrace.o(8424846786560L, 62770);
    }
    
    public final void init()
    {
      GMTrace.i(8424981004288L, 62771);
      super.init();
      this.qNc.setVisibility(8);
      this.qpt.setVisibility(8);
      this.qNl.setVisibility(8);
      this.qNk.setVisibility(8);
      if (com.tencent.mm.ui.ab.dZ(at.a(at.this)) > 1.0F) {
        this.qpt.setMaxLines(2);
      }
      GMTrace.o(8424981004288L, 62771);
    }
  }
  
  static abstract class f
  {
    View.OnClickListener qNs;
    View.OnClickListener qNt;
    View.OnClickListener qNu;
    public a qNv;
    View.OnClickListener qwP;
    View.OnClickListener qwQ;
    View.OnClickListener qwR;
    
    public f()
    {
      GMTrace.i(8550743015424L, 63708);
      this.qNv = new a();
      this.qwP = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8600672010240L, 64080);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8600672010240L, 64080);
            return;
          }
          at.f.this.qNv = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qNv.pYt;
          int j = at.f.this.qNv.position;
          at.f.this.de(i, j);
          GMTrace.o(8600672010240L, 64080);
        }
      };
      this.qwQ = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8425517875200L, 62775);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8425517875200L, 62775);
            return;
          }
          at.f.this.qNv = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qNv.pYt;
          int j = at.f.this.qNv.position;
          at.f.this.de(i, j + 1);
          GMTrace.o(8425517875200L, 62775);
        }
      };
      this.qwR = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8759854235648L, 65266);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8759854235648L, 65266);
            return;
          }
          at.f.this.qNv = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qNv.pYt;
          int j = at.f.this.qNv.position;
          at.f.this.de(i, j + 2);
          GMTrace.o(8759854235648L, 65266);
        }
      };
      this.qNs = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8710462111744L, 64898);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8710462111744L, 64898);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "sign click");
          at.f.this.qNv = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qNv.pYt;
          int j = at.f.this.qNv.position;
          at.f.this.df(i, j + 2);
          GMTrace.o(8710462111744L, 64898);
        }
      };
      this.qNt = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8502424633344L, 63348);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8502424633344L, 63348);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "sign click");
          at.f.this.qNv = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qNv.pYt;
          at.f.this.vc(i);
          GMTrace.o(8502424633344L, 63348);
        }
      };
      this.qNu = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8504572116992L, 63364);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(8504572116992L, 63364);
            return;
          }
          w.d("MicroMsg.SnsphotoAdapter", "snssight click");
          at.f.this.qNv = ((at.f.a)paramAnonymousView.getTag());
          int i = at.f.this.qNv.pYt;
          int j = at.f.this.qNv.position;
          at.f.this.df(i, j + 2);
          GMTrace.o(8504572116992L, 63364);
        }
      };
      GMTrace.o(8550743015424L, 63708);
    }
    
    public abstract void de(int paramInt1, int paramInt2);
    
    public abstract void df(int paramInt1, int paramInt2);
    
    public abstract void vc(int paramInt);
    
    public static final class a
    {
      public int pYt;
      public int position;
      
      public a()
      {
        GMTrace.i(8701737959424L, 64833);
        GMTrace.o(8701737959424L, 64833);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */