package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.i;
import java.util.LinkedList;

public class GameDropdownView
  extends TextView
  implements View.OnClickListener, PopupWindow.OnDismissListener
{
  private Context mContext;
  private b mLr;
  private LinkedList<String> mLs;
  private int mLt;
  private int mLu;
  a mLv;
  View mLw;
  private View.OnClickListener mLx;
  
  public GameDropdownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12751623684096L, 95007);
    this.mLt = 0;
    this.mLu = 0;
    this.mLv = null;
    this.mLw = null;
    this.mLx = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12766790287360L, 95120);
        if ((GameDropdownView.a(GameDropdownView.this).getContentView() == null) || (!(GameDropdownView.a(GameDropdownView.this).getContentView() instanceof ViewGroup)))
        {
          GameDropdownView.a(GameDropdownView.this).dismiss();
          GMTrace.o(12766790287360L, 95120);
          return;
        }
        int i = ((ViewGroup)GameDropdownView.a(GameDropdownView.this).getContentView()).indexOfChild(paramAnonymousView);
        GameDropdownView.a(GameDropdownView.this, i);
        GameDropdownView.a(GameDropdownView.this).dismiss();
        GMTrace.o(12766790287360L, 95120);
      }
    };
    this.mContext = paramContext;
    this.mLr = new b(paramContext);
    setOnClickListener(this);
    GMTrace.o(12751623684096L, 95007);
  }
  
  public final void c(LinkedList<String> paramLinkedList, int paramInt)
  {
    GMTrace.i(12752160555008L, 95011);
    if (paramLinkedList.size() == 0)
    {
      GMTrace.o(12752160555008L, 95011);
      return;
    }
    this.mLs = paramLinkedList;
    this.mLu = (paramLinkedList.size() - 1);
    if ((paramInt < 0) || (paramInt > this.mLu)) {}
    LinearLayout localLinearLayout;
    for (this.mLt = 0;; this.mLt = paramInt)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
      localLinearLayout = (LinearLayout)localLayoutInflater.inflate(R.i.cWy, null);
      paramInt = 0;
      while (paramInt < paramLinkedList.size())
      {
        String str = (String)paramLinkedList.get(paramInt);
        TextView localTextView = (TextView)localLayoutInflater.inflate(R.i.cWz, localLinearLayout, false);
        localTextView.setText(str);
        localTextView.setOnClickListener(this.mLx);
        if (paramInt == this.mLt)
        {
          localTextView.setTextColor(this.mContext.getResources().getColor(R.e.aPH));
          setText(str);
        }
        localLinearLayout.addView(localTextView);
        paramInt += 1;
      }
    }
    this.mLr.setContentView(localLinearLayout);
    setVisibility(0);
    GMTrace.o(12752160555008L, 95011);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12751892119552L, 95009);
    if (this.mLr.isShowing())
    {
      this.mLr.dismiss();
      GMTrace.o(12751892119552L, 95009);
      return;
    }
    if (this.mLw == null)
    {
      this.mLr.showAsDropDown(this);
      GMTrace.o(12751892119552L, 95009);
      return;
    }
    this.mLr.showAsDropDown(this.mLw);
    GMTrace.o(12751892119552L, 95009);
  }
  
  public void onDismiss()
  {
    GMTrace.i(12752026337280L, 95010);
    GMTrace.o(12752026337280L, 95010);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12751757901824L, 95008);
    super.onFinishInflate();
    setVisibility(8);
    GMTrace.o(12751757901824L, 95008);
  }
  
  public static abstract interface a
  {
    public abstract void oG(int paramInt);
  }
  
  private static final class b
    extends PopupWindow
  {
    public b(Context paramContext)
    {
      super();
      GMTrace.i(12697265504256L, 94602);
      setWindowLayoutMode(-1, -2);
      setBackgroundDrawable(new BitmapDrawable());
      setFocusable(true);
      setOutsideTouchable(true);
      setTouchInterceptor(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(12660221411328L, 94326);
          if (paramAnonymousMotionEvent.getAction() == 4)
          {
            GameDropdownView.b.this.dismiss();
            GMTrace.o(12660221411328L, 94326);
            return true;
          }
          GMTrace.o(12660221411328L, 94326);
          return false;
        }
      });
      setAnimationStyle(R.a.aLH);
      GMTrace.o(12697265504256L, 94602);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDropdownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */