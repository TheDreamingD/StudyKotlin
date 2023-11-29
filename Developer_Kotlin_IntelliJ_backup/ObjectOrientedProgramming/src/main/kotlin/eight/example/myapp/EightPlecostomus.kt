package eight.example.myapp

class EightPlecostomus(fishColor: EightFishColor = EightGoldColor) :
    EightFishAction by EightPrintingFishAction("eat algae"),
    EightFishColor by fishColor