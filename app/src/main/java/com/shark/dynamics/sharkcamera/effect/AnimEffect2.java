package com.shark.dynamics.sharkcamera.effect;

import com.shark.dynamics.graphics.renderer.r2d.Sprite;
import com.shark.dynamics.graphics.renderer.r2d.anim.FrameAnimation;
import com.shark.dynamics.graphics.renderer.r2d.bezier.BezierPointGenerator;

import org.joml.Vector2f;
import org.joml.Vector3f;

import java.util.List;

public class AnimEffect2 extends IEffect {

    private FrameAnimation mFrameAnim;

    public AnimEffect2() {

    }

    @Override
    public void init() {

        mFrameAnim = new FrameAnimation("anim/yinghua_1_anim.png", 6, 4);
        mFrameAnim.setPerFrameTime(60);
        mFrameAnim.setRunTime(10000);
        mFrameAnim.scaleTo(2.5f);
        mFrameAnim.translateTo(200, 1300, 0);
        mFrameAnim.setMovable(false);

        mInit = true;
    }

    @Override
    public void render(float delta) {
        if (mFrameAnim != null) {
            mFrameAnim.render(delta);
        }
    }

    @Override
    public void dispose() {
        if (mFrameAnim != null) {
            mFrameAnim.dispose();
        }
    }
}
