package com.tencent.mm.wallet_core.d;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.n;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.h;
import com.tencent.mm.wallet_core.f.a.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.x.ap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class f
  implements e, b
{
  public String gPI;
  private Set<Integer> imE;
  public HashSet<com.tencent.mm.ac.k> imo;
  public HashSet<com.tencent.mm.ac.k> imp;
  public Dialog imq;
  public Context mContext;
  private c nwk;
  public Bundle un;
  private a xgD;
  
  public f(Context paramContext, c paramc)
  {
    GMTrace.i(1435995471872L, 10699);
    this.nwk = null;
    this.imo = new HashSet();
    this.imp = new HashSet();
    this.imq = null;
    this.imE = new HashSet();
    this.mContext = paramContext;
    this.nwk = paramc;
    this.xgD = new a(this);
    GMTrace.o(1435995471872L, 10699);
  }
  
  private boolean k(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(1436934995968L, 10706);
    w.i("MicroMsg.WalletNetSceneMgr", "onSceneEnd scene is " + paramk.toString());
    w.d("MicroMsg.WalletNetSceneMgr", "tofutest: errType: %d, errCode: %d, errMsg: %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(r.idl) });
    if ((r.idl) && ((paramk instanceof i)) && (!((i)paramk).xgX) && (!((i)paramk).bvs()))
    {
      paramString = (i)paramk;
      w.i("MicroMsg.WalletNetSceneMgr", "test do delay query order");
      this.xgD.b(paramString);
      GMTrace.o(1436934995968L, 10706);
      return true;
    }
    if (!(paramk instanceof i))
    {
      GMTrace.o(1436934995968L, 10706);
      return false;
    }
    if (((i)paramk).bvs())
    {
      GMTrace.o(1436934995968L, 10706);
      return false;
    }
    if (((i)paramk).xgX)
    {
      w.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass");
      GMTrace.o(1436934995968L, 10706);
      return false;
    }
    paramString = (i)paramk;
    boolean bool2 = this.xgD.a(paramString);
    if (!paramString.xgd) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      w.d("MicroMsg.WalletNetSceneMgr", "shouldRetry, network: %B, server: %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool2) && (!bool1)) {
        break;
      }
      w.i("MicroMsg.WalletNetSceneMgr", "doing delay order query retry");
      this.xgD.b(paramString);
      GMTrace.o(1436934995968L, 10706);
      return true;
    }
    GMTrace.o(1436934995968L, 10706);
    return false;
  }
  
  private void q(com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(1437471866880L, 10710);
    if ((paramk != null) && ((paramk instanceof com.tencent.mm.wallet_core.c.k)))
    {
      ((com.tencent.mm.wallet_core.c.k)paramk).gPI = this.gPI;
      if (this.un != null)
      {
        ((com.tencent.mm.wallet_core.c.k)paramk).un = this.un;
        GMTrace.o(1437471866880L, 10710);
        return;
      }
      if ((this.mContext instanceof WalletBaseUI)) {
        ((com.tencent.mm.wallet_core.c.k)paramk).un = ((WalletBaseUI)this.mContext).un;
      }
    }
    GMTrace.o(1437471866880L, 10710);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(1437069213696L, 10707);
    int i;
    if (this.imp.contains(paramk))
    {
      w.d("MicroMsg.WalletNetSceneMgr", "has find scene ");
      if (!k(paramInt1, paramInt2, paramString, paramk))
      {
        w.i("MicroMsg.WalletNetSceneMgr", "Not need delay query order,remove scene");
        this.imp.remove(paramk);
        i = 1;
      }
    }
    for (;;)
    {
      if ((this.imp.isEmpty()) && (this.imo.isEmpty())) {
        bvu();
      }
      for (boolean bool = true;; bool = false)
      {
        if ((i != 0) && (this.nwk != null)) {
          this.nwk.b(paramInt1, paramInt2, paramString, paramk, bool);
        }
        GMTrace.o(1437069213696L, 10707);
        return;
        w.i("MicroMsg.WalletNetSceneMgr", "do delay order query.break off!");
        GMTrace.o(1437069213696L, 10707);
        return;
        if (!this.imo.contains(paramk)) {
          break label219;
        }
        w.d("MicroMsg.WalletNetSceneMgr", "has find forcescenes ");
        if (!k(paramInt1, paramInt2, paramString, paramk))
        {
          this.imo.remove(paramk);
          w.i("MicroMsg.WalletNetSceneMgr", "Not need delay query order,remove scene");
          i = 1;
          break;
        }
        w.i("MicroMsg.WalletNetSceneMgr", "do delay order query.break off!");
        GMTrace.o(1437069213696L, 10707);
        return;
      }
      label219:
      i = 0;
    }
  }
  
  public final void a(com.tencent.mm.ac.k paramk, boolean paramBoolean)
  {
    GMTrace.i(1436129689600L, 10700);
    q(paramk);
    this.imo.add(paramk);
    if ((paramBoolean) && ((this.imq == null) || ((this.imq != null) && (!this.imq.isShowing()))))
    {
      if (this.imq != null) {
        this.imq.dismiss();
      }
      if (this.mContext == null)
      {
        w.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
        GMTrace.o(1436129689600L, 10700);
        return;
      }
      this.imq = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1439350915072L, 10724);
          f.this.aKZ();
          GMTrace.o(1439350915072L, 10724);
        }
      });
    }
    if ((r.idl) && ((paramk instanceof h)) && ((((h)paramk).getUri().contains("authen")) || (((h)paramk).getUri().contains("verify")))) {
      ((h)paramk).cjb();
    }
    ap.wT().a(paramk, 0);
    GMTrace.o(1436129689600L, 10700);
  }
  
  public final void a(com.tencent.mm.ac.k paramk, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(19128173723648L, 142516);
    w.d("MicroMsg.WalletNetSceneMgr", "isShowProgress " + paramBoolean);
    q(paramk);
    this.imp.add(paramk);
    if ((paramBoolean) && ((this.imq == null) || ((this.imq != null) && (!this.imq.isShowing()))))
    {
      if (this.imq != null) {
        this.imq.dismiss();
      }
      if (this.mContext == null)
      {
        w.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
        GMTrace.o(19128173723648L, 142516);
        return;
      }
      if (paramInt != 1) {
        break label155;
      }
      this.imq = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1437740302336L, 10712);
          if ((f.this.imq != null) && (f.this.imo.isEmpty()))
          {
            f.this.imq.dismiss();
            paramAnonymousDialogInterface = f.this.imp.iterator();
            while (paramAnonymousDialogInterface.hasNext())
            {
              com.tencent.mm.ac.k localk = (com.tencent.mm.ac.k)paramAnonymousDialogInterface.next();
              ap.wT().c(localk);
            }
            f.this.imp.clear();
          }
          GMTrace.o(1437740302336L, 10712);
        }
      });
    }
    for (;;)
    {
      ap.wT().a(paramk, 0);
      GMTrace.o(19128173723648L, 142516);
      return;
      label155:
      if (paramInt == 2)
      {
        this.imq = com.tencent.mm.wallet_core.ui.g.a(this.mContext, this.mContext.getString(R.l.eXz), false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1440693092352L, 10734);
            if ((f.this.imq != null) && (f.this.imo.isEmpty()))
            {
              f.this.imq.dismiss();
              paramAnonymousDialogInterface = f.this.imp.iterator();
              while (paramAnonymousDialogInterface.hasNext())
              {
                com.tencent.mm.ac.k localk = (com.tencent.mm.ac.k)paramAnonymousDialogInterface.next();
                ap.wT().c(localk);
              }
              f.this.imp.clear();
            }
            GMTrace.o(1440693092352L, 10734);
          }
        });
      }
      else if (paramInt == 3)
      {
        this.imq = com.tencent.mm.wallet_core.ui.g.b(this.mContext, "验证中", new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1439619350528L, 10726);
            if ((f.this.imq != null) && (f.this.imo.isEmpty()))
            {
              f.this.imq.dismiss();
              paramAnonymousDialogInterface = f.this.imp.iterator();
              while (paramAnonymousDialogInterface.hasNext())
              {
                com.tencent.mm.ac.k localk = (com.tencent.mm.ac.k)paramAnonymousDialogInterface.next();
                ap.wT().c(localk);
              }
              f.this.imp.clear();
            }
            GMTrace.o(1439619350528L, 10726);
          }
        });
      }
      else
      {
        w.i("MicroMsg.WalletNetSceneMgr", "unknown dialog type: %d", new Object[] { Integer.valueOf(paramInt) });
        this.imq = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19128039505920L, 142515);
            if ((f.this.imq != null) && (f.this.imo.isEmpty()))
            {
              f.this.imq.dismiss();
              paramAnonymousDialogInterface = f.this.imp.iterator();
              while (paramAnonymousDialogInterface.hasNext())
              {
                com.tencent.mm.ac.k localk = (com.tencent.mm.ac.k)paramAnonymousDialogInterface.next();
                ap.wT().c(localk);
              }
              f.this.imp.clear();
            }
            GMTrace.o(19128039505920L, 142515);
          }
        });
      }
    }
  }
  
  public final void aKZ()
  {
    GMTrace.i(1436398125056L, 10702);
    if (this.imq != null)
    {
      this.imq.dismiss();
      this.imq = null;
    }
    Iterator localIterator = this.imo.iterator();
    com.tencent.mm.ac.k localk;
    while (localIterator.hasNext())
    {
      localk = (com.tencent.mm.ac.k)localIterator.next();
      ap.wT().c(localk);
    }
    localIterator = this.imp.iterator();
    while (localIterator.hasNext())
    {
      localk = (com.tencent.mm.ac.k)localIterator.next();
      ap.wT().c(localk);
    }
    this.imo.clear();
    this.imp.clear();
    GMTrace.o(1436398125056L, 10702);
  }
  
  public final boolean aLa()
  {
    GMTrace.i(1437337649152L, 10709);
    if ((this.imp.isEmpty()) && (this.imo.isEmpty()))
    {
      GMTrace.o(1437337649152L, 10709);
      return false;
    }
    GMTrace.o(1437337649152L, 10709);
    return true;
  }
  
  public final void aLb()
  {
    GMTrace.i(1436800778240L, 10705);
    bvu();
    GMTrace.o(1436800778240L, 10705);
  }
  
  public final void bvu()
  {
    GMTrace.i(1437203431424L, 10708);
    if (this.imq != null)
    {
      this.imq.dismiss();
      this.imq = null;
    }
    GMTrace.o(1437203431424L, 10708);
  }
  
  public final void hA(int paramInt)
  {
    GMTrace.i(1436666560512L, 10704);
    ap.wT().b(paramInt, this);
    this.imE.remove(Integer.valueOf(paramInt));
    if (this.imE.isEmpty())
    {
      aKZ();
      this.nwk = null;
      this.mContext = null;
    }
    GMTrace.o(1436666560512L, 10704);
  }
  
  public final void hz(int paramInt)
  {
    GMTrace.i(1436532342784L, 10703);
    this.imE.add(Integer.valueOf(paramInt));
    ap.wT().a(paramInt, this);
    GMTrace.o(1436532342784L, 10703);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */