package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import java.util.HashMap;
import java.util.Map;

public class AttachDownloadPage
  extends MMActivity
{
  private long fCd;
  private long hSY;
  private int hSp;
  private TextView iiq;
  private ProgressBar jUz;
  private TextView jqM;
  private Button lVf;
  private Button lVh;
  private View lVk;
  private String oEO;
  private String oFC;
  private long oGJ;
  private MMImageView oGU;
  private ImageView oGV;
  private ImageView oGW;
  private TextView oGX;
  private String oGY;
  private int oGZ;
  private boolean oHa;
  private String oHb;
  private boolean oHc;
  private int retryCount;
  
  public AttachDownloadPage()
  {
    GMTrace.i(5480244051968L, 40831);
    this.oHa = false;
    this.hSY = 0L;
    this.oHc = true;
    this.hSp = 0;
    this.retryCount = 0;
    GMTrace.o(5480244051968L, 40831);
  }
  
  private void aXg()
  {
    GMTrace.i(5481183576064L, 40838);
    this.lVk.setVisibility(0);
    this.lVf.setVisibility(8);
    this.lVh.setVisibility(8);
    this.oGV.setVisibility(0);
    this.oGW.setVisibility(8);
    this.oGX.setVisibility(8);
    this.iiq.setVisibility(8);
    this.jqM.setVisibility(8);
    this.oGV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5555003326464L, 41388);
        AttachDownloadPage.a(AttachDownloadPage.this, 2);
        com.tencent.mm.plugin.qqmail.b.w.aXa().cancel(AttachDownloadPage.b(AttachDownloadPage.this));
        AttachDownloadPage.c(AttachDownloadPage.this);
        AttachDownloadPage.d(AttachDownloadPage.this);
        GMTrace.o(5555003326464L, 41388);
      }
    });
    this.oGW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5568290881536L, 41487);
        AttachDownloadPage.e(AttachDownloadPage.this);
        AttachDownloadPage.f(AttachDownloadPage.this);
        GMTrace.o(5568290881536L, 41487);
      }
    });
    GMTrace.o(5481183576064L, 40838);
  }
  
  private void aXh()
  {
    GMTrace.i(5481317793792L, 40839);
    if (this.oGZ == 1)
    {
      if (FileExplorerUI.ON(this.oHb))
      {
        if (this.hSp == 3)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("key_favorite", true);
          localIntent.putExtra("key_favorite_source_type", 9);
          localIntent.putExtra("key_image_path", gF(false));
          com.tencent.mm.plugin.qqmail.a.a.ifM.c(this.vov.voR, localIntent);
          finish();
          GMTrace.o(5481317793792L, 40839);
          return;
        }
        if ((this.hSp == 0) || (this.oHc))
        {
          this.retryCount = 0;
          this.oHc = false;
          aXi();
          aXg();
          GMTrace.o(5481317793792L, 40839);
          return;
        }
      }
      this.lVk.setVisibility(8);
      this.iiq.setVisibility(0);
      this.oGX.setVisibility(8);
      this.lVf.setVisibility(0);
      this.lVh.setVisibility(8);
      this.jqM.setVisibility(0);
      this.lVf.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5532588965888L, 41221);
          AttachDownloadPage.g(AttachDownloadPage.this);
          GMTrace.o(5532588965888L, 41221);
        }
      });
      if (this.hSp == 3)
      {
        this.iiq.setText(R.l.emM);
        this.jqM.setText(R.l.emJ);
        this.jqM.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5485881196544L, 40873);
            AttachDownloadPage.b(AttachDownloadPage.this, AttachDownloadPage.a(AttachDownloadPage.this));
            GMTrace.o(5485881196544L, 40873);
          }
        });
        kS(true);
        GMTrace.o(5481317793792L, 40839);
        return;
      }
      this.iiq.setText(R.l.emM);
      if (this.hSp == 2) {
        this.jqM.setText(R.l.emL);
      }
      for (;;)
      {
        this.jqM.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(5551245230080L, 41360);
            AttachDownloadPage.e(AttachDownloadPage.this);
            AttachDownloadPage.f(AttachDownloadPage.this);
            AttachDownloadPage.h(AttachDownloadPage.this);
            GMTrace.o(5551245230080L, 41360);
          }
        });
        GMTrace.o(5481317793792L, 40839);
        return;
        this.jqM.setText(R.l.emK);
      }
    }
    if (this.oGZ == 0)
    {
      this.lVk.setVisibility(8);
      this.lVf.setVisibility(8);
      this.lVh.setVisibility(0);
      this.oGX.setVisibility(8);
      this.iiq.setVisibility(0);
      this.jqM.setVisibility(8);
      if (this.hSp != 3) {
        break label445;
      }
      this.lVh.setText(R.l.emH);
      kS(true);
    }
    for (;;)
    {
      this.iiq.setText(R.l.emG);
      this.lVh.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5488833986560L, 40895);
          if (AttachDownloadPage.i(AttachDownloadPage.this) == 3)
          {
            AttachDownloadPage.b(AttachDownloadPage.this, AttachDownloadPage.a(AttachDownloadPage.this));
            GMTrace.o(5488833986560L, 40895);
            return;
          }
          AttachDownloadPage.h(AttachDownloadPage.this);
          AttachDownloadPage.e(AttachDownloadPage.this);
          AttachDownloadPage.f(AttachDownloadPage.this);
          GMTrace.o(5488833986560L, 40895);
        }
      });
      GMTrace.o(5481317793792L, 40839);
      return;
      label445:
      if (this.hSp == 2) {
        this.lVh.setText(R.l.emN);
      } else {
        this.lVh.setText(R.l.emF);
      }
    }
  }
  
  private void aXi()
  {
    GMTrace.i(5481452011520L, 40840);
    aXl();
    if (this.hSp == 4) {
      if (this.retryCount < 5)
      {
        this.retryCount += 1;
        aXi();
      }
    }
    for (;;)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("mailid", this.oEO);
      localHashMap.put("attachid", this.oFC);
      localHashMap.put("username", "");
      localHashMap.put("offset", this.hSY);
      localHashMap.put("datalen", this.fCd);
      localHashMap.put("default_attach_name", aXj() + ".temp");
      p.c localc = new p.c();
      localc.oFU = false;
      localc.oFV = false;
      this.oGJ = com.tencent.mm.plugin.qqmail.b.w.aXa().a("/cgi-bin/mmdownload", localHashMap, localc, new p.a()
      {
        public final void onComplete()
        {
          GMTrace.i(5507221815296L, 41032);
          GMTrace.o(5507221815296L, 41032);
        }
        
        public final void onError(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(5507087597568L, 41031);
          AttachDownloadPage.a(AttachDownloadPage.this, 4);
          if (AttachDownloadPage.m(AttachDownloadPage.this) < 5)
          {
            AttachDownloadPage.n(AttachDownloadPage.this);
            AttachDownloadPage.f(AttachDownloadPage.this);
            GMTrace.o(5507087597568L, 41031);
            return;
          }
          AttachDownloadPage.d(AttachDownloadPage.this);
          GMTrace.o(5507087597568L, 41031);
        }
        
        public final void onProgress(int paramAnonymousInt)
        {
          GMTrace.i(5506819162112L, 41029);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AttachDownloadPage", "download progress : " + paramAnonymousInt);
          AttachDownloadPage.j(AttachDownloadPage.this);
          AttachDownloadPage.a(AttachDownloadPage.this, 1);
          GMTrace.o(5506819162112L, 41029);
        }
        
        public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
        {
          GMTrace.i(5506953379840L, 41030);
          e.g(AttachDownloadPage.k(AttachDownloadPage.this), AttachDownloadPage.l(AttachDownloadPage.this) + ".temp", AttachDownloadPage.l(AttachDownloadPage.this));
          AttachDownloadPage.a(AttachDownloadPage.this, 3);
          Toast.makeText(AttachDownloadPage.this, AttachDownloadPage.this.getString(R.l.dQr) + " : " + AttachDownloadPage.a(AttachDownloadPage.this), 5000).show();
          AttachDownloadPage.d(AttachDownloadPage.this);
          GMTrace.o(5506953379840L, 41030);
        }
      });
      GMTrace.o(5481452011520L, 40840);
      return;
      aXh();
      continue;
      if (this.hSp == 3)
      {
        e.g(this.oGY, aXj() + ".temp", aXj());
        this.hSp = 3;
        aXh();
      }
    }
  }
  
  private String aXj()
  {
    GMTrace.i(5481720446976L, 40842);
    int i = this.oFC.hashCode();
    int j = this.oHb.lastIndexOf(".");
    String str2 = "";
    String str1;
    if (j != -1)
    {
      str1 = this.oHb.substring(0, j);
      str2 = this.oHb.substring(j, this.oHb.length());
    }
    for (;;)
    {
      str1 = String.format("%s_%d%s", new Object[] { str1, Integer.valueOf(i & 0xFFFF), str2 });
      GMTrace.o(5481720446976L, 40842);
      return str1;
      str1 = this.oHb;
    }
  }
  
  private String aXk()
  {
    GMTrace.i(5481988882432L, 40844);
    String str = this.oGY + this.oHb;
    GMTrace.o(5481988882432L, 40844);
    return str;
  }
  
  private void aXl()
  {
    GMTrace.i(5482123100160L, 40845);
    if (e.aZ(gF(true)))
    {
      this.hSY = e.aY(gF(true));
      this.hSp = 2;
      GMTrace.o(5482123100160L, 40845);
      return;
    }
    if (e.aZ(gF(false)))
    {
      this.hSp = 3;
      GMTrace.o(5482123100160L, 40845);
      return;
    }
    if (e.aZ(aXk()))
    {
      if (e.aY(aXk()) == this.fCd)
      {
        e.g(this.oGY, this.oHb, aXj());
        this.hSp = 3;
        GMTrace.o(5482123100160L, 40845);
        return;
      }
      if (e.aY(aXk()) > this.fCd)
      {
        b.deleteFile(aXk());
        this.hSY = 0L;
        this.hSp = 4;
        GMTrace.o(5482123100160L, 40845);
        return;
      }
      this.hSY = 0L;
      this.hSp = 0;
      GMTrace.o(5482123100160L, 40845);
      return;
    }
    this.hSY = 0L;
    this.hSp = 0;
    GMTrace.o(5482123100160L, 40845);
  }
  
  private String gF(boolean paramBoolean)
  {
    GMTrace.i(5481854664704L, 40843);
    StringBuilder localStringBuilder = new StringBuilder().append(this.oGY).append(aXj());
    if (!paramBoolean) {}
    for (String str = "";; str = ".temp")
    {
      str = str;
      GMTrace.o(5481854664704L, 40843);
      return str;
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(5481049358336L, 40837);
    this.oGU = ((MMImageView)findViewById(R.h.bCU));
    this.lVk = findViewById(R.h.bCL);
    this.jUz = ((ProgressBar)findViewById(R.h.bCK));
    this.oGV = ((ImageView)findViewById(R.h.bCP));
    this.oGW = ((ImageView)findViewById(R.h.bCN));
    this.oGX = ((TextView)findViewById(R.h.biZ));
    this.lVf = ((Button)findViewById(R.h.bjb));
    this.lVh = ((Button)findViewById(R.h.biY));
    this.iiq = ((TextView)findViewById(R.h.bja));
    this.jqM = ((TextView)findViewById(R.h.bjc));
    if (FileExplorerUI.ON(this.oHb)) {
      this.oGU.setBackgroundResource(R.k.dnU);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5541447335936L, 41287);
          AttachDownloadPage.this.finish();
          GMTrace.o(5541447335936L, 41287);
          return true;
        }
      });
      a(0, R.k.dpK, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5534333796352L, 41234);
          paramAnonymousMenuItem = AttachDownloadPage.this;
          String str = AttachDownloadPage.this.getString(R.l.euj);
          h.c local1 = new h.c()
          {
            public final void hC(int paramAnonymous2Int)
            {
              GMTrace.i(5486686502912L, 40879);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(5486686502912L, 40879);
                return;
                AttachDownloadPage.a(AttachDownloadPage.this, AttachDownloadPage.a(AttachDownloadPage.this));
              }
            }
          };
          h.a(paramAnonymousMenuItem, "", new String[] { str }, "", false, local1);
          GMTrace.o(5534333796352L, 41234);
          return true;
        }
      });
      kS(false);
      aXl();
      if (this.hSp != 1) {
        break;
      }
      aXg();
      GMTrace.o(5481049358336L, 40837);
      return;
      if (FileExplorerUI.OO(this.oHb))
      {
        this.oGU.setImageResource(R.k.dlh);
      }
      else
      {
        int i = q.Nw(e.bb(this.oHb));
        if (i > 0) {
          this.oGU.setImageResource(i);
        } else {
          this.oGU.setImageResource(R.k.dle);
        }
      }
    }
    aXh();
    GMTrace.o(5481049358336L, 40837);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5480378269696L, 40832);
    int i = R.i.cME;
    GMTrace.o(5480378269696L, 40832);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5481586229248L, 40841);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.dQm, R.l.dQn, 3);
    GMTrace.o(5481586229248L, 40841);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5480512487424L, 40833);
    super.onCreate(paramBundle);
    this.oGZ = getIntent().getIntExtra("is_preview", 0);
    this.oHa = getIntent().getBooleanExtra("is_compress", false);
    this.oHb = getIntent().getStringExtra("attach_name");
    this.oEO = getIntent().getStringExtra("mail_id");
    this.oFC = getIntent().getStringExtra("attach_id");
    this.fCd = getIntent().getLongExtra("total_size", 0L);
    com.tencent.mm.plugin.qqmail.b.w.aXa();
    this.oGY = com.tencent.mm.plugin.qqmail.b.p.getDownloadPath();
    rV(this.oHb);
    MH();
    GMTrace.o(5480512487424L, 40833);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5480915140608L, 40836);
    super.onDestroy();
    com.tencent.mm.plugin.qqmail.b.w.aXa().cancel(this.oGJ);
    GMTrace.o(5480915140608L, 40836);
  }
  
  protected void onPause()
  {
    GMTrace.i(5480780922880L, 40835);
    super.onPause();
    GMTrace.o(5480780922880L, 40835);
  }
  
  protected void onResume()
  {
    GMTrace.i(5480646705152L, 40834);
    super.onResume();
    GMTrace.o(5480646705152L, 40834);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */