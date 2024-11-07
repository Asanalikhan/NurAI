package com.example.nurai

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.nurai.databinding.FragmentPsychologyBinding

class PsychologyFragment : Fragment() {

    private lateinit var _binding: FragmentPsychologyBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPsychologyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        binding.bottomNav.ivHome.setOnClickListener {
            findNavController().navigate(R.id.action_psychologyFragment_to_homeFragment)
        }
        binding.bottomNav.ivHealth.setOnClickListener {
            findNavController().navigate(R.id.action_psychologyFragment_to_healthFragment)
        }
        binding.bottomNav.ivTutor.setOnClickListener {
            findNavController().navigate(R.id.action_psychologyFragment_to_tutorFragment)
        }
    }



    private fun initUI() {
        binding.bottomNav.tvHome.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        binding.bottomNav.tvHealth.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        binding.bottomNav.tvPsychology.setTextColor(ContextCompat.getColor(requireContext(), R.color.primary_blue))
        binding.bottomNav.tvTutor.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
        binding.bottomNav.ivHome.setImageResource(R.drawable.ic_home)
        binding.bottomNav.ivHealth.setImageResource(R.drawable.ic_health)
        binding.bottomNav.ivPsychology.setImageResource(R.drawable.ic_psychology_clicked)
        binding.bottomNav.ivTutor.setImageResource(R.drawable.ic_tutor)
    }

}