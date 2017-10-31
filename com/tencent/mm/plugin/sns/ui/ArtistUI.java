package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.m;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.protocal.c.dm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.q;

public class ArtistUI
  extends MMActivity
  implements e
{
  private SharedPreferences gZW;
  private q ikZ;
  private ListView kky;
  private String nkl;
  private g qxm;
  private ArtistHeader qxn;
  private k qxo;
  
  public ArtistUI()
  {
    GMTrace.i(8635837054976L, 64342);
    this.nkl = "";
    this.qxo = null;
    this.ikZ = null;
    GMTrace.o(8635837054976L, 64342);
  }
  
  protected final void MH()
  {
    GMTrace.i(8636508143616L, 64347);
    oC(i.j.pRq);
    getString(i.j.dxm);
    this.ikZ = com.tencent.mm.ui.base.h.a(this, getString(i.j.dvY), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8741600624640L, 65130);
        GMTrace.o(8741600624640L, 65130);
      }
    });
    this.kky = ((ListView)findViewById(i.f.pLJ));
    a.ifN.at(false);
    this.qxm = new g(this, this.nkl, new g.b()new g.a
    {
      public final void uK(int paramAnonymousInt)
      {
        GMTrace.i(8627783991296L, 64282);
        Intent localIntent = new Intent();
        localIntent.putExtra("sns_gallery_is_artist", true);
        localIntent.putExtra("sns_gallery_position", paramAnonymousInt);
        localIntent.putExtra("sns_gallery_artist_lan", ArtistUI.a(ArtistUI.this));
        localIntent.putExtra("sns_gallery_showtype", 2);
        localIntent.setClass(ArtistUI.this, ArtistBrowseUI.class);
        ArtistUI.this.startActivity(localIntent);
        GMTrace.o(8627783991296L, 64282);
      }
    }, new g.a()
    {
      public final void a(dl paramAnonymousdl)
      {
        GMTrace.i(8566714925056L, 63827);
        ArtistHeader localArtistHeader;
        if (ArtistUI.b(ArtistUI.this) != null)
        {
          ArtistUI.b(ArtistUI.this).setVisibility(0);
          localArtistHeader = ArtistUI.b(ArtistUI.this);
          if (paramAnonymousdl != null) {
            break label131;
          }
          w.e("MicroMsg.ArtistHeader", "userName or selfName is null ");
        }
        for (;;)
        {
          paramAnonymousdl = paramAnonymousdl.mCJ;
          if ((paramAnonymousdl != null) && (!paramAnonymousdl.equals(""))) {
            ArtistUI.c(ArtistUI.this).edit().putString("artist_name", paramAnonymousdl).commit();
          }
          if (ArtistUI.d(ArtistUI.this) != null) {
            ArtistUI.d(ArtistUI.this).notifyDataSetChanged();
          }
          ArtistUI.e(ArtistUI.this).dismiss();
          GMTrace.o(8566714925056L, 63827);
          return;
          label131:
          localArtistHeader.qxa = paramAnonymousdl;
          ae.bhm().b(paramAnonymousdl.txf.txg, localArtistHeader.qxf.iil, localArtistHeader.context.hashCode(), an.vfb);
          localArtistHeader.qxf.qxk.setText(paramAnonymousdl.mCJ);
          localArtistHeader.qxf.neZ.setText(paramAnonymousdl.txe);
          localArtistHeader.qxf.iin.setText(paramAnonymousdl.fuw);
          localArtistHeader.qxf.qxl.setText(paramAnonymousdl.txd);
        }
      }
      
      public final void bkM()
      {
        GMTrace.i(8566849142784L, 63828);
        if ((ArtistUI.f(ArtistUI.this) == null) && (ArtistUI.e(ArtistUI.this) != null))
        {
          w.d("MicroMsg.ArtistUI", "onNothingBgGet");
          a.ifN.at(true);
        }
        GMTrace.o(8566849142784L, 63828);
      }
    });
    this.qxn = new ArtistHeader(this);
    this.kky.addHeaderView(this.qxn);
    this.kky.setAdapter(this.qxm);
    this.qxm.notifyDataSetChanged();
    this.qxn.setVisibility(8);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8597585002496L, 64057);
        ArtistUI.this.finish();
        GMTrace.o(8597585002496L, 64057);
        return true;
      }
    });
    GMTrace.o(8636508143616L, 64347);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8636776579072L, 64349);
    if ((!(paramk instanceof m)) || (((m)paramk).DM() != 4))
    {
      w.d("MicroMsg.ArtistUI", "another scene");
      GMTrace.o(8636776579072L, 64349);
      return;
    }
    w.i("MicroMsg.ArtistUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if ((paramk.getType() == 159) && (this.ikZ != null)) {
        this.ikZ.dismiss();
      }
      GMTrace.o(8636776579072L, 64349);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(8636776579072L, 64349);
      return;
      if (this.qxm != null) {
        this.qxm.QA();
      }
      this.qxo = null;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8636642361344L, 64348);
    int i = i.g.pOE;
    GMTrace.o(8636642361344L, 64348);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8635971272704L, 64343);
    super.onCreate(paramBundle);
    String str = v.d(getSharedPreferences(ab.bNa(), 0));
    w.d("MicroMsg.ArtistUI", "filterLan temp " + str);
    paramBundle = str;
    if (!str.equals("zh_CN"))
    {
      paramBundle = str;
      if (!str.equals("en"))
      {
        if (!str.equals("zh_TW")) {
          break label167;
        }
        paramBundle = str;
      }
    }
    for (;;)
    {
      this.nkl = paramBundle;
      w.d("MicroMsg.ArtistUI", "lan " + this.nkl);
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(159, this);
      this.gZW = getSharedPreferences(ab.bNa(), 0);
      MH();
      paramBundle = this.qxn;
      ae.bhk().a(paramBundle);
      GMTrace.o(8635971272704L, 64343);
      return;
      label167:
      if (str.equals("zh_HK")) {
        paramBundle = "zh_TW";
      } else {
        paramBundle = "en";
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(8636105490432L, 64344);
    super.onDestroy();
    if (this.ikZ != null) {
      this.ikZ = null;
    }
    if (this.qxn != null)
    {
      ArtistHeader localArtistHeader = this.qxn;
      ae.bhk().b(localArtistHeader);
    }
    ae.bhm().I(this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(159, this);
    GMTrace.o(8636105490432L, 64344);
  }
  
  protected void onPause()
  {
    GMTrace.i(8636373925888L, 64346);
    super.onPause();
    GMTrace.o(8636373925888L, 64346);
  }
  
  protected void onResume()
  {
    GMTrace.i(8636239708160L, 64345);
    super.onResume();
    GMTrace.o(8636239708160L, 64345);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ArtistUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */