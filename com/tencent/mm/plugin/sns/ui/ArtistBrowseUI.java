package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public class ArtistBrowseUI
  extends SnsBaseGalleryUI
  implements t.a
{
  private String nkl;
  private String qxd;
  
  public ArtistBrowseUI()
  {
    GMTrace.i(8398405894144L, 62573);
    this.nkl = "";
    this.qxd = "";
    GMTrace.o(8398405894144L, 62573);
  }
  
  protected final void MH()
  {
    GMTrace.i(8399211200512L, 62579);
    this.nkl = getIntent().getStringExtra("sns_gallery_artist_lan");
    int i = getIntent().getIntExtra("sns_gallery_position", 0);
    com.tencent.mm.av.t.Kg();
    this.qxd = n.Kc();
    o(false, 2);
    this.qGM = new SnsInfoFlip(this);
    List localList = ai.ds(this.nkl, this.qxd);
    this.qGM.qJJ = true;
    this.qGM.a(localList, "", i, this.qGH, this);
    addView(this.qGM);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8707643539456L, 64877);
        ArtistBrowseUI.this.qGJ.blD();
        GMTrace.o(8707643539456L, 64877);
        return true;
      }
    });
    oC(i.j.pUi);
    kT(false);
    this.qGH.qBh = new s.a()
    {
      public final void bkN()
      {
        GMTrace.i(8550206144512L, 63704);
        Object localObject1 = ArtistBrowseUI.this.qGM.blC();
        if (localObject1 == null)
        {
          GMTrace.o(8550206144512L, 63704);
          return;
        }
        w.d("MicroMsg.ArtistBrowseUI", "set bg the meida id " + ((amn)localObject1).nas);
        Object localObject2 = b.gM(723);
        ((b)localObject2).lh(((amn)localObject1).mDo);
        ((b)localObject2).LJ();
        if (!FileOp.aZ(am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas) + i.l((amn)localObject1)))
        {
          GMTrace.o(8550206144512L, 63704);
          return;
        }
        localObject2 = ae.bhl();
        Object localObject3;
        String str;
        if ((((av)localObject2).bgV() != null) && (!((av)localObject2).bgV().equals("")))
        {
          localObject3 = am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas) + i.l((amn)localObject1);
          str = am.dt(ae.getAccSnsPath(), ((av)localObject2).bgV());
          if (!FileOp.aZ((String)localObject3)) {
            break label441;
          }
          w.d("MicroMsg.UploadManager", "bg file is exist!'");
          FileOp.kL(str);
          FileOp.deleteFile(str + ((av)localObject2).bgV() + "bg_");
          FileOp.deleteFile(str + ((av)localObject2).bgV() + "tbg_");
          FileOp.o((String)localObject3, str + ((av)localObject2).bgV() + "bg_");
        }
        for (;;)
        {
          localObject3 = ae.bhs();
          Object localObject4 = ((av)localObject2).bgV();
          str = ((amn)localObject1).nas;
          localObject4 = ((l)localObject3).HE((String)localObject4);
          ((k)localObject4).field_bgId = str;
          ((l)localObject3).c((k)localObject4);
          ((av)localObject2).bhX();
          localObject2 = new aw(7);
          ((amn)localObject1).uhG = 1;
          ((aw)localObject2).qfI.uyu.tKd.add(localObject1);
          ((aw)localObject2).ul(2);
          ((aw)localObject2).commit();
          localObject1 = new Intent();
          ((Intent)localObject1).setClass(ArtistBrowseUI.this, SettingSnsBackgroundUI.class);
          ((Intent)localObject1).setFlags(536870912);
          ((Intent)localObject1).addFlags(67108864);
          ArtistBrowseUI.this.startActivity((Intent)localObject1);
          ArtistBrowseUI.this.finish();
          GMTrace.o(8550206144512L, 63704);
          return;
          label441:
          FileOp.deleteFile(str + ((av)localObject2).bgV() + "bg_");
          FileOp.deleteFile(str + ((av)localObject2).bgV() + "tbg_");
          w.e("MicroMsg.UploadManager", "bg file is not exist! wait to down it");
        }
      }
    };
    GMTrace.o(8399211200512L, 62579);
  }
  
  public final void bU(String paramString, int paramInt)
  {
    GMTrace.i(8399479635968L, 62581);
    if (this.qGM != null) {
      this.qGM.awa();
    }
    GMTrace.o(8399479635968L, 62581);
  }
  
  public final void bV(String paramString, int paramInt)
  {
    GMTrace.i(8399748071424L, 62583);
    GMTrace.o(8399748071424L, 62583);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8399076982784L, 62578);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.ArtistBrowseUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.qGJ.qBC);
      setResult(-1, paramKeyEvent);
      finish();
      GMTrace.o(8399076982784L, 62578);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8399076982784L, 62578);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8398942765056L, 62577);
    int i = i.g.pOP;
    GMTrace.o(8398942765056L, 62577);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8399613853696L, 62582);
    w.i("MicroMsg.ArtistBrowseUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8399613853696L, 62582);
      return;
    }
    paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
    this.qGJ.uL(paramInt1);
    GMTrace.o(8399613853696L, 62582);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8398540111872L, 62574);
    super.onCreate(paramBundle);
    MH();
    GMTrace.o(8398540111872L, 62574);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8398674329600L, 62575);
    if (this.qGM != null)
    {
      this.qGM.bna();
      this.qGM.onDestroy();
    }
    ae.bhm().I(this);
    super.onDestroy();
    GMTrace.o(8398674329600L, 62575);
  }
  
  protected void onPause()
  {
    GMTrace.i(8399345418240L, 62580);
    if (this.qGM != null) {
      this.qGM.onPause();
    }
    super.onPause();
    GMTrace.o(8399345418240L, 62580);
  }
  
  public void onResume()
  {
    GMTrace.i(8398808547328L, 62576);
    super.onResume();
    if (this.qGM != null) {
      this.qGM.awa();
    }
    GMTrace.o(8398808547328L, 62576);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ArtistBrowseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */