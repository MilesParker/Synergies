package edu.osu.synergies.simple.model1;

import org.ascape.model.space.SpatialTemporalException;
import org.ascape.util.sweep.SweepDimension;
import org.ascape.util.sweep.SweepGroup;
import org.ascape.util.sweep.SweepLink;
import org.ascape.view.nonvis.SweepControlView;

public class SimpleResourcesSweep extends SimpleResources {
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
