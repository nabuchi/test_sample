package net.nabnet.test_sample

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.beans.factory.annotation.Value

@RunWith(SpringRunner::class)
@SpringBootTest
class TestSampleApplicationTests {
	@Value("\${url}")
	lateinit var url: String

	@Test
	fun testSample() {
		throw RuntimeException(url)
	}

}

