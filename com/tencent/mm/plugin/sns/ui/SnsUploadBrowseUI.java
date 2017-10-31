package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.g.b;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SnsUploadBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private int qGO;
  private ArrayList<String> qRD;
  private HashMap<Integer, Boolean> qRE;
  
  public SnsUploadBrowseUI()
  {
    GMTrace.i(8463904145408L, 63061);
    this.qRD = new ArrayList();
    this.qGO = 0;
    this.qRE = new HashMap();
    GMTrace.o(8463904145408L, 63061);
  }
  
  protected final void MH()
  {
    GMTrace.i(8464977887232L, 63069);
    String str = bg.ap(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.qRD = getIntent().getStringArrayListExtra("sns_gallery_temp_paths");
    if (this.qRD == null)
    {
      GMTrace.o(8464977887232L, 63069);
      return;
    }
    this.qGO = getIntent().getIntExtra("sns_gallery_position", 0);
    this.qGM = new SnsInfoFlip(this);
    this.qGM.qJK = false;
    this.qGM.qJJ = true;
    ae.getAccSnsTmpPath();
    List localList = ai.bp(this.qRD);
    this.qGM.a(localList, str, this.qGO, this.qGH, this);
    this.qGM.qKa = new SnsInfoFlip.c()
    {
      public final void va(int paramAnonymousInt)
      {
        GMTrace.i(8712072724480L, 64910);
        SnsUploadBrowseUI.a(SnsUploadBrowseUI.this).put(Integer.valueOf(paramAnonymousInt), Boolean.valueOf(true));
        GMTrace.o(8712072724480L, 64910);
      }
    };
    addView(this.qGM);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8600135139328L, 64076);
        SnsUploadBrowseUI.this.bnN();
        GMTrace.o(8600135139328L, 64076);
        return true;
      }
    });
    a(0, i.j.duY, i.e.pHc, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8400821813248L, 62591);
        h.a(SnsUploadBrowseUI.this, i.j.pSv, i.j.dxm, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(8338007916544L, 62123);
            if (SnsUploadBrowseUI.this.qGM.bnb() == 0) {
              SnsUploadBrowseUI.this.bnN();
            }
            GMTrace.o(8338007916544L, 62123);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(8363240849408L, 62311);
            GMTrace.o(8363240849408L, 62311);
          }
        });
        GMTrace.o(8400821813248L, 62591);
        return true;
      }
    });
    GMTrace.o(8464977887232L, 63069);
  }
  
  protected final int Qb()
  {
    GMTrace.i(8465380540416L, 63072);
    GMTrace.o(8465380540416L, 63072);
    return 4;
  }
  
  public final void bU(String paramString, int paramInt)
  {
    GMTrace.i(8465112104960L, 63070);
    if (this.qGM != null) {
      this.qGM.awa();
    }
    GMTrace.o(8465112104960L, 63070);
  }
  
  public final void bV(String paramString, int paramInt)
  {
    GMTrace.i(8465514758144L, 63073);
    GMTrace.o(8465514758144L, 63073);
  }
  
  public final void bnN()
  {
    GMTrace.i(8464709451776L, 63067);
    Intent localIntent = new Intent();
    Object localObject = this.qGM.hip;
    if (localObject == null)
    {
      GMTrace.o(8464709451776L, 63067);
      return;
    }
    this.qRD.clear();
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      localObject = ae.getAccSnsTmpPath() + localb.fNf.nas;
      if (!localb.fNf.nas.startsWith("pre_temp_extend_pic")) {
        break label192;
      }
      localObject = localb.fNf.nas.substring(19);
    }
    label192:
    for (;;)
    {
      this.qRD.add(localObject);
      break;
      localIntent.putExtra("sns_gallery_temp_paths", this.qRD);
      localIntent.putExtra("sns_update_preview_image_count", this.qRE.size());
      this.qRE.clear();
      setResult(-1, localIntent);
      finish();
      GMTrace.o(8464709451776L, 63067);
      return;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8464843669504L, 63068);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsUploadBrowseUI", "dispatchKeyEvent");
      bnN();
      GMTrace.o(8464843669504L, 63068);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8464843669504L, 63068);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8464575234048L, 63066);
    int i = i.g.pOF;
    GMTrace.o(8464575234048L, 63066);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8465246322688L, 63071);
    w.i("MicroMsg.SnsUploadBrowseUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8465246322688L, 63071);
      return;
    }
    GMTrace.o(8465246322688L, 63071);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8464038363136L, 63062);
    super.onCreate(paramBundle);
    MH();
    GMTrace.o(8464038363136L, 63062);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8464172580864L, 63063);
    if (this.qGM != null)
    {
      this.qGM.bna();
      this.qGM.onDestroy();
    }
    ae.bhm().I(this);
    super.onDestroy();
    GMTrace.o(8464172580864L, 63063);
  }
  
  protected void onPause()
  {
    GMTrace.i(8464441016320L, 63065);
    if (this.qGM != null) {
      this.qGM.onPause();
    }
    super.onPause();
    GMTrace.o(8464441016320L, 63065);
  }
  
  public void onResume()
  {
    GMTrace.i(8464306798592L, 63064);
    super.onResume();
    if (this.qGM != null) {
      this.qGM.awa();
    }
    GMTrace.o(8464306798592L, 63064);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUploadBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */