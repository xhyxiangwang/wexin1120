package com.tencent.mm.plugin.facedetect.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.g.a.mx.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.m;

@com.tencent.mm.ui.base.a(3)
public class FaceTransparentStubUI
  extends MMActivity
{
  public FaceTransparentStubUI()
  {
    GMTrace.i(14529337491456L, 108252);
    GMTrace.o(14529337491456L, 108252);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14529740144640L, 108255);
    GMTrace.o(14529740144640L, 108255);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(14529605926912L, 108254);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.FaceTransparentStubUI", "hy: on activity result in FaceTransparentStubUI");
    setResult(paramInt2, paramIntent);
    finish();
    GMTrace.o(14529605926912L, 108254);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14529471709184L, 108253);
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("KEY_REQUEST_CODE", 1000);
    Object localObject = getIntent().getBundleExtra("KEY_EXTRAS");
    if (!((Bundle)localObject).containsKey("k_user_name"))
    {
      h.xx();
      if (com.tencent.mm.kernel.a.wL()) {
        ((Bundle)localObject).putString("k_user_name", m.zI());
      }
    }
    paramBundle = new mx();
    paramBundle.fLh.context = this;
    paramBundle.fLh.fLj = i;
    paramBundle.fLh.extras = ((Bundle)localObject);
    com.tencent.mm.sdk.b.a.uLm.m(paramBundle);
    w.i("MicroMsg.FaceTransparentStubUI", "hy: start face detect event result: %b", new Object[] { Boolean.valueOf(paramBundle.fLi.fLk) });
    if (!paramBundle.fLi.fLk)
    {
      if (paramBundle.fLi.extras == null) {
        break label187;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtras(paramBundle.fLi.extras);
      setResult(1, (Intent)localObject);
    }
    for (;;)
    {
      finish();
      GMTrace.o(14529471709184L, 108253);
      return;
      label187:
      setResult(1);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/facedetect/ui/FaceTransparentStubUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */