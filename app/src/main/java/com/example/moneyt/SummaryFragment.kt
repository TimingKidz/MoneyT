package com.example.moneyt


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.PercentFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import android.R.id
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SummaryFragment : Fragment() {

    var cost = arrayOf<Float>(20F,30F,50F,80F)
    var cata = arrayOf<String>("food", "electric", "car", "other")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //(activity as AppCompatActivity).supportActionBar?.title = "Summary"
        val view = inflater.inflate(R.layout.fragment_summary, container, false)
        var c = view.findViewById<PieChart>(R.id.chart)
        setPieChart(c)
        return view
    }

    private fun setPieChart(chart: PieChart) {
        // List of PieEntry
        var pieEntries = ArrayList<PieEntry>()
        for (i in 0 until cost.size){
            pieEntries.add(PieEntry(cost[i], cata[i]))
        }

        val dataSet = PieDataSet(pieEntries, "Summary").apply {
            setSelectionShift(10F)
            setValueTextSize(14F)
            //setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
            //setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
            setValueFormatter(PercentFormatter(chart))
            val colors = ArrayList<Int>()
            for (c in ColorTemplate.MATERIAL_COLORS)
                colors.add(c)
            setColors(colors)
        }
        var data = PieData(dataSet)

        // Get chart
        chart.setUsePercentValues(true);
        chart.setData(data)
        chart.animateY(1000)
        chart.invalidate()
    }

}
