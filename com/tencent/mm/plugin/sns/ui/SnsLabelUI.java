package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.u;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.AnimatedExpandableListView;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SnsLabelUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  public static int[] qKu;
  private boolean qKA;
  private boolean qKB;
  private boolean qKC;
  private boolean qKD;
  private int qKE;
  private q qKF;
  private String qKG;
  private int qKH;
  private ArrayList<String> qKI;
  private ArrayList<String> qKJ;
  private ArrayList<Long> qKK;
  private ArrayList<String[]> qKL;
  private AnimatedExpandableListView qKt;
  private ArrayList<String> qKv;
  private String qKw;
  private String qKx;
  aq qKy;
  private int qKz;
  
  static
  {
    GMTrace.i(8489673949184L, 63253);
    qKu = new int[] { i.j.pSS, i.j.pSQ, i.j.pSM, i.j.pSF };
    GMTrace.o(8489673949184L, 63253);
  }
  
  public SnsLabelUI()
  {
    GMTrace.i(8484976328704L, 63218);
    this.qKz = 0;
    this.qKB = false;
    this.qKC = false;
    this.qKD = false;
    GMTrace.o(8484976328704L, 63218);
  }
  
  private void bB(List<String[]> paramList)
  {
    GMTrace.i(8486855376896L, 63232);
    if ((this.qKJ == null) || (this.qKJ.size() == 0))
    {
      GMTrace.o(8486855376896L, 63232);
      return;
    }
    Iterator localIterator = this.qKJ.iterator();
    paramList = paramList.iterator();
    ArrayList localArrayList1 = new ArrayList(this.qKJ.size());
    ArrayList localArrayList2 = new ArrayList(this.qKJ.size());
    while (localIterator.hasNext())
    {
      localArrayList1.add(a.aIM().Aq((String)localIterator.next()));
      localArrayList2.add(bg.c(Arrays.asList((Object[])paramList.next()), ","));
      this.qKC = true;
    }
    a.aIM().h(localArrayList1, localArrayList2);
    GMTrace.o(8486855376896L, 63232);
  }
  
  private void bnj()
  {
    GMTrace.i(8485915852800L, 63225);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ktag_range_index", this.qKz);
    if ((this.qKz == 2) || (this.qKz == 3))
    {
      localIntent.putExtra("Klabel_name_list", this.qKw);
      localIntent.putExtra("Kother_user_name_list", this.qKx);
    }
    setResult(-1, localIntent);
    finish();
    GMTrace.o(8485915852800L, 63225);
  }
  
  private static int bnl()
  {
    GMTrace.i(8486586941440L, 63230);
    com.tencent.mm.kernel.h.xA();
    int i = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(335874, Integer.valueOf(0))).intValue();
    GMTrace.o(8486586941440L, 63230);
    return i;
  }
  
  private void bnm()
  {
    GMTrace.i(8486721159168L, 63231);
    g.paX.i(11455, new Object[] { "", "", Integer.valueOf(this.qKH), Integer.valueOf(0) });
    com.tencent.mm.kernel.h.xA();
    int i = ((Integer)com.tencent.mm.kernel.h.xz().xi().get(335874, Integer.valueOf(0))).intValue();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xz().xi().set(335874, Integer.valueOf(i + 1));
    this.qKJ = null;
    this.qKD = false;
    this.qKC = false;
    if ((this.qKF != null) && (this.qKF.isShowing())) {
      this.qKF.dismiss();
    }
    if (this.qKB)
    {
      this.qKB = false;
      GMTrace.o(8486721159168L, 63231);
      return;
    }
    i = i.j.pSV;
    if (bnl() > 1) {
      i = i.j.pSU;
    }
    com.tencent.mm.ui.base.h.a(this, i, i.j.dwr, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(8634360659968L, 64331);
        GMTrace.o(8634360659968L, 64331);
      }
    });
    GMTrace.o(8486721159168L, 63231);
  }
  
  private void goBack()
  {
    GMTrace.i(8485781635072L, 63224);
    int j = 0;
    int k = this.qKy.qKS;
    int i;
    if (this.qKy.qKS != this.qKz) {
      if (((k == 2) && ((this.qKy.qKU.size() != 0) || (this.qKy.qKW.size() != 0))) || ((k == 3) && ((this.qKy.qKV.size() != 0) || (this.qKy.qKX.size() != 0)))) {
        i = 1;
      }
    }
    while (i != 0)
    {
      com.tencent.mm.ui.base.h.a(this, true, getString(i.j.pSL), "", getString(i.j.pSK), getString(i.j.pSJ), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8513564704768L, 63431);
          SnsLabelUI.l(SnsLabelUI.this);
          GMTrace.o(8513564704768L, 63431);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(8643755900928L, 64401);
          SnsLabelUI.m(SnsLabelUI.this);
          GMTrace.o(8643755900928L, 64401);
        }
      });
      GMTrace.o(8485781635072L, 63224);
      return;
      if (k != 1)
      {
        i = j;
        if (k != 0) {}
      }
      else
      {
        i = 1;
        continue;
        if ((k != 2) || (this.qKy.qKU.size() == 0) || ((bg.c(this.qKy.qKU, ",").equals(this.qKw)) && (bg.c(this.qKy.qKW, ",").equals(this.qKx))))
        {
          i = j;
          if (k != 3) {
            continue;
          }
          i = j;
          if (this.qKy.qKV.size() == 0) {
            continue;
          }
          if (bg.c(this.qKy.qKV, ",").equals(this.qKw))
          {
            i = j;
            if (bg.c(this.qKy.qKX, ",").equals(this.qKx)) {
              continue;
            }
          }
        }
        i = 1;
      }
    }
    bnj();
    GMTrace.o(8485781635072L, 63224);
  }
  
  protected final void MH()
  {
    GMTrace.i(8485513199616L, 63222);
    boolean bool = getIntent().getBooleanExtra("Ktag_rangeFilterprivate", false);
    this.qKt = ((AnimatedExpandableListView)findViewById(i.f.pMj));
    this.qKv = ((ArrayList)a.aIM().aIH());
    this.qKy.qKT = bool;
    this.qKy.S(this.qKv);
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, -2);
    localLayoutParams.height = getResources().getDimensionPixelSize(i.d.aRT);
    View localView = new View(this);
    localView.setLayoutParams(localLayoutParams);
    this.qKt.addHeaderView(localView);
    this.qKt.setAdapter(this.qKy);
    if (this.qKy.qKS == 2) {
      this.qKt.expandGroup(2);
    }
    for (;;)
    {
      this.qKt.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener()
      {
        public final boolean onGroupClick(ExpandableListView paramAnonymousExpandableListView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8442160873472L, 62899);
          int i = SnsLabelUI.a(SnsLabelUI.this).qKS;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: %d    onGroupClick:%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt) });
          if (paramAnonymousInt > 1)
          {
            if ((SnsLabelUI.b(SnsLabelUI.this) != null) && (SnsLabelUI.b(SnsLabelUI.this).size() != 0) && (SnsLabelUI.bnn() == 0))
            {
              SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt);
              SnsLabelUI.c(SnsLabelUI.this);
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
              GMTrace.o(8442160873472L, 62899);
              return true;
            }
            if (SnsLabelUI.d(SnsLabelUI.this))
            {
              SnsLabelUI.e(SnsLabelUI.this);
              SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt);
              SnsLabelUI.a(SnsLabelUI.this, com.tencent.mm.ui.base.h.a(SnsLabelUI.this, SnsLabelUI.this.getString(i.j.pSO), false, null));
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
              GMTrace.o(8442160873472L, 62899);
              return true;
            }
            if ((SnsLabelUI.a(SnsLabelUI.this).qKR == null) || (SnsLabelUI.a(SnsLabelUI.this).qKR.size() == 0))
            {
              SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt);
              SnsLabelUI.f(SnsLabelUI.this);
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[previousGroup: gotoSelectContact]");
              GMTrace.o(8442160873472L, 62899);
              return true;
            }
            if (i == paramAnonymousInt)
            {
              if (SnsLabelUI.g(SnsLabelUI.this).isGroupExpanded(paramAnonymousInt)) {
                SnsLabelUI.g(SnsLabelUI.this).AT(paramAnonymousInt);
              }
              for (;;)
              {
                SnsLabelUI.a(SnsLabelUI.this).qKS = paramAnonymousInt;
                GMTrace.o(8442160873472L, 62899);
                return true;
                SnsLabelUI.g(SnsLabelUI.this).AS(paramAnonymousInt);
              }
            }
            if (i == 2)
            {
              SnsLabelUI.g(SnsLabelUI.this).collapseGroup(2);
              SnsLabelUI.a(SnsLabelUI.this).qKU.clear();
              SnsLabelUI.a(SnsLabelUI.this).qKW.clear();
            }
            for (;;)
            {
              SnsLabelUI.g(SnsLabelUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(8328075804672L, 62049);
                  SnsLabelUI.g(SnsLabelUI.this).AS(paramAnonymousInt);
                  GMTrace.o(8328075804672L, 62049);
                }
              });
              break;
              if (i == 3)
              {
                SnsLabelUI.g(SnsLabelUI.this).collapseGroup(3);
                SnsLabelUI.a(SnsLabelUI.this).qKV.clear();
                SnsLabelUI.a(SnsLabelUI.this).qKX.clear();
              }
            }
          }
          if (i > 1) {
            SnsLabelUI.g(SnsLabelUI.this).AT(i);
          }
          SnsLabelUI.a(SnsLabelUI.this).qKS = paramAnonymousInt;
          GMTrace.o(8442160873472L, 62899);
          return false;
        }
      });
      this.qKt.setOnChildClickListener(new ExpandableListView.OnChildClickListener()
      {
        public final boolean onChildClick(ExpandableListView paramAnonymousExpandableListView, View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong)
        {
          GMTrace.i(8767370428416L, 65322);
          if (paramAnonymousInt2 == SnsLabelUI.a(SnsLabelUI.this).getChildrenCount(paramAnonymousInt1) - 1)
          {
            SnsLabelUI.a(SnsLabelUI.this, paramAnonymousInt1);
            SnsLabelUI.f(SnsLabelUI.this);
          }
          for (;;)
          {
            GMTrace.o(8767370428416L, 65322);
            return false;
            paramAnonymousExpandableListView = (String)SnsLabelUI.a(SnsLabelUI.this).getChild(paramAnonymousInt1, paramAnonymousInt2);
            SnsLabelUI.a(SnsLabelUI.this);
            aq.Im(paramAnonymousExpandableListView);
            if (paramAnonymousInt1 == 2) {
              SnsLabelUI.a(SnsLabelUI.this, 1, SnsLabelUI.a(SnsLabelUI.this).qKU, paramAnonymousExpandableListView, paramAnonymousView);
            } else if (paramAnonymousInt1 == 3) {
              SnsLabelUI.a(SnsLabelUI.this, 2, SnsLabelUI.a(SnsLabelUI.this).qKV, paramAnonymousExpandableListView, paramAnonymousView);
            }
          }
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8493163610112L, 63279);
          SnsLabelUI.h(SnsLabelUI.this);
          GMTrace.o(8493163610112L, 63279);
          return true;
        }
      });
      a(0, getString(i.j.pSH), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8726299803648L, 65016);
          paramAnonymousMenuItem = SnsLabelUI.this;
          String str1 = bg.c(paramAnonymousMenuItem.qKy.qKU, ",");
          String str2 = bg.c(paramAnonymousMenuItem.qKy.qKW, ",");
          String str3 = bg.c(paramAnonymousMenuItem.qKy.qKV, ",");
          String str4 = bg.c(paramAnonymousMenuItem.qKy.qKX, ",");
          if (((paramAnonymousMenuItem.qKy.qKS == 2) && (paramAnonymousMenuItem.qKy.qKU.size() == 0) && (paramAnonymousMenuItem.qKy.qKW.size() == 0)) || ((paramAnonymousMenuItem.qKy.qKS == 3) && (paramAnonymousMenuItem.qKy.qKV.size() == 0) && (paramAnonymousMenuItem.qKy.qKX.size() == 0))) {
            com.tencent.mm.ui.base.h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(i.j.pSP), "", paramAnonymousMenuItem.getString(i.j.pSW), null);
          }
          for (;;)
          {
            GMTrace.o(8726299803648L, 65016);
            return true;
            if (((paramAnonymousMenuItem.qKy.qKS == 2) && (bg.mZ(str1)) && (bg.mZ(str2))) || ((paramAnonymousMenuItem.qKy.qKS == 3) && (bg.mZ(str3)) && (bg.mZ(str4)))) {
              com.tencent.mm.ui.base.h.a(paramAnonymousMenuItem, paramAnonymousMenuItem.getString(i.j.pSP), "", paramAnonymousMenuItem.getString(i.j.pSW), null);
            } else {
              paramAnonymousMenuItem.bnk();
            }
          }
        }
      }, p.b.vpB);
      GMTrace.o(8485513199616L, 63222);
      return;
      if (this.qKy.qKS == 3) {
        this.qKt.expandGroup(3);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8486452723712L, 63229);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (!this.qKC)
    {
      GMTrace.o(8486452723712L, 63229);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(8486452723712L, 63229);
      return;
      Object localObject;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        localObject = ae.bhu().getCursor();
        this.qKH = ((Cursor)localObject).getCount();
        if (this.qKH > 0)
        {
          ((Cursor)localObject).moveToFirst();
          s locals = new s();
          paramInt1 = ((Cursor)localObject).getCount();
          this.qKJ = new ArrayList(paramInt1);
          this.qKI = new ArrayList(paramInt1);
          this.qKL = new ArrayList(paramInt1);
          this.qKK = new ArrayList(paramInt1);
          if (!((Cursor)localObject).isAfterLast())
          {
            locals.b((Cursor)localObject);
            if ((locals.field_memberList != null) && (locals.field_memberList.length() != 0))
            {
              this.qKL.add(locals.field_memberList.split(","));
              paramk = locals.field_tagName;
              ArrayList localArrayList = this.qKJ;
              paramString = a.aIM().aIJ();
              if (paramString == null)
              {
                paramString = paramk;
                label304:
                localArrayList.add(paramString);
                this.qKI.add(paramk);
                this.qKK.add(Long.valueOf(locals.field_tagId));
              }
            }
            for (;;)
            {
              ((Cursor)localObject).moveToNext();
              break;
              if (!paramString.contains(paramk))
              {
                paramString = paramk;
                break label304;
              }
              paramString = String.format(getString(i.j.pSI), new Object[] { paramk });
              break label304;
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsLabelUI", "dz:snstaginfo memberlist is null.");
            }
          }
          ((Cursor)localObject).close();
          if (this.qKI.size() != 0) {
            break label519;
          }
          paramInt1 = 0;
          if (paramInt1 != 0) {}
        }
        else if (this.qKD)
        {
          this.qKy.qKS = this.qKE;
          this.qKt.AS(this.qKE);
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xz().xi().set(335873, Boolean.valueOf(false));
        }
        ((Cursor)localObject).close();
        if (this.qKB)
        {
          this.qKC = true;
          a.aIM().aI(this.qKJ);
        }
      }
      for (;;)
      {
        this.qKD = false;
        GMTrace.o(8486452723712L, 63229);
        return;
        label519:
        paramInt1 = 1;
        break;
        this.qKC = false;
        continue;
        bnm();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at get sns tag list!");
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bB(this.qKL);
        GMTrace.o(8486452723712L, 63229);
        return;
      }
      bnm();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at add contact label!");
      GMTrace.o(8486452723712L, 63229);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.qKI.iterator();
        paramk = this.qKK.iterator();
        while (paramString.hasNext())
        {
          long l = ((Long)paramk.next()).longValue();
          localObject = (String)paramString.next();
          if (l != 0L)
          {
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(new com.tencent.mm.plugin.sns.model.w(l, (String)localObject), 0);
          }
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(335874, Integer.valueOf(0));
        this.qKv = ((ArrayList)a.aIM().aIH());
        g.paX.i(11455, new Object[] { "", "", Integer.valueOf(this.qKH), Integer.valueOf(this.qKJ.size()) });
        this.qKt.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8324317708288L, 62021);
            SnsLabelUI.a(SnsLabelUI.this).qKS = SnsLabelUI.k(SnsLabelUI.this);
            if (SnsLabelUI.j(SnsLabelUI.this) == null) {
              SnsLabelUI.a(SnsLabelUI.this, SnsLabelUI.b(SnsLabelUI.this));
            }
            while (SnsLabelUI.b(SnsLabelUI.this) != null)
            {
              localObject = SnsLabelUI.b(SnsLabelUI.this).iterator();
              while (((Iterator)localObject).hasNext())
              {
                SnsLabelUI.a(SnsLabelUI.this);
                aq.Im((String)((Iterator)localObject).next());
              }
              SnsLabelUI.j(SnsLabelUI.this).addAll(SnsLabelUI.b(SnsLabelUI.this));
            }
            Object localObject = new HashSet(SnsLabelUI.j(SnsLabelUI.this));
            SnsLabelUI.j(SnsLabelUI.this).clear();
            SnsLabelUI.j(SnsLabelUI.this).addAll((Collection)localObject);
            SnsLabelUI.a(SnsLabelUI.this).S(SnsLabelUI.j(SnsLabelUI.this));
            SnsLabelUI.a(SnsLabelUI.this).notifyDataSetChanged();
            SnsLabelUI.g(SnsLabelUI.this).AS(SnsLabelUI.a(SnsLabelUI.this).qKS);
            if (SnsLabelUI.b(SnsLabelUI.this) != null) {
              SnsLabelUI.b(SnsLabelUI.this).clear();
            }
            SnsLabelUI.n(SnsLabelUI.this);
            ((HashSet)localObject).clear();
            if ((SnsLabelUI.o(SnsLabelUI.this) != null) && (SnsLabelUI.o(SnsLabelUI.this).isShowing())) {
              SnsLabelUI.o(SnsLabelUI.this).dismiss();
            }
            GMTrace.o(8324317708288L, 62021);
          }
        }, 600L);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(335873, Boolean.valueOf(false));
        GMTrace.o(8486452723712L, 63229);
        return;
      }
      bnm();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at modify label list!");
      GMTrace.o(8486452723712L, 63229);
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz: error at delete tag list!");
      }
    }
  }
  
  final void bnk()
  {
    GMTrace.i(8486050070528L, 63226);
    Intent localIntent = new Intent();
    if (this.qKy.qKS == 2)
    {
      this.qKw = bg.c(this.qKy.qKU, ",");
      this.qKx = bg.c(this.qKy.qKW, ",");
      localIntent.putExtra("Klabel_name_list", this.qKw);
      localIntent.putExtra("Kother_user_name_list", this.qKx);
    }
    for (;;)
    {
      localIntent.putExtra("Ktag_range_index", this.qKy.qKS);
      setResult(-1, localIntent);
      finish();
      GMTrace.o(8486050070528L, 63226);
      return;
      if (this.qKy.qKS == 3)
      {
        this.qKw = bg.c(this.qKy.qKV, ",");
        this.qKx = bg.c(this.qKy.qKX, ",");
        localIntent.putExtra("Klabel_name_list", this.qKw);
        localIntent.putExtra("Kother_user_name_list", this.qKx);
      }
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8485244764160L, 63220);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      goBack();
      GMTrace.o(8485244764160L, 63220);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8485244764160L, 63220);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8485110546432L, 63219);
    int i = i.g.pOU;
    GMTrace.o(8485110546432L, 63219);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8485647417344L, 63223);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    final Object localObject;
    if ((paramInt2 == -1) && (paramInt1 == 4003))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "the Activity completed");
      localObject = paramIntent.getStringExtra("Select_Contacts_To_Create_New_Label");
      if (!bg.mZ((String)localObject))
      {
        paramIntent = new Intent();
        paramIntent.putExtra("Select_Contact", (String)localObject);
        d.b(this.vov.voR, "label", ".ui.ContactLabelEditUI", paramIntent, 4002);
        GMTrace.o(8485647417344L, 63223);
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      this.qKx = new String(paramIntent);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { paramIntent });
      if (this.qKE == 2)
      {
        this.qKy.qKW.clear();
        if (!bg.mZ(paramIntent))
        {
          paramIntent = bg.f(paramIntent.split(","));
          this.qKy.qKW.addAll(paramIntent);
          this.qKy.qKS = this.qKE;
        }
      }
      for (;;)
      {
        this.qKy.notifyDataSetChanged();
        this.qKt.expandGroup(this.qKE);
        GMTrace.o(8485647417344L, 63223);
        return;
        if (this.qKE == 3)
        {
          this.qKy.qKX.clear();
          if (!bg.mZ(paramIntent))
          {
            paramIntent = bg.f(paramIntent.split(","));
            this.qKy.qKX.addAll(paramIntent);
            this.qKy.qKS = this.qKE;
          }
        }
      }
    }
    if ((paramInt2 == -1) && (paramInt1 == 4001))
    {
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", new Object[] { paramIntent });
      if (!bg.mZ(paramIntent))
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("Select_Contact", paramIntent);
        d.b(this, "label", ".ui.ContactLabelEditUI", (Intent)localObject, 4002);
      }
      GMTrace.o(8485647417344L, 63223);
      return;
    }
    if ((paramInt2 == 0) && (paramInt1 == 4002) && (paramIntent != null))
    {
      localObject = paramIntent.getStringExtra("k_sns_label_add_label");
      this.qKG = paramIntent.getStringExtra("k_sns_label_add_label");
      this.qKt.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8495579529216L, 63297);
          SnsLabelUI.a(SnsLabelUI.this, (ArrayList)a.aIM().aIH());
          if (SnsLabelUI.j(SnsLabelUI.this) == null) {
            SnsLabelUI.a(SnsLabelUI.this, new ArrayList());
          }
          if (!bg.mZ(localObject)) {
            if (!SnsLabelUI.j(SnsLabelUI.this).contains(localObject)) {
              SnsLabelUI.j(SnsLabelUI.this).add(localObject);
            }
          }
          for (int i = SnsLabelUI.j(SnsLabelUI.this).indexOf(localObject);; i = -1)
          {
            SnsLabelUI.a(SnsLabelUI.this).S(SnsLabelUI.j(SnsLabelUI.this));
            SnsLabelUI.a(SnsLabelUI.this).qKS = SnsLabelUI.k(SnsLabelUI.this);
            if ((!bg.mZ(localObject)) && (i != -1))
            {
              if (SnsLabelUI.k(SnsLabelUI.this) != 2) {
                break label237;
              }
              SnsLabelUI.a(SnsLabelUI.this).qKU.add(localObject);
              SnsLabelUI.a(SnsLabelUI.this).qKW.clear();
            }
            for (;;)
            {
              SnsLabelUI.a(SnsLabelUI.this).notifyDataSetChanged();
              SnsLabelUI.g(SnsLabelUI.this).expandGroup(SnsLabelUI.k(SnsLabelUI.this));
              GMTrace.o(8495579529216L, 63297);
              return;
              label237:
              if (SnsLabelUI.k(SnsLabelUI.this) == 3)
              {
                SnsLabelUI.a(SnsLabelUI.this).qKV.add(localObject);
                SnsLabelUI.a(SnsLabelUI.this).qKX.clear();
              }
            }
          }
        }
      }, 300L);
    }
    GMTrace.o(8485647417344L, 63223);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8485378981888L, 63221);
    super.onCreate(paramBundle);
    oC(i.j.pTV);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(292, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(635, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(638, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(290, this);
    this.qKy = new aq(this);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      this.qKz = 0;
      this.qKy.style = 0;
      this.qKw = null;
      this.qKx = null;
      this.qKy.qKS = this.qKz;
      if (this.qKy.style == 1) {
        findViewById(i.f.pMk).setBackgroundResource(i.c.black);
      }
      if (this.qKz != 2) {
        break label411;
      }
      if (!TextUtils.isEmpty(this.qKw)) {
        this.qKy.qKU = ((ArrayList)bg.f(this.qKw.split(",")));
      }
      if (!TextUtils.isEmpty(this.qKx)) {
        this.qKy.qKW = ((ArrayList)bg.f(this.qKx.split(",")));
      }
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xA();
      this.qKA = ((Boolean)com.tencent.mm.kernel.h.xz().xi().get(335873, Boolean.valueOf(true))).booleanValue();
      if (this.qKA)
      {
        this.qKC = true;
        this.qKD = true;
        if (bnl() > 0) {
          this.qKB = true;
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new u(1), 0);
      }
      MH();
      GMTrace.o(8485378981888L, 63221);
      return;
      this.qKz = paramBundle.getIntExtra("KLabel_range_index", 0);
      this.qKy.style = paramBundle.getIntExtra("k_sns_label_ui_style", 0);
      this.qKw = paramBundle.getStringExtra("Klabel_name_list");
      this.qKx = paramBundle.getStringExtra("Kother_user_name_list");
      if (TextUtils.isEmpty(paramBundle.getStringExtra("k_sns_label_ui_title"))) {
        break;
      }
      rV(paramBundle.getStringExtra("k_sns_label_ui_title"));
      break;
      label411:
      if (this.qKz == 3)
      {
        if (!TextUtils.isEmpty(this.qKw)) {
          this.qKy.qKV = ((ArrayList)bg.f(this.qKw.split(",")));
        }
        if (!TextUtils.isEmpty(this.qKx)) {
          this.qKy.qKX = ((ArrayList)bg.f(this.qKx.split(",")));
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8486184288256L, 63227);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(292, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(635, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(638, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(290, this);
    super.onDestroy();
    GMTrace.o(8486184288256L, 63227);
  }
  
  public void onResume()
  {
    GMTrace.i(8486318505984L, 63228);
    if ((this.qKy != null) && (this.qKG == null))
    {
      this.qKv = ((ArrayList)a.aIM().aIH());
      this.qKy.S(this.qKv);
      if (((this.qKv == null) || (this.qKv.size() == 0)) && ((this.qKx == null) || (this.qKx.length() == 0)) && (this.qKy.qKS != 0) && (this.qKy.qKS != 1)) {
        this.qKy.qKS = 0;
      }
      this.qKy.notifyDataSetChanged();
    }
    this.qKG = null;
    super.onResume();
    GMTrace.o(8486318505984L, 63228);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsLabelUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */