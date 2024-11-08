package com.example.nurai.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.nurai.R
import com.example.nurai.databinding.FragmentOnboarding3Binding

class OnboardingFragment_3 : Fragment() {

    private lateinit var _binding: FragmentOnboarding3Binding
    private val binding get() = _binding

    private var selectedView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnboarding3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_3_to_onboardingFragment_4)
        }

        binding.firstFrame.setOnClickListener {
            changeColor(binding.firstFrame, binding.imageView1, binding.textView1)
        }
        binding.secondFrame.setOnClickListener {
            changeColor(binding.secondFrame, binding.imageView2, binding.textView2)
        }
        binding.thirdFrame.setOnClickListener {
            changeColor(binding.thirdFrame, binding.imageView3, binding.textView3)
        }
        binding.fourthFrame.setOnClickListener {
            changeColor(binding.fourthFrame, binding.imageView4, binding.textView4)
        }
    }

    private fun changeColor(frame: View, icon: ImageView, label: TextView) {
        if (selectedView != null && selectedView != frame) {
            resetColor(selectedView!!)
        }

        frame.background = ContextCompat.getDrawable(requireContext(), R.drawable.bg_bt_16_clicked)
        label.setTextColor(ContextCompat.getColor(requireContext(), R.color.primary_blue))
        icon.drawable.setTint(ContextCompat.getColor(requireContext(), R.color.primary_blue))

        selectedView = frame
    }

    private fun resetColor(view: View) {
        when (view.id) {
            binding.firstFrame.id -> {
                binding.firstFrame.background = ContextCompat.getDrawable(requireContext(),
                    R.drawable.bg_bt_16
                )
                binding.textView1.setTextColor(ContextCompat.getColor(requireContext(),
                    R.color.black
                ))
                binding.imageView1.drawable.setTint(ContextCompat.getColor(requireContext(),
                    R.color.border_grey
                ))
            }
            binding.secondFrame.id -> {
                binding.secondFrame.background = ContextCompat.getDrawable(requireContext(),
                    R.drawable.bg_bt_16
                )
                binding.textView2.setTextColor(ContextCompat.getColor(requireContext(),
                    R.color.black
                ))
                binding.imageView2.drawable.setTint(ContextCompat.getColor(requireContext(),
                    R.color.border_grey
                ))
            }
            binding.thirdFrame.id -> {
                binding.thirdFrame.background = ContextCompat.getDrawable(requireContext(),
                    R.drawable.bg_bt_16
                )
                binding.textView3.setTextColor(ContextCompat.getColor(requireContext(),
                    R.color.black
                ))
                binding.imageView3.drawable.setTint(ContextCompat.getColor(requireContext(),
                    R.color.border_grey
                ))
            }
            binding.fourthFrame.id -> {
                binding.fourthFrame.background = ContextCompat.getDrawable(requireContext(),
                    R.drawable.bg_bt_16
                )
                binding.textView4.setTextColor(ContextCompat.getColor(requireContext(),
                    R.color.black
                ))
                binding.imageView4.drawable.setTint(ContextCompat.getColor(requireContext(),
                    R.color.border_grey
                ))
            }
        }
    }
}
