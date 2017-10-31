package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashSet;

public class BakMoveNewUI
  extends BakMoveBaseUI
  implements com.tencent.mm.ac.e, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.d
{
  private boolean hie;
  private boolean jUP;
  private boolean jUQ;
  private int progress;
  
  public BakMoveNewUI()
  {
    GMTrace.i(14799651995648L, 110266);
    this.progress = -1;
    this.jUP = false;
    this.jUQ = false;
    this.hie = false;
    GMTrace.o(14799651995648L, 110266);
  }
  
  private void afH()
  {
    GMTrace.i(14801128390656L, 110277);
    if (!this.jUP) {
      finish();
    }
    com.tencent.mm.ui.base.h.a(this, R.l.dAl, 0, R.l.duP, R.l.dBk, null, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(14795088592896L, 110232);
        w.i("MicroMsg.BakMoveNewUI", "try cancel");
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().kx(30050107);
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().afF();
        BakMoveNewUI.this.finish();
        GMTrace.o(14795088592896L, 110232);
      }
    });
    GMTrace.o(14801128390656L, 110277);
  }
  
  public final void MH()
  {
    GMTrace.i(14799920431104L, 110268);
    com.tencent.mm.plugin.report.service.g.paX.a(103L, 8L, 1L, false);
    Object localObject2 = getIntent().getStringExtra("WifiName");
    Object localObject1 = getIntent().getStringExtra("ip");
    Object localObject3 = com.tencent.mm.plugin.backup.bakoldlogic.a.d.bY(this);
    w.i("MicroMsg.BakMoveNewUI", "initView thisWifi:%s, oldWifi:%s, oldIp:%s", new Object[] { localObject3, localObject2, localObject1 });
    if ((localObject2 == null) || (!((String)localObject2).equals(localObject3)))
    {
      localObject1 = new Intent(ab.getContext(), BakMoveErrUI.class);
      ((Intent)localObject1).putExtra("wifiNameDifferentErr", true);
      ((Intent)localObject1).putExtra("WifiName", (String)localObject2);
      ((Intent)localObject1).addFlags(335544320);
      ab.getContext().startActivity((Intent)localObject1);
      finish();
      GMTrace.o(14799920431104L, 110268);
      return;
    }
    if (!com.tencent.mm.plugin.backup.a.h.sK((String)localObject1))
    {
      localObject1 = new Intent(ab.getContext(), BakMoveErrUI.class);
      ((Intent)localObject1).putExtra("complexWIFIErr", true);
      ((Intent)localObject1).addFlags(335544320);
      ab.getContext().startActivity((Intent)localObject1);
      finish();
      GMTrace.o(14799920431104L, 110268);
      return;
    }
    oC(R.l.dBj);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14796028116992L, 110239);
        BakMoveNewUI.a(BakMoveNewUI.this);
        GMTrace.o(14796028116992L, 110239);
        return true;
      }
    });
    if (com.tencent.mm.plugin.backup.a.h.adQ() < 30)
    {
      localObject1 = new Intent(ab.getContext(), BakMoveErrUI.class);
      ((Intent)localObject1).putExtra("battery_not_enough", true);
      ((Intent)localObject1).addFlags(335544320);
      ab.getContext().startActivity((Intent)localObject1);
      finish();
      GMTrace.o(14799920431104L, 110268);
      return;
    }
    if (getIntent().getBooleanExtra("need_auth", true))
    {
      localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw();
      w.i("MicroMsg.MoveRecoverServer", "makeAuth");
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jTT = false;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).fCd = 0L;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).recvSize = 0L;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jUe = 0L;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jUf = 0L;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).hng = false;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jNB = true;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jNx = 0L;
      ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jNC.clear();
      com.tencent.mm.plugin.backup.f.b.a(1, (com.tencent.mm.ac.e)localObject2);
    }
    for (;;)
    {
      try
      {
        if (bg.getInt(com.tencent.mm.k.g.uz().getValue("ChattingRecordsKvstatDisable"), 0) != 0) {
          continue;
        }
        bool = true;
        ((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jNG = bool;
      }
      catch (Exception localException)
      {
        boolean bool;
        w.printErrStackTrace("MicroMsg.MoveRecoverServer", localException, "getInt", new Object[0]);
        continue;
      }
      localObject3 = new com.tencent.mm.plugin.backup.bakoldlogic.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().jLa, com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().jLb, com.tencent.mm.plugin.backup.a.e.adK(), com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().jKZ, com.tencent.mm.plugin.backup.bakoldlogic.a.b.jSL, -22);
      if (((com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.g)localObject2).jNG)
      {
        localObject2 = ((com.tencent.mm.plugin.backup.bakoldlogic.b.a)localObject3).jQU;
        ((v)localObject2).jXQ |= com.tencent.mm.plugin.backup.bakoldlogic.a.b.jSK;
      }
      ((com.tencent.mm.plugin.backup.bakoldlogic.b.a)localObject3).aeV();
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().jUg = ((String)localObject1);
      GMTrace.o(14799920431104L, 110268);
      return;
      bool = false;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(14800188866560L, 110270);
    w.i("MicroMsg.BakMoveNewUI", "onSceneEnd type:%d, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    GMTrace.o(14800188866560L, 110270);
  }
  
  public final void adE()
  {
    GMTrace.i(14800859955200L, 110275);
    this.jUP = false;
    this.jUQ = false;
    this.hie = true;
    this.progress = -1;
    this.jUx.setVisibility(0);
    this.jUx.setText(getString(R.l.dBf));
    this.jUy.setVisibility(4);
    this.jUz.setVisibility(4);
    this.jUA.setVisibility(4);
    this.jUB.setVisibility(0);
    this.jUB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14805557575680L, 110310);
        BakMoveNewUI.this.finish();
        GMTrace.o(14805557575680L, 110310);
      }
    });
    GMTrace.o(14800859955200L, 110275);
  }
  
  public final void afy()
  {
    GMTrace.i(14800725737472L, 110274);
    this.progress = -1;
    this.jUA.setText(R.l.dBi);
    this.jUQ = true;
    GMTrace.o(14800725737472L, 110274);
  }
  
  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(14800457302016L, 110272);
    this.jUP = true;
    if (this.progress < 0)
    {
      this.jUA.setText(R.l.dBc);
      this.jUy.setVisibility(0);
      this.jUz.setVisibility(0);
    }
    String str;
    if (paramInt < 60)
    {
      str = getString(R.l.dBm);
      this.jUx.setText(str);
      if (paramLong1 >= 512000L) {
        break label150;
      }
      this.jUx.setVisibility(4);
      label88:
      if (paramLong2 != 0L) {
        break label161;
      }
    }
    int i;
    label150:
    label161:
    for (long l = 0L;; l = 100L * paramLong1 / paramLong2)
    {
      i = (int)l;
      if (this.progress < i) {
        break label173;
      }
      GMTrace.o(14800457302016L, 110272);
      return;
      str = getString(R.l.dBl, new Object[] { Integer.valueOf(paramInt / 60 + 1) });
      break;
      this.jUx.setVisibility(0);
      break label88;
    }
    label173:
    if (this.progress > 0) {
      this.jUx.setVisibility(0);
    }
    this.progress = i;
    if (paramInt <= 0) {
      this.jUy.setText(com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong1) + "/" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong2));
    }
    for (;;)
    {
      this.jUz.setProgress(i);
      GMTrace.o(14800457302016L, 110272);
      return;
      l = (paramLong2 - paramLong1) / paramInt;
      this.jUy.setText(com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong1) + "/" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(paramLong2) + "(" + com.tencent.mm.plugin.backup.bakoldlogic.a.d.aR(l) + "/s)");
    }
  }
  
  public final void bH(int paramInt1, int paramInt2)
  {
    GMTrace.i(14800591519744L, 110273);
    this.jUx.setText(R.l.dBh);
    if (paramInt1 == 0) {}
    int i;
    for (long l = 0L;; l = paramInt1 * 100L / paramInt2)
    {
      i = (int)l;
      this.jUy.setText(getString(R.l.dBg, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      if (this.progress < i) {
        break;
      }
      GMTrace.o(14800591519744L, 110273);
      return;
    }
    this.progress = i;
    this.jUz.setProgress(i);
    GMTrace.o(14800591519744L, 110273);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14799786213376L, 110267);
    super.onCreate(paramBundle);
    if (getIntent().getBooleanExtra("testMode", false))
    {
      paramBundle = r.icQ;
      int i = r.icR;
      com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw());
      com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().aeg());
      com.tencent.mm.plugin.backup.f.b.km(2);
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().aeg().connect(paramBundle, i);
    }
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().jTU = this;
    com.tencent.mm.a.e.f(new File(com.tencent.mm.plugin.backup.a.h.adP()));
    MH();
    try
    {
      paramBundle = WifiManager.class.getMethod("isWifiApEnabled", new Class[0]);
      WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().jNE = ((Boolean)paramBundle.invoke(localWifiManager, new Object[0])).booleanValue();
      w.d("MicroMsg.BakMoveNewUI", "new isWifiAp:%s", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().jNE) });
      GMTrace.o(14799786213376L, 110267);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.BakMoveNewUI", "no such method WifiManager.isWifiApEnabled:%s", new Object[] { new ah() });
      GMTrace.o(14799786213376L, 110267);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(14800054648832L, 110269);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().jTU = null;
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().aeg().stop();
    com.tencent.mm.plugin.backup.f.b.clear();
    super.onDestroy();
    GMTrace.o(14800054648832L, 110269);
  }
  
  public final void onError(int paramInt, String paramString)
  {
    GMTrace.i(14800323084288L, 110271);
    if ((this.hie) || (this.jUQ))
    {
      w.i("MicroMsg.BakMoveNewUI", "onError isMergeing drop");
      GMTrace.o(14800323084288L, 110271);
      return;
    }
    this.progress = -1;
    Intent localIntent = new Intent(ab.getContext(), BakMoveErrUI.class);
    localIntent.putExtra("err_type", paramInt);
    localIntent.putExtra("err_info", paramString);
    localIntent.addFlags(335544320);
    ab.getContext().startActivity(localIntent);
    finish();
    GMTrace.o(14800323084288L, 110271);
  }
  
  /* Error */
  public boolean onKeyDown(int paramInt, android.view.KeyEvent paramKeyEvent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 585
    //   5: ldc_w 587
    //   8: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: iload_1
    //   12: iconst_4
    //   13: if_icmpne +22 -> 35
    //   16: aload_0
    //   17: invokespecial 53	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveNewUI:afH	()V
    //   20: iconst_1
    //   21: istore_3
    //   22: ldc2_w 585
    //   25: ldc_w 587
    //   28: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: aload_0
    //   32: monitorexit
    //   33: iload_3
    //   34: ireturn
    //   35: aload_0
    //   36: iload_1
    //   37: aload_2
    //   38: invokespecial 589	com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveBaseUI:onKeyDown	(ILandroid/view/KeyEvent;)Z
    //   41: istore_3
    //   42: ldc2_w 585
    //   45: ldc_w 587
    //   48: invokestatic 44	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: goto -20 -> 31
    //   54: astore_2
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_2
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	BakMoveNewUI
    //   0	59	1	paramInt	int
    //   0	59	2	paramKeyEvent	android.view.KeyEvent
    //   21	21	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	11	54	finally
    //   16	20	54	finally
    //   22	31	54	finally
    //   35	51	54	finally
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmoveui/BakMoveNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */