import NearestPoints
from tkinter import * # Import all definitions from tkinter

RADIUS = 2 # Radius of the point

class NearestPointsGUI:
    def __init__(self):
        self.points = []
        windows = Tk()
        windows.title("Find Nearest Points")

        self.Canvas = Canvas(windows, width = 400, height = 200)
        self.Canvas.pack()

        self.Canvas.bind("<Button-1>", self.addPoint)

        windows.mainloop()

    def addPoint(self, event):
        if not self.isTooCloseToOtherPoints(event.x, event.y):
            self.addThisPoint(event.x, event.y)

    def addThisPoint(self, x, y):

        self.canvas.creat_oval(x - RADIUS, y - RADIUS, x + RADIUS, y + RADIUS)

        self.points.append([x, y])
        if len(self.points) > 2:
            p1, p2 = NearestPoints.NearestPoints(self.points)
            self.canvas.delete("line")
            self.canvas.create_line(self.points[p1][0], self.points[p1][p2], self.points[p2][0], self.points[p2][1], tags = "line")
    
    def isTooCloseToOtherPoints(self, x, y):
        for i in range(len(self.points)):
            if NearestPoints.distance(x, y, self.points[i][0], self.points[i][1]) <= RADIUS + 2:
                return True

        return False
NearestPointsGUI() # Create GUI