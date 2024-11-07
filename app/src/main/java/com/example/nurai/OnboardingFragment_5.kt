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
import com.example.nurai.databinding.FragmentOnboarding5Binding

class OnboardingFragment_5 : Fragment() {
    private lateinit var _binding: FragmentOnboarding5Binding
    private val binding get() = _binding

    private val selectedFrames = mutableMapOf<View, Boolean>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnboarding5Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_5_to_onboardingFragment_6)
        }
        binding.skipButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_5_to_onboardingFragment_6)
        }

        binding.firstFrame.setOnClickListener {
            toggleColor(binding.firstFrame, binding.firstCheck, binding.firstText)
        }
        binding.secondFrame.setOnClickListener {
            toggleColor(binding.secondFrame, binding.secondCheck, binding.secondText)
        }
        binding.thirdFrame.setOnClickListener {
            toggleColor(binding.thirdFrame, binding.thirdCheck, binding.thirdText)
        }
    }

    private fun toggleColor(frame: View, icon: ImageView, label: TextView) {
        val isSelected = selectedFrames[frame] ?: false

        if (isSelected) {
            frame.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_bt_16)
            label.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
            icon.visibility = View.INVISIBLE
            selectedFrames[frame] = false
        } else {
            frame.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_bt_16_clicked)
            label.setTextColor(ContextCompat.getColor(requireContext(), R.color.primary_blue))
            icon.visibility = View.VISIBLE
            selectedFrames[frame] = true
        }
    }
}
