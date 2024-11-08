package com.example.nurai.health

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.nurai.R
import com.example.nurai.databinding.FragmentHealthBinding

class HealthFragment : Fragment() {

    private var _binding: FragmentHealthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHealthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        binding.bottomNav.ivHome.setOnClickListener {
            findNavController().navigate(R.id.action_healthFragment_to_homeFragment)
        }
        binding.bottomNav.ivPsychology.setOnClickListener {
            findNavController().navigate(R.id.action_healthFragment_to_psychologyFragment)
        }
        binding.bottomNav.ivTutor.setOnClickListener {
            findNavController().navigate(R.id.action_healthFragment_to_tutorFragment)
        }
        binding.ivAddLekarstvo.setOnClickListener {
            LecarstvoDialog().show(parentFragmentManager, "LecarstvoDialog")
        }
        binding.ivAddVstrechi.setOnClickListener {
            EnvelopeFragment().show(parentFragmentManager, "EnvelopeFragment")
        }

    }

    private fun initUI() {
        binding.bottomNav.tvHome.setTextColor(ContextCompat.getColor(requireContext(),
            R.color.white
        ))
        binding.bottomNav.tvHealth.setTextColor(ContextCompat.getColor(requireContext(),
            R.color.primary_blue
        ))
        binding.bottomNav.tvPsychology.setTextColor(ContextCompat.getColor(requireContext(),
            R.color.white
        ))
        binding.bottomNav.tvTutor.setTextColor(ContextCompat.getColor(requireContext(),
            R.color.white
        ))
        binding.bottomNav.ivHome.setImageResource(R.drawable.ic_home)
        binding.bottomNav.ivHealth.setImageResource(R.drawable.ic_health_clicked)
        binding.bottomNav.ivPsychology.setImageResource(R.drawable.ic_psychology)
        binding.bottomNav.ivTutor.setImageResource(R.drawable.ic_tutor)
    }


}