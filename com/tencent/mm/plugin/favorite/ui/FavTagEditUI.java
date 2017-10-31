package com.tencent.mm.plugin.favorite.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.a.c;
import com.tencent.mm.plugin.favorite.ui.a.d;
import com.tencent.mm.plugin.favorite.ui.base.FavTagPanel;
import com.tencent.mm.protocal.c.te;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.protocal.c.tg;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavTagEditUI
  extends MMActivity
{
  private j lSF;
  private List<String> lSG;
  private FavTagPanel lSH;
  private FavTagPanel lSI;
  private ListView lSJ;
  private ListView lSK;
  private TextView lSL;
  private c lSM;
  private d lSN;
  private boolean lSO;
  
  public FavTagEditUI()
  {
    GMTrace.i(6322191859712L, 47104);
    GMTrace.o(6322191859712L, 47104);
  }
  
  private void axJ()
  {
    GMTrace.i(6322594512896L, 47107);
    if (this.lSO)
    {
      w.w("MicroMsg.FavTagEditUI", "match max length, disable finish button");
      if (bUw()) {
        W(0, false);
      }
      GMTrace.o(6322594512896L, 47107);
      return;
    }
    if (this.lSF == null)
    {
      if ((this.lSI.tQK.size() <= 0) && (this.lSI.bXq().length() <= 0))
      {
        if (bUw())
        {
          W(0, false);
          GMTrace.o(6322594512896L, 47107);
        }
      }
      else if (!bUw())
      {
        W(0, true);
        GMTrace.o(6322594512896L, 47107);
      }
    }
    else if ((this.lSF.field_tagProto.tQM.size() != this.lSI.tQK.size()) || (this.lSI.bXq().length() > 0))
    {
      if (!bUw())
      {
        W(0, true);
        GMTrace.o(6322594512896L, 47107);
      }
    }
    else
    {
      ArrayList localArrayList = this.lSI.bXv();
      int i = 0;
      while (i < localArrayList.size())
      {
        if (!((String)localArrayList.get(i)).equals(this.lSF.field_tagProto.tQM.get(i)))
        {
          if (!bUw()) {
            W(0, true);
          }
          GMTrace.o(6322594512896L, 47107);
          return;
        }
        i += 1;
      }
      if (bUw()) {
        W(0, false);
      }
    }
    GMTrace.o(6322594512896L, 47107);
  }
  
  private void axK()
  {
    GMTrace.i(6322997166080L, 47110);
    com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.dXx), "", getString(R.l.dur), getString(R.l.duP), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6440303460352L, 47984);
        FavTagEditUI.this.finish();
        GMTrace.o(6440303460352L, 47984);
      }
    }, null);
    GMTrace.o(6322997166080L, 47110);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6322326077440L, 47105);
    int i = R.i.cUo;
    GMTrace.o(6322326077440L, 47105);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6322460295168L, 47106);
    super.onCreate(paramBundle);
    final long l = getIntent().getLongExtra("key_fav_item_id", -1L);
    if (-1L != l) {
      this.lSF = com.tencent.mm.plugin.favorite.h.awD().cc(l);
    }
    this.lSG = getIntent().getStringArrayListExtra("key_fav_result_list");
    this.lSI = ((FavTagPanel)findViewById(R.h.bHt));
    this.lSJ = ((ListView)findViewById(R.h.czM));
    this.lSK = ((ListView)findViewById(R.h.ctQ));
    this.lSL = ((TextView)findViewById(R.h.cbE));
    this.lSI.lw(true);
    this.lSI.Bv(R.g.bdN);
    this.lSI.vJh = true;
    this.lSI.vJd = new MMTagPanel.a()
    {
      public final void asn()
      {
        GMTrace.i(6373865684992L, 47489);
        GMTrace.o(6373865684992L, 47489);
      }
      
      public final void h(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        GMTrace.i(6373999902720L, 47490);
        FavTagEditUI.a(FavTagEditUI.this, paramAnonymousBoolean);
        TextView localTextView = FavTagEditUI.k(FavTagEditUI.this);
        if ((FavTagEditUI.b(FavTagEditUI.this)) && (paramAnonymousInt > 0)) {}
        for (int i = 0;; i = 8)
        {
          localTextView.setVisibility(i);
          FavTagEditUI.k(FavTagEditUI.this).setText(FavTagEditUI.this.getString(R.l.dYe, new Object[] { Integer.valueOf(paramAnonymousInt) }));
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6373999902720L, 47490);
          return;
        }
      }
      
      public final void vX(String paramAnonymousString)
      {
        GMTrace.i(6373194596352L, 47484);
        FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
        FavTagEditUI.f(FavTagEditUI.this).xx(paramAnonymousString);
        if (FavTagEditUI.g(FavTagEditUI.this) != null) {
          FavTagEditUI.g(FavTagEditUI.this).aY(paramAnonymousString, false);
        }
        FavTagEditUI.c(FavTagEditUI.this);
        GMTrace.o(6373194596352L, 47484);
      }
      
      public final void vY(String paramAnonymousString)
      {
        GMTrace.i(6373328814080L, 47485);
        GMTrace.o(6373328814080L, 47485);
      }
      
      public final void vZ(String paramAnonymousString)
      {
        GMTrace.i(6373463031808L, 47486);
        FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
        FavTagEditUI.f(FavTagEditUI.this).xx(paramAnonymousString);
        if (FavTagEditUI.g(FavTagEditUI.this) != null) {
          FavTagEditUI.g(FavTagEditUI.this).aY(paramAnonymousString, false);
        }
        FavTagEditUI.c(FavTagEditUI.this);
        GMTrace.o(6373463031808L, 47486);
      }
      
      public final void wa(String paramAnonymousString)
      {
        GMTrace.i(6373597249536L, 47487);
        if (!bg.mZ(paramAnonymousString))
        {
          d locald = FavTagEditUI.h(FavTagEditUI.this);
          locald.lTN.clear();
          locald.lTM.clear();
          locald.lTL = bg.ap(paramAnonymousString, "");
          Object localObject = com.tencent.mm.plugin.favorite.h.aww();
          boolean bool = bg.mZ(paramAnonymousString);
          ArrayList localArrayList = new ArrayList(16);
          localObject = ((t)localObject).lOP.tQK.iterator();
          while (((Iterator)localObject).hasNext())
          {
            Iterator localIterator = ((tf)((Iterator)localObject).next()).tQJ.iterator();
            while (localIterator.hasNext())
            {
              te localte = (te)localIterator.next();
              if ((bool) || (localte.svi.contains(paramAnonymousString))) {
                localArrayList.add(localte.svi);
              }
            }
          }
          locald.lTM.addAll(localArrayList);
          locald.notifyDataSetChanged();
          FavTagEditUI.i(FavTagEditUI.this).setVisibility(0);
          FavTagEditUI.j(FavTagEditUI.this).setVisibility(8);
        }
        for (;;)
        {
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6373597249536L, 47487);
          return;
          FavTagEditUI.i(FavTagEditUI.this).setVisibility(8);
          FavTagEditUI.j(FavTagEditUI.this).setVisibility(0);
        }
      }
      
      public final void wb(String paramAnonymousString)
      {
        GMTrace.i(6373731467264L, 47488);
        if (bg.mZ(paramAnonymousString))
        {
          w.d("MicroMsg.FavTagEditUI", "on create tag, fail, tag is empty");
          GMTrace.o(6373731467264L, 47488);
          return;
        }
        FavTagEditUI.d(FavTagEditUI.this).aX(paramAnonymousString, true);
        FavTagEditUI.c(FavTagEditUI.this);
        GMTrace.o(6373731467264L, 47488);
      }
    };
    this.lSI.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6443524685824L, 48008);
        FavTagEditUI.d(FavTagEditUI.this).bXt();
        FavTagEditUI.this.aKp();
        GMTrace.o(6443524685824L, 48008);
      }
    }, 100L);
    Object localObject;
    if (this.lSF != null)
    {
      this.lSI.a(this.lSF.field_tagProto.tQM, this.lSF.field_tagProto.tQM);
      this.lSM = new c(this.vov.voR)
      {
        protected final void xu(String paramAnonymousString)
        {
          GMTrace.i(6376013168640L, 47505);
          FavTagEditUI.d(FavTagEditUI.this).aX(paramAnonymousString, true);
          if (FavTagEditUI.g(FavTagEditUI.this) != null) {
            FavTagEditUI.g(FavTagEditUI.this).aY(paramAnonymousString, true);
          }
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6376013168640L, 47505);
        }
        
        protected final void xv(String paramAnonymousString)
        {
          GMTrace.i(6376147386368L, 47506);
          FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
          if (FavTagEditUI.g(FavTagEditUI.this) != null) {
            FavTagEditUI.g(FavTagEditUI.this).aY(paramAnonymousString, false);
          }
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6376147386368L, 47506);
        }
      };
      localObject = this.lSM;
      if (this.lSF != null) {
        break label618;
      }
    }
    label618:
    for (paramBundle = null;; paramBundle = this.lSF.field_tagProto.tQM)
    {
      ((c)localObject).ax(paramBundle);
      if ((this.lSF != null) && (!this.lSF.field_tagProto.tQL.isEmpty()))
      {
        paramBundle = View.inflate(this.vov.voR, R.i.cUr, null);
        localObject = (TextView)paramBundle.findViewById(R.h.bHk);
        ((TextView)localObject).setText(getString(R.l.dXy));
        ((TextView)localObject).setVisibility(0);
        int i = getResources().getDimensionPixelSize(R.f.aRH);
        this.lSH = ((FavTagPanel)paramBundle.findViewById(R.h.bHu));
        this.lSH.setVisibility(0);
        this.lSH.a(this.lSF.field_tagProto.tQM, this.lSF.field_tagProto.tQL);
        this.lSH.setBackgroundResource(R.g.aZO);
        this.lSH.setPadding(0, 0, 0, i);
        this.lSH.vJd = new MMTagPanel.a()
        {
          public final void asn()
          {
            GMTrace.i(6467281223680L, 48185);
            GMTrace.o(6467281223680L, 48185);
          }
          
          public final void h(boolean paramAnonymousBoolean, int paramAnonymousInt)
          {
            GMTrace.i(6467683876864L, 48188);
            GMTrace.o(6467683876864L, 48188);
          }
          
          public final void vX(String paramAnonymousString)
          {
            GMTrace.i(6466878570496L, 48182);
            FavTagEditUI.d(FavTagEditUI.this).removeTag(paramAnonymousString);
            FavTagEditUI.f(FavTagEditUI.this).xx(paramAnonymousString);
            FavTagEditUI.c(FavTagEditUI.this);
            GMTrace.o(6466878570496L, 48182);
          }
          
          public final void vY(String paramAnonymousString)
          {
            GMTrace.i(6467012788224L, 48183);
            FavTagEditUI.d(FavTagEditUI.this).aX(paramAnonymousString, true);
            FavTagEditUI.f(FavTagEditUI.this).xw(paramAnonymousString);
            FavTagEditUI.c(FavTagEditUI.this);
            GMTrace.o(6467012788224L, 48183);
          }
          
          public final void vZ(String paramAnonymousString)
          {
            GMTrace.i(6467147005952L, 48184);
            GMTrace.o(6467147005952L, 48184);
          }
          
          public final void wa(String paramAnonymousString)
          {
            GMTrace.i(6467415441408L, 48186);
            GMTrace.o(6467415441408L, 48186);
          }
          
          public final void wb(String paramAnonymousString)
          {
            GMTrace.i(6467549659136L, 48187);
            GMTrace.o(6467549659136L, 48187);
          }
        };
        this.lSJ.addHeaderView(paramBundle);
      }
      if (com.tencent.mm.plugin.favorite.h.aww().awT() > 0) {
        this.lSJ.addHeaderView(View.inflate(this.vov.voR, R.i.cUq, null));
      }
      this.lSJ.setAdapter(this.lSM);
      this.lSJ.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(6325010432000L, 47125);
          FavTagEditUI.d(FavTagEditUI.this).bXu();
          GMTrace.o(6325010432000L, 47125);
          return false;
        }
      });
      this.lSN = new d(this.vov.voR)
      {
        protected final void wH(String paramAnonymousString)
        {
          GMTrace.i(6317360021504L, 47068);
          FavTagEditUI.d(FavTagEditUI.this).aX(paramAnonymousString, true);
          FavTagEditUI.f(FavTagEditUI.this).xw(paramAnonymousString);
          FavTagEditUI.d(FavTagEditUI.this).bXr();
          FavTagEditUI.d(FavTagEditUI.this).bXu();
          FavTagEditUI.c(FavTagEditUI.this);
          GMTrace.o(6317360021504L, 47068);
        }
      };
      this.lSK.setAdapter(this.lSN);
      this.lSK.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(6371315548160L, 47470);
          FavTagEditUI.d(FavTagEditUI.this).bXu();
          GMTrace.o(6371315548160L, 47470);
          return false;
        }
      });
      oC(R.l.dWs);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6313199271936L, 47037);
          FavTagEditUI.a(FavTagEditUI.this);
          GMTrace.o(6313199271936L, 47037);
          return true;
        }
      });
      a(0, getString(R.l.dvM), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6338566422528L, 47226);
          if (FavTagEditUI.b(FavTagEditUI.this))
          {
            FavTagEditUI.c(FavTagEditUI.this);
            GMTrace.o(6338566422528L, 47226);
            return true;
          }
          paramAnonymousMenuItem = FavTagEditUI.d(FavTagEditUI.this).bXv();
          Object localObject1 = FavTagEditUI.d(FavTagEditUI.this).bXq().trim();
          if (!bg.mZ((String)localObject1))
          {
            paramAnonymousMenuItem.remove(localObject1);
            paramAnonymousMenuItem.add(localObject1);
          }
          FavTagEditUI.a(FavTagEditUI.this, com.tencent.mm.plugin.favorite.h.awD().cc(l));
          if (FavTagEditUI.e(FavTagEditUI.this) != null)
          {
            x.a(FavTagEditUI.e(FavTagEditUI.this), paramAnonymousMenuItem, FavTagEditUI.this.getIntent().getIntExtra("key_fav_scene", 1));
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("key_fav_result_list", paramAnonymousMenuItem);
            FavTagEditUI.this.setResult(-1, (Intent)localObject1);
          }
          for (;;)
          {
            FavTagEditUI.this.finish();
            FavTagEditUI.this.aKl();
            GMTrace.o(6338566422528L, 47226);
            return true;
            localObject1 = new String[paramAnonymousMenuItem.size()];
            Object localObject2 = paramAnonymousMenuItem.iterator();
            int i = 0;
            while (((Iterator)localObject2).hasNext())
            {
              localObject1[i] = ((String)((Iterator)localObject2).next());
              i += 1;
            }
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("key_fav_result_array", (String[])localObject1);
            ((Intent)localObject2).putExtra("key_fav_result_list", paramAnonymousMenuItem);
            FavTagEditUI.this.setResult(-1, (Intent)localObject2);
          }
        }
      }, p.b.vpB);
      axJ();
      com.tencent.mm.plugin.favorite.h.aww().a(this.lSM);
      GMTrace.o(6322460295168L, 47106);
      return;
      if (this.lSG == null) {
        break;
      }
      this.lSI.a(this.lSG, this.lSG);
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6322728730624L, 47108);
    super.onDestroy();
    t localt = com.tencent.mm.plugin.favorite.h.aww();
    c localc = this.lSM;
    if (localc == null)
    {
      GMTrace.o(6322728730624L, 47108);
      return;
    }
    localt.hxa.remove(localc.toString());
    GMTrace.o(6322728730624L, 47108);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6322862948352L, 47109);
    if (paramInt == 4)
    {
      axK();
      GMTrace.o(6322862948352L, 47109);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6322862948352L, 47109);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/FavTagEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */