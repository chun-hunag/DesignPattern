package main

func main() {
	raster := RasterRenderer{}
	vector := VectorRenderer{}
	circleRaster := NewCircle(&raster, 5)
	circleRaster.Draw()
	circleRaster.Resize(2)
	circleRaster.Draw()

	circleVector := NewCircle(&vector, 5)
	circleVector.Draw()
	circleVector.Resize(2)
	circleVector.Draw()
}
