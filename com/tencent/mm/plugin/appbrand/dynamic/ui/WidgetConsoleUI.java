package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.h.a;
import com.tencent.mm.plugin.appbrand.q.a.a;
import com.tencent.mm.plugin.appbrand.q.a.b;
import com.tencent.mm.plugin.appbrand.q.a.c;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class WidgetConsoleUI
  extends MMActivity
  implements h.a
{
  String appId;
  int fBH;
  int iCy;
  EditText iNi;
  Button[] iNj;
  Button iNk;
  Button iNl;
  MRecyclerView iNm;
  a iNn;
  int iNo;
  String iNp;
  final List<LogInfo> iNq;
  String id;
  
  public WidgetConsoleUI()
  {
    GMTrace.i(18324075315200L, 136525);
    this.iNq = new LinkedList();
    GMTrace.o(18324075315200L, 136525);
  }
  
  private boolean Vh()
  {
    GMTrace.i(18324612186112L, 136529);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("id");
    this.appId = localIntent.getStringExtra("app_id");
    this.fBH = localIntent.getIntExtra("pkg_type", 0);
    this.iCy = localIntent.getIntExtra("pkg_version", 0);
    Uk(String.format("(%s)", new Object[] { str }));
    if (bg.mZ(str))
    {
      finish();
      GMTrace.o(18324612186112L, 136529);
      return false;
    }
    if (str.equals(this.id))
    {
      GMTrace.o(18324612186112L, 136529);
      return true;
    }
    this.id = str;
    ((e)com.tencent.mm.kernel.h.h(e.class)).CI().b(this.id, this);
    ((e)com.tencent.mm.kernel.h.h(e.class)).CI().a(str, this);
    GMTrace.o(18324612186112L, 136529);
    return true;
  }
  
  private void bn(int paramInt1, int paramInt2)
  {
    GMTrace.i(18325014839296L, 136532);
    Button localButton = (Button)findViewById(paramInt2);
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18327162322944L, 136548);
        int i = 0;
        if (i < WidgetConsoleUI.this.iNj.length)
        {
          Button localButton = WidgetConsoleUI.this.iNj[i];
          if (localButton == paramAnonymousView) {}
          for (boolean bool = true;; bool = false)
          {
            localButton.setSelected(bool);
            if ((bool) && (WidgetConsoleUI.this.iNo != i))
            {
              WidgetConsoleUI.this.iNo = i;
              WidgetConsoleUI.a(WidgetConsoleUI.this);
            }
            i += 1;
            break;
          }
        }
        GMTrace.o(18327162322944L, 136548);
      }
    });
    this.iNj[paramInt1] = localButton;
    GMTrace.o(18325014839296L, 136532);
  }
  
  private boolean pJ(String paramString)
  {
    GMTrace.i(18325551710208L, 136536);
    if ((!bg.mZ(this.iNp)) && ((paramString == null) || (!paramString.toLowerCase().contains(this.iNp.toLowerCase()))))
    {
      GMTrace.o(18325551710208L, 136536);
      return true;
    }
    GMTrace.o(18325551710208L, 136536);
    return false;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 1;
    GMTrace.i(18324477968384L, 136528);
    View localView;
    if (paramMotionEvent.getAction() == 0)
    {
      localView = getCurrentFocus();
      if ((localView == null) || (!(localView instanceof EditText))) {
        break label171;
      }
      int[] arrayOfInt = new int[2];
      int[] tmp43_41 = arrayOfInt;
      tmp43_41[0] = 0;
      int[] tmp47_43 = tmp43_41;
      tmp47_43[1] = 0;
      tmp47_43;
      localView.getLocationInWindow(arrayOfInt);
      int k = arrayOfInt[0];
      int m = arrayOfInt[1];
      int n = localView.getHeight();
      int i1 = localView.getWidth();
      i = j;
      if (paramMotionEvent.getX() > k)
      {
        i = j;
        if (paramMotionEvent.getX() < i1 + k)
        {
          i = j;
          if (paramMotionEvent.getY() > m) {
            if (paramMotionEvent.getY() < n + m) {
              break label171;
            }
          }
        }
      }
    }
    label171:
    for (int i = j;; i = 0)
    {
      if (i != 0) {
        da(localView);
      }
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(18324477968384L, 136528);
      return bool;
    }
  }
  
  public void finish()
  {
    GMTrace.i(18324880621568L, 136531);
    if ((isFinishing()) || (this.vox))
    {
      GMTrace.o(18324880621568L, 136531);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      finishAndRemoveTask();
    }
    for (;;)
    {
      TypedArray localTypedArray = obtainStyledAttributes(16973825, new int[] { 16842938, 16842939 });
      int i = localTypedArray.getResourceId(0, 0);
      int j = localTypedArray.getResourceId(1, 0);
      localTypedArray.recycle();
      overridePendingTransition(i, j);
      GMTrace.o(18324880621568L, 136531);
      return;
      super.finish();
    }
  }
  
  public final void fy(int paramInt)
  {
    GMTrace.i(18325283274752L, 136534);
    final String str;
    switch (paramInt)
    {
    default: 
      str = "";
    }
    for (;;)
    {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18323941097472L, 136524);
          WidgetConsoleUI.this.rV(String.format("%s%s", new Object[] { WidgetConsoleUI.this.getString(a.c.jKm), str }));
          Toast.makeText(WidgetConsoleUI.this, String.format("%s%s", new Object[] { WidgetConsoleUI.this.id, str }), 1).show();
          GMTrace.o(18323941097472L, 136524);
        }
      });
      GMTrace.o(18325283274752L, 136534);
      return;
      str = "(PAUSE)";
      continue;
      str = "(RESUME)";
      continue;
      str = "(START)";
      continue;
      str = "(STOP)";
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18325149057024L, 136533);
    int i = a.b.jKi;
    GMTrace.o(18325149057024L, 136533);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18324209532928L, 136526);
    super.onCreate(paramBundle);
    if (!Vh())
    {
      GMTrace.o(18324209532928L, 136526);
      return;
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18319243476992L, 136489);
        WidgetConsoleUI.this.finish();
        GMTrace.o(18319243476992L, 136489);
        return false;
      }
    });
    oC(a.c.jKm);
    this.iNi = ((EditText)findViewById(a.a.jJK));
    this.iNi.clearFocus();
    this.iNj = new Button[5];
    bn(0, a.a.jJR);
    bn(1, a.a.jJU);
    bn(2, a.a.jJT);
    bn(3, a.a.jJW);
    bn(4, a.a.jJS);
    this.iNj[0].setSelected(true);
    this.iNo = 0;
    this.iNk = ((Button)findViewById(a.a.jJG));
    this.iNl = ((Button)findViewById(a.a.jKe));
    this.iNl.setEnabled(false);
    this.iNk.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18326625452032L, 136544);
        WidgetConsoleUI.this.iNq.clear();
        WidgetConsoleUI.this.iNn.iNq.clear();
        WidgetConsoleUI.this.iNn.TY.notifyChanged();
        GMTrace.o(18326625452032L, 136544);
      }
    });
    this.iNl.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18328772935680L, 136560);
        GMTrace.o(18328772935680L, 136560);
      }
    });
    this.iNi.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(18321793613824L, 136508);
        GMTrace.o(18321793613824L, 136508);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(18321525178368L, 136506);
        GMTrace.o(18321525178368L, 136506);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(18321659396096L, 136507);
        GMTrace.o(18321659396096L, 136507);
      }
    });
    this.iNi.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(18329041371136L, 136562);
        if (paramAnonymousInt == 66)
        {
          WidgetConsoleUI.this.iNp = WidgetConsoleUI.this.iNi.getText().toString();
          WidgetConsoleUI.a(WidgetConsoleUI.this);
          WidgetConsoleUI.this.da(paramAnonymousView);
          GMTrace.o(18329041371136L, 136562);
          return true;
        }
        GMTrace.o(18329041371136L, 136562);
        return false;
      }
    });
    this.iNi.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(18327430758400L, 136550);
        if (!paramAnonymousBoolean) {
          WidgetConsoleUI.this.da(paramAnonymousView);
        }
        GMTrace.o(18327430758400L, 136550);
      }
    });
    findViewById(a.a.jJL).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18329578242048L, 136566);
        WidgetConsoleUI.this.iNp = WidgetConsoleUI.this.iNi.getText().toString();
        WidgetConsoleUI.a(WidgetConsoleUI.this);
        GMTrace.o(18329578242048L, 136566);
      }
    });
    this.vov.iiK.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18329309806592L, 136564);
        WidgetConsoleUI.this.da(paramAnonymousView);
        GMTrace.o(18329309806592L, 136564);
        return false;
      }
    });
    this.iNm = ((MRecyclerView)findViewById(a.a.jJV));
    this.iNn = new a(this);
    this.iNm.a(new LinearLayoutManager());
    this.iNm.a(null);
    this.iNm.a(this.iNn);
    ((e)com.tencent.mm.kernel.h.h(e.class)).CI().a(this.id, this);
    GMTrace.o(18324209532928L, 136526);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(18324746403840L, 136530);
    super.onDestroy();
    ((e)com.tencent.mm.kernel.h.h(e.class)).CI().b(this.id, this);
    GMTrace.o(18324746403840L, 136530);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(18324343750656L, 136527);
    super.onNewIntent(paramIntent);
    if (!Vh())
    {
      GMTrace.o(18324343750656L, 136527);
      return;
    }
    GMTrace.o(18324343750656L, 136527);
  }
  
  public final void z(List<LogInfo> paramList)
  {
    GMTrace.i(18325417492480L, 136535);
    if (paramList == null)
    {
      GMTrace.o(18325417492480L, 136535);
      return;
    }
    final LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < paramList.size())
    {
      LogInfo localLogInfo = (LogInfo)paramList.get(i);
      this.iNq.add(localLogInfo);
      if (((localLogInfo.level == this.iNo) || (this.iNo == 0)) && (!pJ(localLogInfo.message))) {
        localLinkedList.add(localLogInfo);
      }
      i += 1;
    }
    if (!localLinkedList.isEmpty()) {
      runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18320048783360L, 136495);
          int i = WidgetConsoleUI.this.iNn.getItemCount();
          WidgetConsoleUI.this.iNn.iNq.addAll(localLinkedList);
          WidgetConsoleUI.this.iNn.Q(i, localLinkedList.size());
          if (((LinearLayoutManager)WidgetConsoleUI.this.iNm.Tc).fb() == i - 1) {
            WidgetConsoleUI.this.iNm.smoothScrollToPosition(WidgetConsoleUI.this.iNn.getItemCount() - 1);
          }
          GMTrace.o(18320048783360L, 136495);
        }
      });
    }
    GMTrace.o(18325417492480L, 136535);
  }
  
  private static final class a
    extends RecyclerView.a
  {
    public static final SimpleDateFormat iNu;
    LayoutInflater CO;
    List<LogInfo> iNq;
    
    static
    {
      GMTrace.i(18323135791104L, 136518);
      iNu = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
      GMTrace.o(18323135791104L, 136518);
    }
    
    a(Context paramContext)
    {
      GMTrace.i(18322464702464L, 136513);
      this.CO = LayoutInflater.from(paramContext);
      this.iNq = new LinkedList();
      GMTrace.o(18322464702464L, 136513);
    }
    
    public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(18322598920192L, 136514);
      paramViewGroup = new a(this.CO.inflate(a.b.jKh, paramViewGroup, false), paramInt);
      GMTrace.o(18322598920192L, 136514);
      return paramViewGroup;
    }
    
    public final void a(RecyclerView.t paramt, int paramInt)
    {
      GMTrace.i(18322733137920L, 136515);
      LogInfo localLogInfo = (LogInfo)this.iNq.get(paramInt);
      ((a)paramt).inT.setText(String.format("[%s] %s", new Object[] { iNu.format(new Date(localLogInfo.hjv)), localLogInfo.message }));
      GMTrace.o(18322733137920L, 136515);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(18322867355648L, 136516);
      int i = this.iNq.size();
      GMTrace.o(18322867355648L, 136516);
      return i;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(18323001573376L, 136517);
      paramInt = ((LogInfo)this.iNq.get(paramInt)).level;
      GMTrace.o(18323001573376L, 136517);
      return paramInt;
    }
    
    private static final class a
      extends RecyclerView.t
    {
      TextView iNv;
      TextView inT;
      
      public a(View paramView, int paramInt)
      {
        super();
        GMTrace.i(18320183001088L, 136496);
        this.iNv = ((TextView)paramView.findViewById(a.a.jJQ));
        this.inT = ((TextView)paramView.findViewById(a.a.bze));
        switch (paramInt)
        {
        default: 
          this.iNv.setText("L");
          this.inT.setTextColor(-7829368);
          GMTrace.o(18320183001088L, 136496);
          return;
        case 1: 
          this.iNv.setText("L");
          this.inT.setTextColor(-7829368);
          GMTrace.o(18320183001088L, 136496);
          return;
        case 2: 
          this.iNv.setText("I");
          this.inT.setTextColor(-16777216);
          GMTrace.o(18320183001088L, 136496);
          return;
        case 3: 
          this.iNv.setText("W");
          this.inT.setTextColor(Color.rgb(0, 0, 204));
          GMTrace.o(18320183001088L, 136496);
          return;
        }
        this.iNv.setText("E");
        this.inT.setTextColor(-65536);
        GMTrace.o(18320183001088L, 136496);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/ui/WidgetConsoleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */