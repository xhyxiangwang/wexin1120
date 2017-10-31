package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ab;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;

@com.tencent.mm.ui.base.a(17)
public class SnsCommentUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private int fAl;
  private q ikZ;
  private int pYt;
  private SnsEditText qIY;
  private int qIZ;
  private boolean qJa;
  private boolean qJb;
  
  public SnsCommentUI()
  {
    GMTrace.i(8640668893184L, 64378);
    this.ikZ = null;
    this.qIZ = 0;
    this.qJa = false;
    this.qJb = false;
    GMTrace.o(8640668893184L, 64378);
  }
  
  protected final void MH()
  {
    GMTrace.i(8641339981824L, 64383);
    this.qIY = ((SnsEditText)findViewById(i.f.content));
    this.qIY.setTextSize(1, ab.dZ(this.vov.voR) * this.qIY.getTextSize() / com.tencent.mm.bq.a.getDensity(this.vov.voR));
    a(0, getString(i.j.dwY), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8356395745280L, 62260);
        if (SnsCommentUI.a(SnsCommentUI.this) == 0) {
          com.tencent.mm.k.b.uc();
        }
        if (SnsCommentUI.a(SnsCommentUI.this) == 2) {}
        for (int i = 200;; i = com.tencent.mm.k.b.ub())
        {
          paramAnonymousMenuItem = c.d(SnsCommentUI.b(SnsCommentUI.this)).Dr(i);
          paramAnonymousMenuItem.wNo = true;
          paramAnonymousMenuItem.a(new c.a()
          {
            public final void abH()
            {
              GMTrace.i(8626576031744L, 64273);
              com.tencent.mm.ui.base.h.h(SnsCommentUI.this, i.j.pUl, i.j.pUm);
              GMTrace.o(8626576031744L, 64273);
            }
            
            public final void acg()
            {
              GMTrace.i(8626441814016L, 64272);
              GMTrace.o(8626441814016L, 64272);
            }
            
            public final void sy(String paramAnonymous2String)
            {
              GMTrace.i(8626307596288L, 64271);
              String str1 = SnsCommentUI.b(SnsCommentUI.this).getText().toString().trim();
              SnsCommentUI.b(SnsCommentUI.this).setText("");
              if (str1.length() > 0) {
                switch (SnsCommentUI.a(SnsCommentUI.this))
                {
                }
              }
              for (;;)
              {
                GMTrace.o(8626307596288L, 64271);
                return;
                SnsCommentUI.this.aKl();
                SnsCommentUI.a(SnsCommentUI.this, str1);
                GMTrace.o(8626307596288L, 64271);
                return;
                SnsCommentUI.this.aKl();
                SnsCommentUI.b(SnsCommentUI.this, str1);
                GMTrace.o(8626307596288L, 64271);
                return;
                SnsCommentUI.this.aKl();
                long l1 = SnsCommentUI.this.getIntent().getLongExtra("sns_id", 0L);
                long l2 = SnsCommentUI.this.getIntent().getLongExtra("action_st_time", 0L);
                paramAnonymous2String = bg.ap(SnsCommentUI.this.getIntent().getStringExtra("sns_uxinfo"), "");
                String str2 = bg.ap(SnsCommentUI.this.getIntent().getStringExtra("sns_actionresult"), "");
                str1 = str2 + "|4:1:" + str1;
                long l3 = System.currentTimeMillis();
                Object localObject = ae.bhh().bih();
                if ((localObject == null) || (!((com.tencent.mm.plugin.sns.f.h)localObject).bii()))
                {
                  GMTrace.o(8626307596288L, 64271);
                  return;
                }
                str2 = ((com.tencent.mm.plugin.sns.f.h)localObject).qhf;
                localObject = ((com.tencent.mm.plugin.sns.f.h)localObject).qhe;
                w.d("MicroMsg.SnsCommentUI", "report abtestnotlike " + l1 + " uxinfo:" + paramAnonymous2String + " actionresult: " + str1 + " " + l2 + " " + l3);
                com.tencent.mm.plugin.report.service.g.paX.i(11988, new Object[] { str2, localObject, "", "", i.jdMethod_do(l1), paramAnonymous2String, str1, Long.valueOf(l2 / 1000L), Long.valueOf(l3 / 1000L) });
                SnsCommentUI.c(SnsCommentUI.this);
                SnsCommentUI.this.finish();
              }
            }
          });
          GMTrace.o(8356395745280L, 62260);
          return false;
        }
      }
    }, p.b.vpB);
    if (this.qIZ == 0) {
      oC(i.j.pRS);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(8392366096384L, 62528);
          SnsCommentUI.this.aKl();
          SnsCommentUI.this.finish();
          GMTrace.o(8392366096384L, 62528);
          return true;
        }
      });
      this.qIY.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(8580002480128L, 63926);
          GMTrace.o(8580002480128L, 63926);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8579734044672L, 63924);
          GMTrace.o(8579734044672L, 63924);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(8579868262400L, 63925);
          if (SnsCommentUI.b(SnsCommentUI.this).getText().toString().trim().length() > 0)
          {
            SnsCommentUI.this.kS(true);
            GMTrace.o(8579868262400L, 63925);
            return;
          }
          SnsCommentUI.this.kS(false);
          GMTrace.o(8579868262400L, 63925);
        }
      });
      GMTrace.o(8641339981824L, 64383);
      return;
      if (this.qIZ == 1)
      {
        oC(i.j.pUr);
        com.tencent.mm.kernel.h.xA();
        String str = bg.ap((String)com.tencent.mm.kernel.h.xz().xi().get(68408, ""), "");
        com.tencent.mm.kernel.h.xA();
        int i = bg.a((Integer)com.tencent.mm.kernel.h.xz().xi().get(7489, Integer.valueOf(0)), 0);
        this.qIY.qJf = i;
        this.qIY.append(bg.ap(str, ""));
        if ((str != null) && (str.length() > 0)) {
          kS(true);
        } else {
          kS(false);
        }
      }
      else if (this.qIZ == 2)
      {
        oC(i.j.pRy);
        kS(false);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8641608417280L, 64385);
    w.i("MicroMsg.SnsCommentUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    if (this.ikZ != null) {
      this.ikZ.dismiss();
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(8641608417280L, 64385);
      return;
      if (this.qJa) {
        finish();
      }
    }
  }
  
  public void finish()
  {
    GMTrace.i(8641742635008L, 64386);
    super.finish();
    if ((!this.qJb) && (this.qIZ == 2))
    {
      long l1 = getIntent().getLongExtra("sns_id", 0L);
      long l2 = getIntent().getLongExtra("action_st_time", 0L);
      String str1 = bg.ap(getIntent().getStringExtra("sns_uxinfo"), "");
      String str2 = bg.ap(getIntent().getStringExtra("sns_actionresult"), "");
      str2 = str2 + "|4:0:";
      long l3 = System.currentTimeMillis();
      Object localObject = ae.bhh().bih();
      if ((localObject == null) || (!((com.tencent.mm.plugin.sns.f.h)localObject).bii()))
      {
        GMTrace.o(8641742635008L, 64386);
        return;
      }
      String str3 = ((com.tencent.mm.plugin.sns.f.h)localObject).qhf;
      localObject = ((com.tencent.mm.plugin.sns.f.h)localObject).qhe;
      w.d("MicroMsg.SnsCommentUI", "report abtestnotlike " + l1 + " uxinfo:" + str1 + " actionresult: " + str2 + " " + l2 + " " + l3);
      com.tencent.mm.plugin.report.service.g.paX.i(11988, new Object[] { str3, localObject, "", "", i.jdMethod_do(l1), str1, str2, Long.valueOf(l2 / 1000L), Long.valueOf(l3 / 1000L) });
    }
    GMTrace.o(8641742635008L, 64386);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8641474199552L, 64384);
    int i = i.g.pOM;
    GMTrace.o(8641474199552L, 64384);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8640803110912L, 64379);
    super.onCreate(paramBundle);
    this.pYt = getIntent().getIntExtra("sns_comment_localId", 0);
    this.qIZ = getIntent().getIntExtra("sns_comment_type", 0);
    this.fAl = getIntent().getIntExtra("sns_source", 0);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(213, this);
    MH();
    GMTrace.o(8640803110912L, 64379);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8641205764096L, 64382);
    super.onDestroy();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(213, this);
    GMTrace.o(8641205764096L, 64382);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8641876852736L, 64387);
    if (paramInt == 4)
    {
      aKl();
      finish();
      GMTrace.o(8641876852736L, 64387);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8641876852736L, 64387);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(8640937328640L, 64380);
    super.onPause();
    if (this.qIY != null)
    {
      String str = this.qIY.getText().toString().trim();
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().set(68408, str);
      if (!bg.mZ(str))
      {
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(7489, Integer.valueOf(this.qIY.qJf));
        GMTrace.o(8640937328640L, 64380);
        return;
      }
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().set(7489, Integer.valueOf(0));
    }
    GMTrace.o(8640937328640L, 64380);
  }
  
  public void onResume()
  {
    GMTrace.i(8641071546368L, 64381);
    super.onResume();
    aKp();
    GMTrace.o(8641071546368L, 64381);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsCommentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */