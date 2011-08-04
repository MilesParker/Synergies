            window.onload = function () {
                var r = Raphael("holder", 850, 510),
                    e = [],
                    clr = [],
                    
                    values = ["Learner Learning Interest","Learner Resource Engagements","Learner Not Interested Engagement","Learner Seeking Resource Engagement","Learner Found Resource Engagement","Learning Resources Population","Resource Interactions Population","Resource Interaction Strength","Homes Population","Learners Population"],
                    
                    clr = [Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1),Raphael.getColor(1)],
                    paths = [["M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 454 L266 453 L533 452"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 454 L266 454 L533 453"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 454 L266 453 L533 453"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 454 L266 454 L533 453"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 455 L266 454 L533 453"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 455 L266 454 L533 453"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 454 L266 453 L533 452"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 455 L266 454 L533 454"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 455 L266 454 L533 453"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 454 L266 453 L533 452"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 454 L266 453 L533 452"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 455 L266 454 L533 454"
,"M0 459 L266 459 L533 459"
],["M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 453"
,"M0 438 L266 410 L533 377"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 456 L533 453"
,"M0 445 L266 432 L533 414"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 455 L533 453"
,"M0 442 L266 426 L533 404"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 455 L533 454"
,"M0 451 L266 438 L533 423"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 455 L533 453"
,"M0 449 L266 435 L533 415"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 455 L533 453"
,"M0 446 L266 430 L533 406"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 441 L266 419 L533 386"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 450 L266 442 L533 427"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 453"
,"M0 444 L266 425 L533 400"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 459 L266 457 L533 455"
,"M0 449 L266 427 L533 400"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 444 L266 423 L533 394"
,"M0 459 L266 459 L533 459"
,"M0 440 L266 440 L533 440"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 450 L266 438 L533 425"
,"M0 459 L266 459 L533 459"
],["M0 442 L266 444 L533 443"
,"M0 442 L266 441 L533 442"
,"M0 441 L266 442 L533 442"
,"M0 441 L266 441 L533 442"
,"M0 441 L266 442 L533 442"
,"M0 440 L266 441 L533 442"
,"M0 442 L266 443 L533 444"
,"M0 441 L266 441 L533 441"
,"M0 441 L266 442 L533 442"
,"M0 441 L266 442 L533 444"
,"M0 441 L266 443 L533 443"
,"M0 440 L266 441 L533 442"
],["M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 460 L266 459 L533 459"
,"M0 460 L266 460 L533 459"
,"M0 460 L266 460 L533 459"
,"M0 460 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 460"
,"M0 460 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 459 L266 459 L533 459"
,"M0 460 L266 459 L533 459"
],["M0 457 L266 456 L533 457"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 459 L266 458 L533 458"
,"M0 458 L266 458 L533 457"
,"M0 459 L266 458 L533 457"
,"M0 458 L266 456 L533 457"
,"M0 459 L266 459 L533 458"
,"M0 458 L266 458 L533 457"
,"M0 459 L266 458 L533 456"
,"M0 458 L266 457 L533 457"
,"M0 459 L266 459 L533 458"
],["M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
,"M0 458 L266 458 L533 458"
],["M0 453 L266 452 L533 451"
,"M0 446 L266 444 L533 443"
,"M0 438 L266 437 L533 436"
,"M0 432 L266 431 L533 431"
,"M0 426 L266 424 L533 424"
,"M0 418 L266 416 L533 415"
,"M0 408 L266 407 L533 406"
,"M0 403 L266 402 L533 401"
,"M0 395 L266 394 L533 392"
,"M0 386 L266 384 L533 384"
,"M0 378 L266 377 L533 376"
,"M0 372 L266 371 L533 371"
],["M0 453 L266 452 L533 451"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 453"
,"M0 438 L266 410 L533 377"
,"M0 459 L266 458 L533 458"
,"M0 446 L266 444 L533 443"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 456 L533 453"
,"M0 445 L266 432 L533 414"
,"M0 459 L266 459 L533 459"
,"M0 438 L266 437 L533 436"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 455 L533 453"
,"M0 442 L266 426 L533 404"
,"M0 459 L266 459 L533 459"
,"M0 432 L266 431 L533 431"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 455 L533 454"
,"M0 451 L266 438 L533 423"
,"M0 459 L266 459 L533 459"
,"M0 426 L266 424 L533 424"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 449 L266 435 L533 415"
,"M0 459 L266 459 L533 459"
,"M0 418 L266 416 L533 415"
,"M0 460 L266 460 L533 460"
,"M0 457 L266 455 L533 453"
,"M0 446 L266 430 L533 406"
,"M0 459 L266 459 L533 459"
,"M0 408 L266 407 L533 406"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 441 L266 419 L533 386"
,"M0 459 L266 459 L533 459"
,"M0 403 L266 402 L533 401"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 450 L266 442 L533 427"
,"M0 459 L266 459 L533 459"
,"M0 395 L266 394 L533 392"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 453"
,"M0 444 L266 425 L533 400"
,"M0 459 L266 459 L533 459"
,"M0 386 L266 384 L533 384"
,"M0 460 L266 460 L533 460"
,"M0 459 L266 457 L533 455"
,"M0 449 L266 427 L533 400"
,"M0 459 L266 459 L533 459"
,"M0 378 L266 377 L533 376"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 444 L266 423 L533 394"
,"M0 459 L266 459 L533 459"
,"M0 372 L266 371 L533 371"
,"M0 460 L266 460 L533 460"
,"M0 458 L266 456 L533 454"
,"M0 450 L266 438 L533 425"
,"M0 459 L266 459 L533 459"
],["M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
,"M0 450 L266 450 L533 450"
],["M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
,"M0 440 L266 440 L533 440"
]]
                    labelResourceEfficacyMinimum=r.text(0,10, "Resource Efficacy Minimum").attr({'text-anchor': "start", stroke: '#1414F1', 'font': "400 9px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"});

                    butResourceEfficacyMinimumAll=r.set();
                    butResourceEfficacyMinimumAll.push(
	                    r.rect(0,25,140,20).attr({fill: "#1414F1", stroke: "black", "stroke-width": "0px"}),
	                    r.text(135,35, "All").attr({'text-anchor': "end", stroke: 'white', 'font': "400 12px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"})
                    );
                    butResourceEfficacyMinimumAll.mouseover(function(event) {
	                    butResourceEfficacyMinimumAll.attr({fill: "#1414F1"});
	                });
                    butResourceEfficacyMinimumAll.mouseout(function(event) {
                    	if (selResourceEfficacyMinimum[0]) {
		                    butResourceEfficacyMinimumAll.attr({fill: "#1414F1", stroke: "white"});
	                    } else {
		                    butResourceEfficacyMinimumAll.attr({fill: "#F1F1F1", stroke: "black"});
	                    }
	                });
                    butResourceEfficacyMinimumAll.click(function(event) {
	                    butResourceEfficacyMinimumAll.attr({fill: "#1414F1", stroke: "white"});
	                    butResourceEfficacyMinimum001.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMinimum002.attr({fill: "#F1F1F1", stroke: "black"});
	                    selResourceEfficacyMinimum=[true,false,false];
	                    updatelines();
					    r.safari();
	                });

                    pathsResourceEfficacyMinimum001=[true,true,true,true,true,true,true,true,true,true,false,false];
                    butResourceEfficacyMinimum001=r.set();
                    boxResourceEfficacyMinimum001=r.rect(0,50,140,20).attr({fill: "#F1F1F1", stroke: "white", "stroke-width": "0px"}),
                    textResourceEfficacyMinimum001=r.text(135,60, "0.01").attr({'text-anchor': "end", stroke: 'black', 'font': "400 12px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"})
                    butResourceEfficacyMinimum001.push(boxResourceEfficacyMinimum001, textResourceEfficacyMinimum001);
                    butResourceEfficacyMinimum001.mouseover(function(event) {
	                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
	                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                });
                    butResourceEfficacyMinimum001.mouseout(function(event) {
                    	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
	                });
                    butResourceEfficacyMinimum001.click(function(event) {
	                    butResourceEfficacyMinimumAll.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMinimum001.attr({fill: "#1414F1", stroke: "white"});
	                    butResourceEfficacyMinimum002.attr({fill: "#F1F1F1", stroke: "black"});
	                    
	                    selResourceEfficacyMinimum=[false,true,false];
	                    updatelines();
					    r.safari();
	                });

                    pathsResourceEfficacyMinimum002=[false,false,false,false,false,false,false,false,false,false,true,true];
                    butResourceEfficacyMinimum002=r.set();
                    boxResourceEfficacyMinimum002=r.rect(0,75,140,20).attr({fill: "#F1F1F1", stroke: "white", "stroke-width": "0px"}),
                    textResourceEfficacyMinimum002=r.text(135,85, "0.02").attr({'text-anchor': "end", stroke: 'black', 'font': "400 12px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"})
                    butResourceEfficacyMinimum002.push(boxResourceEfficacyMinimum002, textResourceEfficacyMinimum002);
                    butResourceEfficacyMinimum002.mouseover(function(event) {
	                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
	                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                });
                    butResourceEfficacyMinimum002.mouseout(function(event) {
                    	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
	                });
                    butResourceEfficacyMinimum002.click(function(event) {
	                    butResourceEfficacyMinimumAll.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMinimum001.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMinimum002.attr({fill: "#1414F1", stroke: "white"});
	                    
	                    selResourceEfficacyMinimum=[false,false,true];
	                    updatelines();
					    r.safari();
	                });
                    selResourceEfficacyMinimum=[true,false,false];
                    labelResourceEfficacyMaximum=r.text(145,10, "Resource Efficacy Maximum").attr({'text-anchor': "start", stroke: '#1414F1', 'font': "400 9px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"});

                    butResourceEfficacyMaximumAll=r.set();
                    butResourceEfficacyMaximumAll.push(
	                    r.rect(145,25,140,20).attr({fill: "#1414F1", stroke: "black", "stroke-width": "0px"}),
	                    r.text(280,35, "All").attr({'text-anchor': "end", stroke: 'white', 'font': "400 12px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"})
                    );
                    butResourceEfficacyMaximumAll.mouseover(function(event) {
	                    butResourceEfficacyMaximumAll.attr({fill: "#1414F1"});
	                });
                    butResourceEfficacyMaximumAll.mouseout(function(event) {
                    	if (selResourceEfficacyMaximum[0]) {
		                    butResourceEfficacyMaximumAll.attr({fill: "#1414F1", stroke: "white"});
	                    } else {
		                    butResourceEfficacyMaximumAll.attr({fill: "#F1F1F1", stroke: "black"});
	                    }
	                });
                    butResourceEfficacyMaximumAll.click(function(event) {
	                    butResourceEfficacyMaximumAll.attr({fill: "#1414F1", stroke: "white"});
	                    butResourceEfficacyMaximum01.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMaximum011.attr({fill: "#F1F1F1", stroke: "black"});
	                    selResourceEfficacyMaximum=[true,false,false];
	                    updatelines();
					    r.safari();
	                });

                    pathsResourceEfficacyMaximum01=[true,true,true,true,true,true,true,true,true,true,false,false];
                    butResourceEfficacyMaximum01=r.set();
                    boxResourceEfficacyMaximum01=r.rect(145,50,140,20).attr({fill: "#F1F1F1", stroke: "white", "stroke-width": "0px"}),
                    textResourceEfficacyMaximum01=r.text(280,60, "0.1").attr({'text-anchor': "end", stroke: 'black', 'font': "400 12px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"})
                    butResourceEfficacyMaximum01.push(boxResourceEfficacyMaximum01, textResourceEfficacyMaximum01);
                    butResourceEfficacyMaximum01.mouseover(function(event) {
	                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
	                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                });
                    butResourceEfficacyMaximum01.mouseout(function(event) {
                    	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
	                });
                    butResourceEfficacyMaximum01.click(function(event) {
	                    butResourceEfficacyMaximumAll.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMaximum01.attr({fill: "#1414F1", stroke: "white"});
	                    butResourceEfficacyMaximum011.attr({fill: "#F1F1F1", stroke: "black"});
	                    
	                    selResourceEfficacyMaximum=[false,true,false];
	                    updatelines();
					    r.safari();
	                });

                    pathsResourceEfficacyMaximum011=[false,false,false,false,false,false,false,false,false,false,true,true];
                    butResourceEfficacyMaximum011=r.set();
                    boxResourceEfficacyMaximum011=r.rect(145,75,140,20).attr({fill: "#F1F1F1", stroke: "white", "stroke-width": "0px"}),
                    textResourceEfficacyMaximum011=r.text(280,85, "0.11").attr({'text-anchor': "end", stroke: 'black', 'font': "400 12px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"})
                    butResourceEfficacyMaximum011.push(boxResourceEfficacyMaximum011, textResourceEfficacyMaximum011);
                    butResourceEfficacyMaximum011.mouseover(function(event) {
	                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
	                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                });
                    butResourceEfficacyMaximum011.mouseout(function(event) {
                    	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
	                });
                    butResourceEfficacyMaximum011.click(function(event) {
	                    butResourceEfficacyMaximumAll.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMaximum01.attr({fill: "#F1F1F1", stroke: "black"});
	                    butResourceEfficacyMaximum011.attr({fill: "#1414F1", stroke: "white"});
	                    
	                    selResourceEfficacyMaximum=[false,false,true];
	                    updatelines();
					    r.safari();
	                });
                    selResourceEfficacyMaximum=[true,false,false];
                    
                    now = 0,
                    bg = r.rect(10, 464, 380, 26, 13).attr({fill: "#666", stroke: "none"}),
                    value = r.text(200, 477, values[now]).attr({'text-anchor': "middle", stroke: 'white', 'font': "400 18px 'Myriad Pro', Helvetica, 'Arial Unicode MS', Arial, sans-serif"}),
                    value.attr({fill: "white"});
                    rightc = r.circle(374, 477, 10).attr({fill: "#fff", stroke: "none"}),
                    right = r.path("M370,472l10,5 -10,5z").attr({fill: "#000"}),
                    leftc = r.circle(25, 477, 10).attr({fill: "#fff", stroke: "none"}),
                    left = r.path("M30,472l-10,5 10,5z").attr({fill: "#000"});
                    c = [],
                    //bg = [],
                    c[0] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[1] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[2] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[3] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[4] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[5] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[6] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[7] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[8] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[9] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[10] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                    c[11] = r.path("M0,0").attr({fill: "none", "stroke-width": 2}),
                c[0].attr({path: paths[0][0], stroke: "gray", opacity: ".5"});
                c[0].mouseover(function(event) {
                    c[0].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[0]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[0]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[0]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[0]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[0].mouseout(function(event) {
                    c[0].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[0]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[0]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[0]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[0]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[1].attr({path: paths[0][1], stroke: "gray", opacity: ".5"});
                c[1].mouseover(function(event) {
                    c[1].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[1]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[1]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[1]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[1]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[1].mouseout(function(event) {
                    c[1].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[1]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[1]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[1]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[1]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[2].attr({path: paths[0][2], stroke: "gray", opacity: ".5"});
                c[2].mouseover(function(event) {
                    c[2].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[2]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[2]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[2]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[2]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[2].mouseout(function(event) {
                    c[2].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[2]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[2]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[2]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[2]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[3].attr({path: paths[0][3], stroke: "gray", opacity: ".5"});
                c[3].mouseover(function(event) {
                    c[3].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[3]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[3]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[3]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[3]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[3].mouseout(function(event) {
                    c[3].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[3]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[3]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[3]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[3]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[4].attr({path: paths[0][4], stroke: "gray", opacity: ".5"});
                c[4].mouseover(function(event) {
                    c[4].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[4]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[4]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[4]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[4]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[4].mouseout(function(event) {
                    c[4].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[4]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[4]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[4]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[4]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[5].attr({path: paths[0][5], stroke: "gray", opacity: ".5"});
                c[5].mouseover(function(event) {
                    c[5].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[5]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[5]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[5]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[5]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[5].mouseout(function(event) {
                    c[5].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[5]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[5]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[5]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[5]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[6].attr({path: paths[0][6], stroke: "gray", opacity: ".5"});
                c[6].mouseover(function(event) {
                    c[6].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[6]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[6]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[6]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[6]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[6].mouseout(function(event) {
                    c[6].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[6]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[6]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[6]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[6]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[7].attr({path: paths[0][7], stroke: "gray", opacity: ".5"});
                c[7].mouseover(function(event) {
                    c[7].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[7]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[7]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[7]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[7]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[7].mouseout(function(event) {
                    c[7].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[7]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[7]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[7]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[7]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[8].attr({path: paths[0][8], stroke: "gray", opacity: ".5"});
                c[8].mouseover(function(event) {
                    c[8].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[8]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[8]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[8]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[8]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[8].mouseout(function(event) {
                    c[8].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[8]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[8]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[8]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[8]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[9].attr({path: paths[0][9], stroke: "gray", opacity: ".5"});
                c[9].mouseover(function(event) {
                    c[9].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[9]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[9]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[9]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[9]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[9].mouseout(function(event) {
                    c[9].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[9]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[9]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[9]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[9]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[10].attr({path: paths[0][10], stroke: "gray", opacity: ".5"});
                c[10].mouseover(function(event) {
                    c[10].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[10]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[10]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[10]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[10]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[10].mouseout(function(event) {
                    c[10].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[10]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[10]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[10]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[10]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                c[11].attr({path: paths[0][11], stroke: "gray", opacity: ".5"});
                c[11].mouseover(function(event) {
                    c[11].attr({stroke: clr[now]});
                    if (pathsResourceEfficacyMinimum001[11]) {
                    	boxResourceEfficacyMinimum001.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMinimum002[11]) {
                    	boxResourceEfficacyMinimum002.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum01[11]) {
                    	boxResourceEfficacyMaximum01.attr({fill: clr[now]});
                    }
                    if (pathsResourceEfficacyMaximum011[11]) {
                    	boxResourceEfficacyMaximum011.attr({fill: clr[now]});
                    }
                });
                c[11].mouseout(function(event) {
                    c[11].attr({stroke: "gray"});
                    if (pathsResourceEfficacyMinimum001[11]) {
	                	if (selResourceEfficacyMinimum[1]) {
		                    boxResourceEfficacyMinimum001.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum001.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum001.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMinimum002[11]) {
	                	if (selResourceEfficacyMinimum[2]) {
		                    boxResourceEfficacyMinimum002.attr({fill: "#1414F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMinimum002.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMinimum002.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum01[11]) {
	                	if (selResourceEfficacyMaximum[1]) {
		                    boxResourceEfficacyMaximum01.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum01.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum01.attr({stroke: "black"});
	                    }
                    }
                    if (pathsResourceEfficacyMaximum011[11]) {
	                	if (selResourceEfficacyMaximum[2]) {
		                    boxResourceEfficacyMaximum011.attr({fill: "#1414F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "white"});
	                    } else {
		                    boxResourceEfficacyMaximum011.attr({fill: "#F1F1F1"});
		                    textResourceEfficacyMaximum011.attr({stroke: "black"});
	                    }
                    }
                });
                var animation = function () {
                    var time = 500;
                    if (now == 10) {
                        now = 0;
                    }
                    if (now == -1) {
                        now = 9;
                    }
                    c[0].animate({path: paths[now][0], stroke: "gray"}, time, "<>");
                    //bg[0].animate({path: paths[now][0] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[1].animate({path: paths[now][1], stroke: "gray"}, time, "<>");
                    //bg[1].animate({path: paths[now][1] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[2].animate({path: paths[now][2], stroke: "gray"}, time, "<>");
                    //bg[2].animate({path: paths[now][2] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[3].animate({path: paths[now][3], stroke: "gray"}, time, "<>");
                    //bg[3].animate({path: paths[now][3] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[4].animate({path: paths[now][4], stroke: "gray"}, time, "<>");
                    //bg[4].animate({path: paths[now][4] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[5].animate({path: paths[now][5], stroke: "gray"}, time, "<>");
                    //bg[5].animate({path: paths[now][5] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[6].animate({path: paths[now][6], stroke: "gray"}, time, "<>");
                    //bg[6].animate({path: paths[now][6] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[7].animate({path: paths[now][7], stroke: "gray"}, time, "<>");
                    //bg[7].animate({path: paths[now][7] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[8].animate({path: paths[now][8], stroke: "gray"}, time, "<>");
                    //bg[8].animate({path: paths[now][8] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[9].animate({path: paths[now][9], stroke: "gray"}, time, "<>");
                    //bg[9].animate({path: paths[now][9] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[10].animate({path: paths[now][10], stroke: "gray"}, time, "<>");
                    //bg[10].animate({path: paths[now][10] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    c[11].animate({path: paths[now][11], stroke: "gray"}, time, "<>");
                    //bg[11].animate({path: paths[now][11] + "L800,460 0,460z", fill: clr[now]}, time, "<>");
                    value.attr({text: values[now]});
                };
                rightc.node.onclick = right.node.onclick = function () {
                    now++;
                    animation();
                };
                leftc.node.onclick = left.node.onclick = function () {
                    now--;
                    animation();
                };
            };
	updatelines = function() {
        for(var i in c) {
        	sel = (selResourceEfficacyMinimum[0] || (selResourceEfficacyMinimum[1] && pathsResourceEfficacyMinimum001[i]) || (selResourceEfficacyMinimum[2] && pathsResourceEfficacyMinimum002[i]))
        	 && (selResourceEfficacyMaximum[0] || (selResourceEfficacyMaximum[1] && pathsResourceEfficacyMaximum01[i]) || (selResourceEfficacyMaximum[2] && pathsResourceEfficacyMaximum011[i]))
        	;
            if (sel) {
		    	c[i].attr({stroke: "#1414F1"});
		    } else {
		    	c[i].attr({stroke: "gray"});
		    }
		}
	}
