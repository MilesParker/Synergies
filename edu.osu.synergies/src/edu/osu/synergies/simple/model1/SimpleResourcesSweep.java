package edu.osu.synergies.simple.model1;

import org.ascape.model.Agent;
import org.ascape.model.Scape;
import org.ascape.model.space.SpatialTemporalException;
import org.ascape.util.data.UnitIntervalDataPoint;
import org.ascape.util.sweep.SweepDimension;
import org.ascape.util.sweep.SweepGroup;
import org.ascape.util.sweep.SweepLink;
import org.ascape.util.vis.ColorFeature;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.ascape.util.vis.ColorFeatureGradiated;
import org.ascape.util.vis.ColorFeatureGradiatedIndex;
import org.ascape.view.nonvis.SweepControlView;
import org.ascape.view.vis.GEFView;
import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;

public class SimpleResourcesSweep extends SimpleResources implements
IGraphicsAdapted {
    public void createViews() {
        //super.createViews();
        SweepControlView sv = new SweepControlView();
        SweepGroup sweep = sv.getSweepGroup();

        sweep.addMember(new SweepDimension(this, "LearningResourceCount", 8, 12, 2));

         SweepLink exposurePeriod = new SweepLink();
         exposurePeriod.addMember(new SweepDimension(this, "ResourceEfficacyMinimum", .01, .05, .01));
         exposurePeriod.addMember(new SweepDimension(this, "ResourceEfficacyMaximum", .10, .15, .01));
         sweep.addMember(exposurePeriod);

        sweep.setRunsPer(10);
        try {
            setStopPeriod(3000);
        } catch (SpatialTemporalException e) {
            e.printStackTrace();
        }
        addView(sv);
    }
}
